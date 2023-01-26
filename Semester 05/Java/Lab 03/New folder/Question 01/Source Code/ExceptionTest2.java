public class ExceptionTest2 {
    public static void main(String args[]) {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument");
        }
    }
}
