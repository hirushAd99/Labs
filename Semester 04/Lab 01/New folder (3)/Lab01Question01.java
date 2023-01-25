import java.util.Scanner; // Importing java scanner library.
public class Lab01Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Object of scanner.
        // Part (a)
        int[] elementArray = new int[20];          // New array size is 20
        // Part (b)
        for (int i = 0; i < elementArray.length; i++) // Read the values.
        {
            System.out.print("Enter Number : ");
            elementArray[i] = scanner.nextInt();
        }

        // Part (c)
        System.out.println("Enter two index need to interchange (0-19)");
        System.out.print("First index : "); // Take the index to change from user.
        int indexOne = scanner.nextInt();
        System.out.print("Second index : ");
        int indexTwo = scanner.nextInt();
        System.out.println("Before interchange : "+indexOne+" element "+elementArray[indexOne] + " " +indexTwo+" element "+ elementArray[indexTwo]);
        int temp = elementArray[indexOne]; // Keep the replacing value in temporary variable.
        elementArray[indexOne] = elementArray[indexTwo]; // Change the elements' values.
        elementArray[indexTwo] = temp;  // Reassign the value in temporary variable.
        System.out.println("After interchange : "+indexOne+" element "+elementArray[indexOne] + " " +indexTwo+" element " + elementArray[indexTwo]);
        // Part (d)
        System.out.print("Enter index of array you need to read (0-19) : "); // Take index for reading.
        int readingArrayIndex = scanner.nextInt();
        System.out.println(readingArrayIndex+" element is " + elementArray[readingArrayIndex]);
        // Part (e)
        System.out.print("Enter index of array you need to delete (0-19) : "); // Take index for deleting an item.
        int deletingArrayIndex = scanner.nextInt();
        elementArray[deletingArrayIndex] = 0; // For delete the relevant index element that index replace by 0.
        // Part (f)
        System.out.print("Enter a new value to insert : "); // Take value for replacing.
        int newElement = scanner.nextInt();
        elementArray[(elementArray.length-1)] = newElement;
        // Part (g)
        int continueLoop = 1;
        while(continueLoop == 1)
        {
            System.out.print("Enter value for searching from array :");
            int searchValue = scanner.nextInt();
            boolean isEqual = false;
            for(int j =0; j < elementArray.length; j++)
            {
                if(elementArray[j] == searchValue)
                {
                    isEqual = true;
                    System.out.println("Index of equal value : "+j);
                }
            }
            if(isEqual == false)
            {
                System.out.println("Your element can not found in array.");
            }
            System.out.println("If you need to compare more press '1' or else press '0'");
            continueLoop = scanner.nextInt();
        }
    }
}
