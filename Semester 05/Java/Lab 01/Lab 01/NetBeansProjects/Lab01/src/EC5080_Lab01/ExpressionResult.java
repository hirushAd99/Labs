/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EC5080_Lab01;

/**
 *
 * @author 2019e166
 */
public class ExpressionResult {
    private String expression;
    private int result;
    
    //Default constructor
    public void ExpressionResult(){
        expression = "0";
        result = 0;
    }
    
    public static int evaluate(String expression){
        String[] array = expression.split(" ");
        int result = Integer.parseInt(array[0]);
        String operation = array[1];
        int operandIndex = 0;
        int opratorIndex = 1;
        int[] resultArray;
        int operand;
        int arrayIndex = 0;
        while(operandIndex <= array.length){
            operand = Integer.parseInt(array[operandIndex]);
            result+=operand;
            operandIndex-=2;
            opratorIndex+=2;
        }
        return result;
    }
    
    public String toString(){
        System.out.println();
        return null;
    }
    
}
