public class ExceptionTest1 {
    public static void main(String args[])
    {
        try{
            int a[]=new int[5];
            a[6] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound.");
        }
        }
}

