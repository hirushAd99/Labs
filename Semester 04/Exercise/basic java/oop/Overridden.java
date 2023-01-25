//creating the parent class

class Parent{
	//defining  the methode
	void display()
	{
		System.out.println("I am Parent");
	}
	
}
//create the Child class
class Child extends Parent
{
	//defining the same method as in the parent class  
	void display()
	{
		System.out.println("I am child ");
	}
}

class Overridden
{
	public static void main(String [] args)
	{
		Child obj=new Child(); //create the object
		obj.display(); //call the function
	}
}