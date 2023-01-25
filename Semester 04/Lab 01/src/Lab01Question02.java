import java.util.Scanner;        // Importing java scanning library.
public class Lab01Question02 {
    int[] elementArray = new int[20]; // Array defining with 20 elements.
    int indexOne;   // For interchangeElements method variable define.
    int indexTwo;   // For interchangeElements method variable define.
    int indexToPrint;  // For printElement method variable define.
    int indexToDelete; // For deleteElements method variable define.
    int elementValue;  // For insertElement method variable define.
    int insertIndex;   // For insertElement method variable define.
    int searchNumber;  // For searchElement method variable define.
    Scanner scanner = new Scanner(System.in);

    // Part 01
    public void readElements() // Reading elements method.
    {
        for(int i = 0; i <elementArray.length; i++)
        {
            System.out.print("Enter value : ");  // Get value for reading elements from user.
            elementArray[i] = scanner.nextInt(); // Take input value.
        }
    }

    // part 02
    public void printArray()  // Print the array.
    {
        for(int i = 0; i <elementArray.length; i++)
        {
            System.out.print(elementArray[i] );        // Print the element of array.
            if(i < elementArray.length-1)              // Check whether last element or not of array.
            {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }

    // Part 03
    public void interchangeElements(int indexOne,int indexTwo) // Use for inter change values.
    {
        this.indexOne = indexOne;  // Assign value on the class with the value given at method calling value.
        this.indexTwo = indexTwo;  // Assign value on the class with the value given at method calling value.
        int temp = elementArray[indexOne]; // Keep element value in temporary value before replacing.
        elementArray[indexOne] = elementArray[indexTwo]; // Replace value 01 with value 02.
        elementArray[indexTwo] = temp; // Replace value 02 with value 01(temp variable value).
    }

    // Part 04
    public void printElement(int indexToPrint)  // Print the given index's element.
    {
        this.indexToPrint = indexToPrint;  // Assign value on the class with the value given at method calling value.
        System.out.println("Element for "+indexToPrint+ " : " + elementArray[indexToPrint]);
    }

    // Part 05
    public void deleteElement(int indexToDelete)  // Delete the given index's element.
    {
        this.indexToDelete = indexToDelete;  // Assign value on the class with the value given at method calling value.
        elementArray[indexToDelete] = 0;
    }

    // Part 06
    public void insertElement(int elementValue, int insertIndex)  // Use for
    {
        this.elementValue = elementValue;  // Assign value on the class with the value given at method calling value.
        this.insertIndex = insertIndex;    // Assign value on the class with the value given at method calling value.
        elementArray[insertIndex] = elementValue;
    }

    // Part 07
    public void searchElement(int searchNumber)
    {
        this.searchNumber = searchNumber;   // Assign value on the class with the value given at method calling value.
        boolean isEqual = false;            // Check whether condition is true or false.
        for(int j =0; j < elementArray.length; j++)   // Checking the elements of array one by one incrementing.
        {
            if(elementArray[j] == searchNumber)         // Check the searching number is equal or not.
            {
                isEqual = true;
                System.out.println("Index of equal value : "+j);    // Print the searching element index.
            }
        }
        if(!isEqual)           // If the searching element is not in array in will output this statement.
        {
            System.out.println("Your element can not found in array.");
        }
    }

    public static void main(String[] args) {
        Lab01Question02 newObject = new Lab01Question02();   // Making object of Lab01Question02 class.
        newObject.readElements();                            // Calling the readElement method.
        newObject.printArray();                              // Calling printArray method.
        newObject.interchangeElements(4,13);  // Calling interchangeElements method.
        newObject.printElement(2);                  // Calling printElement method.
        newObject.deleteElement(11);               // Calling deleteElement method.
        System.out.println("After deleting 11th element.");   // Calling printArray method.
        newObject.printArray();                               // Calling printArray method.
        System.out.println("After insert element.");          // Calling printArray method.
        newObject.insertElement(180,13);   // Calling insertElement method.
        newObject.printArray();                               // Calling printArray method.
        System.out.println("Search element.");                // Calling printArray method.
        newObject.searchElement(45);               // Calling searchElement method.
        newObject.printArray();                               // Calling printArray method.
    }

}
