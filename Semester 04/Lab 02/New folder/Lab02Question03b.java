public class Lab02Question03b {
    public static int partition(int[] sortingArray, int lowerBoundIndex, int upperBoundIndex)
    {
        int pivotElement = sortingArray[lowerBoundIndex];
        int startingIndex = lowerBoundIndex;
        int endingIndex = upperBoundIndex;
        while(startingIndex < endingIndex)
        {
            while(sortingArray[startingIndex] <= pivotElement)
            {
                startingIndex++;
            }
            while (sortingArray[endingIndex] > pivotElement)
            {
                endingIndex--;
            }
            if(startingIndex < endingIndex)
            {
                swapElements(sortingArray,startingIndex,endingIndex);
            }
        }
        swapElements(sortingArray,startingIndex,endingIndex );
        return endingIndex;
    }
    public static void swapElements(int[] sortingArray , int swapIndex01, int swapIndex02)
    {
        int tempValue = sortingArray[swapIndex01];
        sortingArray[swapIndex01] = sortingArray[swapIndex02];
        sortingArray[swapIndex02] = tempValue;
    }

    public static void quickSort(int[] sortingArray, int lowerBoundIndex, int upperBoundIndex)
    {
        if(lowerBoundIndex < upperBoundIndex)
        {
            int tempValue = partition(sortingArray,lowerBoundIndex,upperBoundIndex);
            quickSort(sortingArray,lowerBoundIndex,lowerBoundIndex-1);
            quickSort(sortingArray,lowerBoundIndex+1,upperBoundIndex);
        }
    }

    public static void main(String[] args) {
        int[] sortingArray = new int[8];
        sortingArray[0] = 12;
        sortingArray[1] = 69;
        sortingArray[2] = 3;
        sortingArray[3] = 14;
        sortingArray[4] = 8;
        sortingArray[5] = 18;
        sortingArray[6] = 89;
        sortingArray[7] = 65;
        partition(sortingArray,0,7);
        quickSort(sortingArray,0,7);
        for(int i =0; i < sortingArray.length; i++)
        {
            System.out.println(sortingArray[i]);
        }
    }
}
