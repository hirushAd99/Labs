public class Person {
  private String name;  // private = restricted access
  private int age;

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
  
  // Getter
  public int getAge()
  {
	  return age;
  }
  //Setter
  public void setAge(int newAge)
  {
	  this.age=newAge;
  }
  
  
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
	myObj.setAge(23);
    System.out.println(myObj.getName());
	System.out.println(myObj.getAge());
  }
}