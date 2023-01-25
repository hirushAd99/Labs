import java.util.LinkedList;

 public class Linkedlists {
  public static void main(String[] args) {
	  //create the linked list 
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    
    // Use addFirst() to add the item to the beginning
    cars.addFirst("Mazda");
    System.out.println(cars);
	
	//add the item in thelast
	cars.addLast("XXX");
	 System.out.println(cars);
	 
	//Remove the item to theFirst
	cars.removeFirst();
	System.out.println(cars);
	
	//remove the item last
	cars.removeLast();
	System.out.println(cars);
	
	// Use getFirst() to display the first item in the list
    System.out.println(cars.getFirst());
	
	//use getLast() to display the last elemt item in the List
	    System.out.println(cars.getLast());
	
	 
  }
}
