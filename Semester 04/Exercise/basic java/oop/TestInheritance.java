 //the dog and cat  class (subclass) inherits the attributes and methods from the Animal class (superclass):
 // in herttance

class Animal{  
	void eat()
	{
		System.out.println("eating...");
	}  
}
  
class Dog extends Animal{  
	void bark()
	{
		System.out.println("barking...");
	}  
}  
class Cat extends Animal{
	void memow()
	{
		System.out.println("Memow......");
	}
}

class TestInheritance{  
public static void main(String args[]){  
	 Dog d=new Dog(); 
	Cat c=new Cat();
	d.bark();  
	d.eat();
	c.eat();
	c.memow(); 
	
	
	
	}

}  