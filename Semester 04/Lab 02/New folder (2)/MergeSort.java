public class MergeSort {
    // Define required variables.
    int arraySize;
    int[] array = new int[arraySize];
    int lowerIndex;
    int upperIndex;
    int middleIndex;
    public void setElement(int[] array,int arraySize)   // Setting the array and array size.
    {
        this.arraySize = arraySize;
        this.array = array;
    }
    // Merge sort method for separating the element.
    public void mergeSort(int lowerIndex, int upperIndex)
    {
        this.lowerIndex = lowerIndex;   // Assign values into class variables.
        this.upperIndex = upperIndex;   // Assign values into class variables.
        if(lowerIndex < upperIndex)     // Check the condition is true until one element come to array this will true.
        {
            int middle = (lowerIndex+upperIndex)/2;   // Define and assign middle index.
            mergeSort(lowerIndex,middle);             // Calling mergeSort method for left side of array.
            mergeSort(middle+1,upperIndex);  // mergeSort will call for right side of array.
            merge(lowerIndex,middle,upperIndex);      // After finishing dividing array to one element the merge will call for combining the array.
        }
    }
    // Merge method for getting the sorted array.
    public void merge(int lowerIndex, int middleIndex, int upperIndex)
    {
        this.lowerIndex = lowerIndex;    // Assign values into class variables.
        this.middleIndex = middleIndex;  // Assign values into class variables.
        this.upperIndex = upperIndex;    // Assign values into class variables.
        int tempArray[] = new int[upperIndex-lowerIndex+1];  // Define temporary array to store sorted element temporary.
        int i = lowerIndex;      // Setting values.
        int j = middleIndex+1;   // Setting values.
        for(int k = 0; (i <=middleIndex)||(j<=upperIndex); k++)       // Setting values for temporary array from unsorted array.
        {
            if(i > middleIndex)           // According to the value this will put values in sorted array.
            {
                tempArray[k] = array[j++];
            }
            else if(j > upperIndex)
            {
                tempArray[k] = array[i++];
            }
            else if(array[i] <= array[j])
            {
                tempArray[k] =array[i++];
            }
            else
            {
                tempArray[k] = array[j++];
            }
        }
        for(int index = lowerIndex; index <tempArray.length; index++)
        {
            array[index] = tempArray[index];   // Put the sorted elements into first array.
        }
    }

    public static void main(String[] args) {
        MergeSort newObject = new MergeSort();        // Define an object of the class.
        int[] arrayN = new int[]{12,89,65,67,1,66,99};  // Define an array for sorting.
        newObject.setElement(arrayN,arrayN.length);        // Calling setElement method for setting an array for sorting.
        newObject.mergeSort(0,arrayN.length-1);  // Call mergeSort method for sorting.
        for(int i =0; i< arrayN.length; i++)        // Print the sorted array.
        {
            System.out.print(arrayN[i]+" ");
        }
    }
}
