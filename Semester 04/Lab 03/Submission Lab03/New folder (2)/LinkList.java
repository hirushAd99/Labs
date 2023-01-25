import java.util.ArrayList;     // Import ArrayList library.
public class LinkList {
    ArrayList<Integer> linkListArrayList = new ArrayList<Integer>();  // Define an array list.
    int linkListIndex;     // Define array size.
    public void LinkList() // Default constructor.
    {
        linkListIndex = 0;
    }
    // Setting link list.
    public void setLinkList(ArrayList<Integer> linkListArrayList , int linkListIndex)
    {
        this.linkListArrayList = linkListArrayList;  // Assigning the link list to array list.
        this.linkListIndex = linkListIndex;          // Assigning link list size.
    }
    // Append new node method for adding mew element at end.
    public void appendNewNode(int newElement)
    {
        linkListArrayList.add(linkListIndex+1,newElement);  // Adding new element.
        linkListIndex++;
    }
    // Prepend new node method for adding mew element at front.
    public void prependNewNode(int newElement)
    {
        linkListArrayList.add((0),newElement);
    }
    // Delete the node at the front.
    public void deleteAtStart()
    {
        linkListArrayList.remove(0);
    }
    // Delete an element at specific place.
    public void deleteAtSpecificPosition(int indexForDelete)
    {
        linkListArrayList.remove(indexForDelete);
    }
    // Print method to print link list.
    public void printArrayList()
    {
        for (int j =0; j < linkListArrayList.size(); j++)
        {
            System.out.print(linkListArrayList.get(j) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); // Define the array list.
        LinkList newObject = new LinkList();    // Creating an object of the LinkList class.
        arrayList.add(0,55);        // Adding elements to array list.
        arrayList.add(1,67);        // Adding elements to array list.
        arrayList.add(2,90);        // Adding elements to array list.
        arrayList.add(3,19);        // Adding elements to array list.
        newObject.setLinkList(arrayList , arrayList.size()-1);   // Calling the setLinkList method.
        System.out.println("Link list at start.");
        newObject.printArrayList();                 // Calling printArrayList method.
        newObject.appendNewNode(12);       // Calling appendNewNode method.
        System.out.println("After adding new element at end.");
        newObject.printArrayList();                 // Calling printArrayList method.
        newObject.prependNewNode(99);     // Calling prependNewNode method.
        System.out.println("After adding new element at front.");
        newObject.printArrayList();                 // Calling printArrayList method.
        newObject.deleteAtStart();                  // Calling deleteAtStart method.
        System.out.println("Delete element at front.");
        newObject.printArrayList();                 // Calling printArrayList method.
        newObject.deleteAtSpecificPosition(3); // Calling deleteAtSpecificPosition method.
        System.out.println("Delete element at 3 index.");
        newObject.printArrayList();                 // Calling printArrayList method.
    }

}
