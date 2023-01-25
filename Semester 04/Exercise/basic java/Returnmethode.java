//Return methode 
public class Returnmethode {
  static int myMethod(int x, int y)  //for the return methode you have to 
									//used the primitive data types inseated of void 
  {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(5, 3));
  }
}