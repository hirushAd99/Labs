public class Lab01Question03 {
    int arraySize;
    int[] elementArray = new int[arraySize];   // Define an array with 5 elements.
    int searchValue;                   // Define variable for searching value.
    boolean elementAvailable = false;

    public void buildingArray(int[] elementArray, int arraySize)
    {
        this.arraySize = arraySize;
        this.elementArray = elementArray;
    }

    // Liner search.
    public void linearSearch(int searchValue)    // LinearSearch method.
    {
        this.searchValue = searchValue;      // Assign value on the class with the value given at method calling value.
        for(int i = 0; i < elementArray.length; i++) // Search one by one whether equal with searchValue or not.
        {
            if(elementArray[i] == searchValue)   // Condition for equalling.
            {
                System.out.println(searchValue + " is at index : " + i);  // Print after element find.
                elementAvailable = true;                     // The variable will true if any element found from array.
            }
        }
        if(elementAvailable == false)                    // Check the element is in array if not this will print.
        {
            System.out.println("Element is not available in array.");
        }
    }

    // Bubble sort.
    public void bubbleSort()
    {
        for(int i =0; i< elementArray.length;i++)     // For comparing element this will run.
        {
            for(int j = 0; j < elementArray.length-1; j++)  // For comparing with the upper loop element all the other elements.
            {
                if(elementArray[j] > elementArray[j+1])    // Check the both element what is big and what is small.
                {
                    int temp = elementArray[j];            // Store in temporary variable the changing one element.
                    elementArray[j] = elementArray[j+1];   // Change the elements with other index.
                    elementArray[j+1] = temp;              //// Change the elements with other index.
                }
            }
        }

    }

    // Insertion sort.
    public void insertionSort()
    {
        for(int i =1; i < elementArray.length; i++)     // For taking element one by one for comparing.
        {
            int tempValue = elementArray[i];           // Store in temporary variable for comparing purposes.
            int j = i-1;
            while(j >= 0 && elementArray[j] >tempValue)  // Until it found less value this loop will run.
             {
                elementArray[j+1] = elementArray[j];     // Inter change the elements after the statement is right.
                j--;           // Decrement the j variable.
            }
            elementArray[j+1] = tempValue;         // Reassign value for temporary variable.
        }
    }

    // Selection sort.
    public void selectionSort()
    {
        for(int i =0; i < elementArray.length-1; i++)    // For taking element one by one for comparing.
        {
            int minValue = i;              // Assign first element as the minimum value.
            for(int j =i+1; j< elementArray.length; j++) //For search the element.
            {
                if(elementArray[j] < elementArray[minValue])    // Check what is the minimum value.
                {
                    minValue = j;      // After statement is true reassign the minimum value.
                }
            }
            if(minValue != i)
            {
                int tempValue = elementArray[i];
                elementArray[i] = elementArray[minValue];
                elementArray[minValue] = tempValue;
            }
        }
    }

    // Print array.
    public void printArray(int[] elementArray)  // Print the array.
    {
        this.elementArray = elementArray;
        for(int i = 0; i <elementArray.length; i++)  // Print element one by one.
        {
            System.out.print(elementArray[i] );
            if(i < elementArray.length-1)
            {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lab01Question03 objectOne = new Lab01Question03();               // Create an object of Lab01Question03 class.
        int []elementArray = new int[]{12,34,67,66,8,89,67,59,90,23,12}; // Assigning and defining the array.
        objectOne.buildingArray(elementArray, elementArray.length);      // Calling the buildingArray method for make the array.
        objectOne.linearSearch(11);                             // Calling linearSearch method for search the element of 11.
        objectOne.bubbleSort();                                          // Calling bubbleSort method for sorting the array.
        objectOne.printArray(elementArray);                              // Calling printArray method for checking purposes.
        objectOne.insertionSort();                                       // Calling bubbleSort method for sorting the array.
        objectOne.printArray(elementArray);                              // Calling printArray method for checking purposes.
        objectOne.selectionSort();                                       // Calling bubbleSort method for sorting the array.
        objectOne.printArray(elementArray);                              // Calling printArray method for checking purposes.
    }
}
