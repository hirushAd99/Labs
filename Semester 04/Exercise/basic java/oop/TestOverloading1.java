//same methode name and different parameter
//and you can try the different datatype also
class MethodeOverloding{ 
 
	static int add(int a,int b){return a+b;}  
	static int add(int a,int b,int c){return a+b+c;}  
}
  
class TestOverloading1{  

	public static void main(String[] args){
  
	System.out.println(MethodeOverloding.add(11,11));  
	System.out.println(MethodeOverloding.add(11,11,11));  
	}

}  