/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EC5080_Lab01;
import java.util.Scanner;
/**
 *
 * @author 2019e166
 */
public class ExpressionResultPart01 {
    
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
        ExpressionResultPart01 obj01 = new ExpressionResultPart01();
        System.out.println("Enter the algebraic expression : ");
        obj01.algebraicExpression = scanner.next().charAt(0);
        algebraicMethod(obj01.algebraicExpression);
    }

    /**
     *
     * @param algebraicExpression use to get the algebraic function.
     * @return 
     */
    public void algebraicMethod(char algebraicExpression){
        System.out.println("Enter a number : ");
        double number01 = scanner.nextDouble();
        System.out.println("Enter a number : ");
        double number02 = scanner.nextDouble();
        if(algebraicExpression == '+'){
            toString(number01+number02);
        }
        else if(algebraicExpression == '-'){
            toString(number01-number02);
        }
        else if(algebraicExpression == '*'){
            toString(number01*number02);
        }
        else if(algebraicExpression == '/'){
            toString(number01/number02);
        }
        else {
            System.out.println("Error in algebraic expression");
        }
    }

    /**
     *
     */
    public void methodCalling(){
        char methodRunning = 'A';
        while (methodRunning != 'X'){
            getAlgebraicExpression();
            System.out.println("If you want to exit press X else press any one.");
            methodRunning = scanner.next().charAt(0);
        }
    }

    public void toString(double result){
        System.out.println(String.valueOf(result));
    }

    public static void main(String[] args) {
        ExpressionResultPart01 obj03 = new ExpressionResultPart01();
        obj03.methodCalling();
    }

  
}
