// Import the HashMap class
import java.util.HashMap;

public class Hashmap {
  public static void main(String[] args) {
    // Create a HashMap object called map   
	HashMap<Integer, String> map = new HashMap<Integer, String>(); //(key and values && based on the key values Retrive the elemts)

    // Add keys and values 
    map.put(1, "London");
    map.put(2, "Berlin");
    map.put(3, "Oslo");
    map.put(4, "WashingtonDC");
    System.out.println(map);
	
	// Print the size of the hashmap
	System.out.println("Size of map is:- " + map.size()); 
	
	if (map.containsKey(1))  
        { 
            Integer a = map.get(1); 
            System.out.println("value for key 1 is:- " + a); 
        } 
          
  }
}