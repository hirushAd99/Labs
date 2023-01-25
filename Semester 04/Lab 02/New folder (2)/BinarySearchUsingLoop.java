public class BinarySearchUsingLoop {
    public static int binarySearch(long searchKey,int[] numberArray) // Binary search method.
    {
        int lowerBoundOfSearch = 0;    // Lower bound define and assign.
        int upperBoundOfSearch = numberArray.length-1; // Upper bound define and assign.
        int checkingIndex = 0;  // Checking index define and assign as 0.
        while(true)  // While condition runs true.
        {
            checkingIndex = (lowerBoundOfSearch+upperBoundOfSearch)/2; // Setting middle index for searching element.
            if(numberArray[checkingIndex] == searchKey)   // Check the middle element equal to search element.
            {
                return  checkingIndex;      // Return the index after equal.
            }
            else if(lowerBoundOfSearch > upperBoundOfSearch)
            {
                return numberArray.length-1;
            }
            else           // If upper conditions are not true.
            {
                if(numberArray[checkingIndex] < searchKey)     // Check search element less than the arrays checkingIndex element.
                {
                    lowerBoundOfSearch = checkingIndex + 1;    // If it true search element at right side so move to right side.
                }
                else
                {
                    upperBoundOfSearch = checkingIndex -1;     // If not search element is less so element is at left side.
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] numberArray = {3,56,32,33,45,90,190,564,908};  // Define sorted array for searching element.
        int n = binarySearch(190, numberArray);      // Calling the binarySearch method.
        System.out.println("Index is : " + n);               // Print the index of searched element.
    }
}
