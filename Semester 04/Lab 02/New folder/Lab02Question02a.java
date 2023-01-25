public class Lab02Question02a {
    public static int binarySearch(long searchKey,int[] numberArray)
    {
        int lowerBoundOfSearch = 0;
        int upperBoundOfSearch = numberArray.length-1;
        int checkingIndex = 0;
        while(true)
        {
            checkingIndex = (lowerBoundOfSearch+upperBoundOfSearch)/2;
            if(numberArray[checkingIndex] == searchKey)
            {
                return  checkingIndex;
            }
            else if(lowerBoundOfSearch > upperBoundOfSearch)
            {
                return numberArray.length-1;
            }
            else
            {
                if(numberArray[checkingIndex] < searchKey)
                {
                    lowerBoundOfSearch = checkingIndex + 1;
                }
                else
                {
                    upperBoundOfSearch = checkingIndex -1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] numberArray = {3,56,32,33,45,90,190,564,908};
        int n = binarySearch(190, numberArray);
        System.out.println("Index is : " + n);
    }
}
