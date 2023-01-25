//ArrayList
import java.util.ArrayList;

public class Arraylist {
  public static void main(String[] args) {
	//create the Array List
  
    ArrayList<Integer> myList = new ArrayList<Integer>(5);  //size is intial size 
	
	//Add the element to the List
    myList.add(5);
    myList.add(9);
    myList.add(6);
    myList.add(7);
	myList.add(15);
	myList.add(20);
	
	//Printing the Array elements
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }
	
	//printing the Size of the Arraylist
	System.out.println("size of the Arrat list:  "+myList.size());
	
	//Remove the  2 nd index of the Array list
	myList.remove(2);
	  for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }
	
	System.out.println("size of the Arrat list:  "+myList.size());
	
	//Change the value in the ArrayList
	myList.set(0,100);
	 for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }
	
	System.out.println("size of the Arrat list:  "+myList.size());
	
	
	
  }
}