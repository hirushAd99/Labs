package EC5080_Lab01;
import java.util.Scanner;
public class ExpressionResult {
    Scanner scanner = new Scanner(System.in);
    char algebraicExpression;
    //Constructor.
    public void ExpressionResult(){
        algebraicExpression = '=';
    }

    /**
     * getAlgebraicExpression method use to get algebraic expression from the user.
     */
    public void getAlgebraicExpression(){
        ExpressionResult obj01 = new ExpressionResult();
        System.out.println("Enter the algebraic expression : ");
        String expression = scanner.nextLine();
        toString(evaluate(expression));
    }


    public static int evaluate(String expression){
        String[] array = expression.split("[ ]");
        int result = Integer.parseInt(array[0]);
        //String operation = array[1];
        int operandIndex = 2;
        int opratorIndex = 1;
        //int[] resultArray;
        int operand;
        String operator = null;
        while(operandIndex < array.length){
            operand = Integer.parseInt(array[operandIndex]);
            if(opratorIndex < array.length)
            {
                operator = array[opratorIndex];
            }
            operandIndex+=2;
            //opratorIndex+=2;
            if(array[opratorIndex].equals("+")){
                result+=operand;
            }
            else if(array[opratorIndex].equals("-")){
                result=result-operand;
            }
            else if(array[opratorIndex].equals("*")){
                result=result*operand;
            }
            else if(array[opratorIndex].equals("/")){
                result=result/operand;
            }
            opratorIndex+=2;
        }
        return result;
    }

    /**
     *
     */


    public void toString(int result){
        System.out.println(String.valueOf(result));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char methodRunning = 'A';
        while (methodRunning != 'X'){
            ExpressionResult obj03 = new ExpressionResult();
            obj03.getAlgebraicExpression();
            System.out.println("If you want to exit press X else press any one.");
            methodRunning = scanner.next().charAt(0);
        }
    }
}
