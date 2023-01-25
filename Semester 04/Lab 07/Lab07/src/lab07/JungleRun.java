/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author 2019e166
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class JungleRun {

    static int pathLength=30*30; // Max Length as it can be 30 row and 30 columns

    static int rows, cols;

    static String arr[][]=null;

    static ArrayList<String> path = new ArrayList<>(0);

    public static void main(String[] args) {

        constructInputMatrix();
        int length = 0;
        ArrayList<String> tempPath = new ArrayList<>(0);
        findPath(tempPath,length);
        System.out.println("Shortest Path is " + pathLength);


    }

    private static void findPath(ArrayList<String> tempPath, int length) {
        int lastRow=0, lastColumn=0;

        if(tempPath.size()==0){
            parseMatrix(tempPath, length, lastRow+1, lastColumn);
            parseMatrix(tempPath, length, lastRow, lastColumn+1);

        }
        else{
            String path = tempPath.get(tempPath.size()-1);
            lastRow = Integer.parseInt(path.substring(0, 1));
            lastColumn = Integer.parseInt(path.substring(1));
            parseMatrix(tempPath, length, lastRow+1, lastColumn);
            parseMatrix(tempPath, length, lastRow-1, lastColumn);
            parseMatrix(tempPath, length, lastRow, lastColumn+1);
            parseMatrix(tempPath, length, lastRow, lastColumn-1);
        }

    }

    private static void parseMatrix(ArrayList<String> tempPath, int length,
                                    int lastRow, int lastColumn) {
        if((lastRow < rows) && (lastRow > -1) && (lastColumn< cols) && (lastColumn > -1)){
            String arrValue = arr[lastRow][lastColumn];
            if(arrValue.equalsIgnoreCase("E")){
                if(pathLength > (length+1)){
                    pathLength = length+1;
                }

                return;

            }
            else if (arrValue.equalsIgnoreCase("P")){
                String path = ""+(lastRow)+lastColumn;
                if(!tempPath.contains(path)){
                    tempPath.add(path);
                }
                else{
                    System.out.println("Cyclic Path deducted.");
                    return;
                }
                length=length+1;
                findPath(tempPath,length);
            }

        }
    }

    private static void constructInputMatrix() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of Rows ::");
        rows = in.nextInt();
        System.out.println("Enter number of Cols ::");
        cols = in.nextInt();

        arr = new String[rows][cols];

        for(int i =0; i < rows;i++){
            for(int j =0;j<cols;j++){
                System.out.println("Enter row " + (i+1) + " Column " + (j+1) + " entry");
                arr[i][j]=in.next();
            }
        }
    }


}
