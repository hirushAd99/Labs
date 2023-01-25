public class Lab02Question02b {
    public static int binarySearch(int searchNumber , int[] numberArray , int upperBoundIndex , int lowerBoundIndex)
    {
        int middleIndex = (upperBoundIndex + lowerBoundIndex)/2;
        int upperBoundIndexN;
        int lowerBoundIndexN;
        if(searchNumber == numberArray[middleIndex])
        {
            System.out.println("Index of " + searchNumber + " : " + middleIndex);
            return middleIndex;
        }
        else if(searchNumber < numberArray[middleIndex])
        {
            upperBoundIndexN = 0;
            lowerBoundIndexN = middleIndex;
            return (binarySearch(searchNumber, numberArray, upperBoundIndexN, lowerBoundIndexN));
        }
	
	else if(searchNumber == numberArray[numberArray.length-1])
        {
            System.out.println("Index : " + upperBoundIndex);
        }

        else if(searchNumber > numberArray[middleIndex])
        {
            upperBoundIndexN = middleIndex;
            lowerBoundIndexN = numberArray.length-1;
            return (binarySearch(searchNumber, numberArray, upperBoundIndexN, lowerBoundIndexN));
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numberArray = {10,23,35,45,51,69,78,89,95,100};
        binarySearch(35, numberArray, numberArray.length-1, 0);
    }
}
