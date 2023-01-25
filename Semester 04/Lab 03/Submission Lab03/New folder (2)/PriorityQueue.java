import java.util.ArrayList;    // Import ArrayList library.
public class PriorityQueue {
    int queueSize;     // Define queue size.
    ArrayList<Integer> queueArrayList = new ArrayList<Integer>(queueSize);  // Define queueArrayList.

    // setQueueArrayList method.
    public void setQueueArrayList(ArrayList<Integer> queueArrayList , int queueSize)
    {
        this.queueSize = queueSize;       // Assign queueSize when method calling.
        this.queueArrayList = queueArrayList;  // Assign queueArrayList when method calling.
    }

    // arrangeQueue method for prepare the order of queue.
    public void arrangeQueue()
    {
        for(int i = 0; i<queueSize; i++)      // Sorting the queue.
        {
            for(int j = i+1; j <queueSize; j++)
            {
                if(queueArrayList.get(i) > queueArrayList.get(j))   // Check the elements greater than or less.
                {
                    int temp = queueArrayList.get(i);
                    queueArrayList.add(i,queueArrayList.get(j));
                    queueArrayList.remove(i+1);
                    queueArrayList.add(j,temp);
                    queueArrayList.remove(j+1);
                }
            }
        }
    }

    // poll method for removing element.
    public void poll(int removingElement)
    {
        boolean isFound = false;       // Define to check element found or not.
        for (int i =0; i<queueArrayList.size(); i++)
        {
            if(queueArrayList.get(i) == removingElement)    // Check the element available or not.
            {
                queueArrayList.remove(i);       // Remove the element if it found.
                isFound = true;
            }
        }
        if(isFound == false)     // If nor found this part will run.
        {
            System.out.println("Could not found " + removingElement +" element.");
        }
    }

    // add method for adding element to queue.
    public void add(int addingElement)
    {
        for (int k = 0; k <queueArrayList.size(); k++)       // Check the suitable place for element.
        {
            if((addingElement <= queueArrayList.get(k))&&(k ==0))
            {
                queueArrayList.add(k,addingElement);
            }
            else if((addingElement>queueArrayList.get(k))&&(k == queueArrayList.size()-1))
            {
                queueArrayList.add(k+1,addingElement);
            }
            else if((addingElement>queueArrayList.get(k)) && (addingElement<=queueArrayList.get(k+1)))
            {
                queueArrayList.add(k+1,addingElement);
            }
        }
    }

    // Print method to print link list.
    public void printQueue()
    {
        for (int j =0; j < queueArrayList.size(); j++)
        {
            System.out.print(queueArrayList.get(j) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue newObject = new PriorityQueue();  // Creating an object of the PriorityQueue class.
        ArrayList<Integer> queueArrayList = new ArrayList<Integer>(); // Define the array list.
        queueArrayList.add(56);        // Adding elements to array list.
        queueArrayList.add(89);        // Adding elements to array list.
        queueArrayList.add(12);        // Adding elements to array list.
        queueArrayList.add(77);        // Adding elements to array list.
        queueArrayList.add(83);        // Adding elements to array list.
        queueArrayList.add(90);        // Adding elements to array list.
        queueArrayList.add(4);         // Adding elements to array list.
        queueArrayList.add(69);        // Adding elements to array list.
        queueArrayList.add(43);        // Adding elements to array list.
        newObject.setQueueArrayList(queueArrayList,queueArrayList.size());   // Calling setQueueArrayList method for setting element.
        newObject.printQueue();             // Calling printQueue method.
        System.out.println("After arrange the queue.");
        newObject.arrangeQueue();           // Calling arrangeQueue method.
        newObject.printQueue();             // Calling printQueue method.
        System.out.println("Adding element to queue");
        newObject.add(75);                  // Calling add method.
        newObject.printQueue();             // Calling printQueue method.
        System.out.println("Remove 44 element from queue");
        newObject.poll(44);    // Calling poll method for remove item.
        newObject.printQueue();             // Calling printQueue method.
        System.out.println("Remove 56 element from queue");
        newObject.poll(56);    // Calling poll method for remove item.
        newObject.printQueue();             // Calling printQueue method.
    }

}
