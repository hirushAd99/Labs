public class Test7 {
    public static void calculate()
            throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int num = 10 / 0;
        int a []={1,2,3};
        System.out.println (a[4]);
    }
    public static void main(String[] args) {
        try {
            calculate();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception thrown");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception thrown");
            System.out.println(e.getMessage());
        }
    }

}
