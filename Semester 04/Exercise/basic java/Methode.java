// java methods
public class Methode {
	//create the methode
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
	  //calling methode 
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}

// static :-means that the method belongs to the Main class and not an object of the Main class
