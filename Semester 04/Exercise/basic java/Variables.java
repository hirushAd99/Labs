//String :- used to store the text values  Ex:-"Hello"
//int :-used to store the integer values Ex:-1,2,3
//float :-is used to store the floating point values Ex:-1.4,1.5,2.76
//char:-is used store the characters such as 'a','b'
//blooean :-this is store the two states: ture and fales



//Declaring variable
//Syntax is
//   Datatype variablename=value; 

class Variables {
	
 
  public static void main(String[] args) {
	  //String type
	String name=" jonh";
	System.out.println("Hello"+name); // + is used to combine the text and variable 
	
	//int type
	int number=5;
	System.out.println(number);
	
	//char type
	char characters='a';
	System.out.println(characters);
	
	
	
	//Final or constant key word 
	//this values are unchangeable values
	final int x=15;
	//x=6;
	System.out.println(x);
	
   
  }
}