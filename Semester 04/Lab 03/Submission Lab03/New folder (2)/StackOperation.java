public class StackOperation {
    int arraySize;  // Define arraySize.
    int[] stackElementArray = new int[arraySize]; // Define array.
    int topValue;
    int newElement;
    boolean stackEmpty;
    boolean stackFull;

    public void StackOperation() // Default constructor.
    {
        arraySize = 0;
        topValue = -1;
    }
    // StackOperation method for setting values.
    public void StackOperation(int arraySize , int[] stackElementArray,int topValue)
    {
        this.arraySize = arraySize;
        this.stackElementArray = stackElementArray;
        this.topValue = topValue;
        stackEmpty = false;
        stackFull = false;
    }
    // isEmpty method for checking the elements are empty or not.
    public void isEmpty()
    {
        if(topValue == -1)
        {
            stackEmpty = true;
        }
        else
        {
            stackEmpty = false;
        }

    }

    // isFull method for checking the elements are full or not.
    public void isFull()
    {
        if(topValue == stackElementArray.length)
        {
            stackFull =  true;
        }
        else
        {
            stackFull =  false;
        }
    }

    // peek method for output peek value of stack.
    public void peek()
    {
        isEmpty();
        if(stackEmpty == true)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            System.out.println(stackElementArray[topValue-1] + " peek of the stack.");
        }
    }

    // push method for adding new element at end.
    public void push(int newElement)
    {
        this.newElement = newElement;
        isFull();
        if(stackFull == true)
        {
            System.out.println("Can not push values stack is fill.");
        }
        else
        {
            stackElementArray[topValue] = newElement;
            topValue++;
            System.out.println(newElement + " push to stack.");
        }
    }

    // pop method for pop the element.
    public void pop()
    {
        if(stackEmpty == true)
        {
            System.out.println("Stack is empty can not pop values.");
        }
        else
        {
            stackElementArray[topValue-1] = 0;
            topValue--;
            System.out.println("Pop the element from stack.");
        }
    }

    // PrintElement method for print stack.
    public void printElement()
    {
        System.out.print("Elements present in stack : ");
        for(int i = topValue-1; i>=0; i--)
        {
            System.out.print(stackElementArray[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackOperation newObject = new StackOperation();
        int arraySize = 4;
        int[] elementArray = new int[]{34, 78, 89, 0};
        newObject.StackOperation(arraySize, elementArray, 3);
        newObject.peek();
        newObject.push(45);
        newObject.peek();
        newObject.printElement();
        newObject.push(66);
        newObject.peek();
        newObject.pop();
        newObject.printElement();
    }

}
