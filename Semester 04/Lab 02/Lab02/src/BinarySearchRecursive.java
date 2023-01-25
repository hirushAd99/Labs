public class BinarySearchRecursive {
    // Binary searching method.
    public static int binarySearch(int searchNumber , int[] numberArray , int upperBoundIndex , int lowerBoundIndex)
    {
        int middleIndex = (upperBoundIndex + lowerBoundIndex)/2;  // Define middleIndex according to passed values.
        int upperBoundIndexN;       // Define new variable.
        int lowerBoundIndexN;
        if(searchNumber == numberArray[middleIndex])  // Check the search element equal to middle index's element.
        {
            System.out.println("Index of " + searchNumber + " : " + middleIndex);  // If true that will print and exit the code.
            return middleIndex;
        }
        else if(searchNumber < numberArray[middleIndex])   // If searchNumber less than middleIndex's element that element should at left side of array.
        {
            upperBoundIndexN = 0;                 // Define variable according to the identification of element value.
            lowerBoundIndexN = middleIndex;
            return (binarySearch(searchNumber, numberArray, upperBoundIndexN, lowerBoundIndexN));   // Recall the method.
        }
	
	    else if(searchNumber == numberArray[numberArray.length-1])
        {
            System.out.println("Index : " + upperBoundIndex);
        }

        else if(searchNumber > numberArray[middleIndex])   // If searchNumber higher than middleIndex's element that element should at right side of array.
        {
            upperBoundIndexN = middleIndex;   // Define variable according to the identification of element value.
            lowerBoundIndexN = numberArray.length-1;
            return (binarySearch(searchNumber, numberArray, upperBoundIndexN, lowerBoundIndexN));   // Recall the method.
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numberArray = {10,23,35,45,51,69,78,89,95,100};       // Define the sorted array for searching.
        binarySearch(35, numberArray, numberArray.length-1, 0);  // Calling binarySearch method.
    }
}
