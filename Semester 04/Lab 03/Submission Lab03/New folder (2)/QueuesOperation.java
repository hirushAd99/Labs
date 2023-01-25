import java.util.Scanner;  // Import scanner library.

public class QueuesOperation {
    int queuesFront;  // Define queuesFront.
    int queuesRear;   // Define queuesRear.
    int arraySize;    // Define arraySize.
    int[] queuesElement = new int[arraySize];
    Scanner scanner = new Scanner(System.in);  // Create an object of scanner.

    public void QueuesOperation() {     // Default constructor.
        queuesRear = -1;
        queuesFront = -1;
    }
    // Default constructor to set element
    public void QueuesOperation(int[] queuesElement, int arraySize, int rearValue) {
        this.queuesElement = queuesElement;
        this.arraySize = arraySize;
        queuesRear = rearValue;
        queuesFront = 0;
    }

    // setQueues method for setting values and elements.
    public void setQueues() {
        System.out.println("Enter size : ");
        arraySize = scanner.nextInt();   // Take queue size from user.
        boolean queuesEmpty = isEmpty();
        if (queuesEmpty == true) {
            System.out.println("Queues is empty.");
        }
        for (int i = queuesRear; i < arraySize; i++) {
            System.out.print("Enter element : ");
            queuesElement[i] = scanner.nextInt();
        }
        System.out.println("Queues is full.");
    }
    // isEmpty method for checking queue empty or not.
    public boolean isEmpty() {
        if (queuesRear == -1) {
            return true;
        } else {
            return false;
        }
    }

    // peek method for get peek value.
    public void peek() {
        boolean queuesEmpty = isEmpty();
        if (queuesEmpty == true) {
            System.out.println("Queues is empty.");
        } else {
            System.out.println("Peek value of queues : " + queuesElement[queuesFront]);
        }
    }
    // isFull method for checking queue full or not.
    public boolean isFull() {
        if (queuesRear == queuesElement.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    // enqueue method for adding new element.
    public void enqueue(int newElement) {
        boolean queuesFull = isFull();
        if (queuesFull == true) {
            System.out.println("Queues is full.");
        } else {
            queuesElement[queuesRear - 1] = newElement;
            queuesRear++;
        }
    }

    // dequeue method for give front element.
    public void dequeue() {
        boolean queuesEmpty = isEmpty();
        if (queuesEmpty == true) {
            System.out.println("Queues is empty.");
        } else {
            System.out.println("Dequeue of queue : " + queuesElement[queuesFront]);
            queuesFront++;
        }
    }

    public static void main(String[] args) {
        QueuesOperation queuesObject = new QueuesOperation();  // Crate an object of QueuesOperation class.
        int[] queuesArray = new int[10];     // Define an array for queue values.
        queuesArray[0] = 12;     // Assign values.
        queuesArray[1] = 89;     // Assign values.
        queuesArray[2] = 55;     // Assign values.
        queuesArray[3] = 69;     // Assign values.
        queuesArray[4] = 33;     // Assign values.
        queuesArray[5] = 84;     // Assign values.
        queuesObject.QueuesOperation(queuesArray, 10, 5); // Calling QueuesOperation method.
        queuesObject.peek();        // Calling peek method.
        queuesObject.enqueue(55);  // Calling enqueue method.
        queuesObject.peek();     // Calling peek method.
        queuesObject.dequeue();  // Calling dequeue method.
        queuesObject.peek();     // Calling peek method.
    }
}