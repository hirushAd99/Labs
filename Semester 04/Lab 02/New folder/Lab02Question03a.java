public class Lab02Question03a {
    public static void mergeSort(int[] sortingArray, int[] sortedArray, int upperBoundIndex , int lowerBoundIndex)
    {
        if(upperBoundIndex == lowerBoundIndex) // Check whether index is 1.
        {
            return;
        }
        else
        {
            int middleIndex = (upperBoundIndex - lowerBoundIndex)/2; // Middle index of sorting array.
            mergeSort(sortingArray,sortedArray,middleIndex, lowerBoundIndex);    // For sorting lower half of array.
            mergeSort(sortingArray,sortedArray,upperBoundIndex,middleIndex+1);  // For sorting higher half of the array.
            merge(sortingArray,sortedArray,upperBoundIndex,middleIndex,lowerBoundIndex);
        }
    }

    public static void merge(int[] sortingArray,int[] sortedArray, int upperBoundIndex, int middleIndex, int lowerBoundIndex)
    {
        //int [] sortedArray = new int[sortingArray.length];
        int i = lowerBoundIndex;
        int j = middleIndex + 1;
        int k = lowerBoundIndex;
        while((i < middleIndex) && (j <= upperBoundIndex))
        {
            if (sortingArray[i] <= sortingArray[j])
            {
                sortedArray[k] = sortingArray[i];
                i++;
            }
            else
            {
                sortedArray[k] = sortingArray[j];
            }
            k++;
        }
        if(i > middleIndex)
        {
            while (j <= upperBoundIndex)
            {
                sortedArray[k] = sortingArray[j];
                j++;
                k++;
            }
        }
        else
        {
            while (i <= middleIndex)
            {
                sortedArray[k] = sortingArray[i];
                i++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] sortingArray = new int[6];
        int[] sortedArray = new int[6];
        sortingArray[0] = 23;
        sortingArray[1] = 89;
        sortingArray[2] = 99;
        sortingArray[3] = 77;
        sortingArray[4] = 67;
        sortingArray[5] = 88;
        mergeSort(sortingArray,sortedArray,5, 0);
        for(int i = 0; i < sortingArray.length; i++)
        {
            System.out.println(sortingArray[i]);
        }
    }
}
