
public class StackOperation {
    int arraySize;
    int[] stackElementArray = new int[arraySize];
    int topValue;
    int newElement;
    boolean stackEmpty;
    boolean stackFull;

    public void StackOperation()
    {
        arraySize = 0;
        topValue = -1;
    }
    public void StackOperation(int arraySize , int[] stackElementArray,int topValue)
    {
        this.arraySize = arraySize;
        this.stackElementArray = stackElementArray;
        this.topValue = topValue;
        stackEmpty = false;
        stackFull = false;
    }
    /*
    public void setStack()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the stack size : ");
        for(int)
    }
 */
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

    public void printElement()
    {
        System.out.print("Elements present in stack : ");
        for(int i = topValue-1; i>=0; i--)
        {
            System.out.print(stackElementArray[i]+ " ");
        }
        System.out.println();
    }

}
