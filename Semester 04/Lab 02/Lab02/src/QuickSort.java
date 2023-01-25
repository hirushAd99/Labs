public class QuickSort {
    int arraySize;  // Define arraySize.
    int[] arrayElement = new int[arraySize];  // Define array for element.
    public int partition(int[] arrayElement, int lowerIndex, int higherIndex)
    {
        this.arrayElement = arrayElement;   // Class object assign for method calling array.
        int pivotElement = arrayElement[higherIndex];   // Assign pivot element as last element.
        int i = lowerIndex - 1;
        for(int j = lowerIndex; j <= higherIndex-1; j++)
        {
            if(arrayElement[j] < pivotElement)   // Check pivot element less than element.
            {
                i++;
                swapElement(i,j);      // If condition true swap will do.
            }
        }
        swapElement(i+1,higherIndex);   // Otherwise that is the highest value then it will swap.
        return(i+1);
    }


    public void swapElement(int swapElement01 , int swapElement02)   // Swap elements method.
    {
        int temporaryElement = arrayElement[swapElement01];    // Store in temporary value before swap.
        arrayElement[swapElement01] = arrayElement[swapElement02];  // Swap elements.
        arrayElement[swapElement02] = temporaryElement;     // Swap elements.
    }


    // Quick sort method.
    public void quickSort(int[] arrayElement , int lowerElement , int higherElement)
    {
        this.arrayElement = arrayElement;  // Assign the array in class.
        if(lowerElement < higherElement)   //  Condition check high or low.
        {
            int partitionElement = partition(arrayElement,lowerElement,higherElement);  // Call partitionElement method.
            quickSort(arrayElement,lowerElement,partitionElement-1);         // Call quick sort method for left part.
            quickSort(arrayElement,partitionElement+1,higherElement);         // Call quick sort method for right part.
        }
    }
    public void printArray(int array[])
    {
        for(int i =0;i<array.length;i++)
        {
            System.out.print(array[i]+" "); // Print array element.
        }
 }
    public static void main(String[] args) {
        int newArray[]= {23,45,12,78,56,79,90,34,1}; // Define and assign an array.
        QuickSort newObject = new QuickSort();   // Create object of QuickSort.
        newObject.quickSort(newArray,0,newArray.length-1);  // Calling quickSort method.
        newObject.printArray(newArray);      // Calling printArray method.
    }
}
