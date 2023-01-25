//Static methode vs public methode 

public class Oopmethode {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Oopmethode myObj = new Oopmethode(); // Create an object of Oopmethode
    myObj.myPublicMethod(); // Call the public method on the object
  }
}