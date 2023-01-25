import java.util.Scanner;

public class QueuesOperation {
    int queuesFront;
    int queuesRear;
    int arraySize;
    int[] queuesElement = new int[arraySize];
    Scanner scanner = new Scanner(System.in);
    public void QueuesOperation()
    {
        queuesRear = -1;
        queuesFront = -1;
    }

    public void QueuesOperation(int[] queuesElement , int arraySize, int rearValue)
    {
        this.queuesElement = queuesElement;
        this.arraySize = arraySize;
        queuesRear = rearValue;
        queuesFront = 0;
    }

    public void setQueues()
    {
        System.out.println("Enter size : ");
        arraySize = scanner.nextInt();
        boolean queuesEmpty = isEmpty();
        if(queuesEmpty == true)
        {
            System.out.println("Queues is empty.");
        }
        for(int i = queuesRear; i < arraySize; i++)
        {
            System.out.print("Enter element : ");
            queuesElement[i] = scanner.nextInt();
        }
        System.out.println("Queues is full.");
    }
    public boolean isEmpty()
    {
        if(queuesRear == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void peek()
    {
        boolean queuesEmpty = isEmpty();
        if(queuesEmpty == true)
        {
            System.out.println("Queues is empty.");
        }
        else
        {
            System.out.println("Peek value of queues : " + queuesElement[queuesFront]);
        }
    }

    public boolean isFull()
    {
        if(queuesRear == queuesElement.length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void enqueue(int newElement)
    {
        boolean queuesFull = isFull();
        if(queuesFull == true)
        {
            System.out.println("Queues is full.");
        }
        else
        {
            queuesElement[queuesRear-1] = newElement;
            queuesRear++;
        }
    }

    public void dequeue()
    {
        boolean queuesEmpty = isEmpty();
        if(queuesEmpty == true)
        {
            System.out.println("Queues is empty.");
        }
        else
        {
            System.out.println("Dequeue of queue : "+queuesElement[queuesFront]);
            queuesFront++;
        }
    }
}
