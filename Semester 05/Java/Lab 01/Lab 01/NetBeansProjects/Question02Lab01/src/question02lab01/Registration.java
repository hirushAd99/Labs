/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02lab01;

/**
 *
 * @author 2019e166
 */
public class Registration {

    /**
     * @param args the command line arguments
     */
    int regno; //Last two digits of your registration number
    String name;
    
    public void setDetails(int a,String b){
        regno=a;
        name=b;
 }
 public void showDetails(){
        System.out.println("Registration number is "+regno);
        System.out.println("Name is = "+name);
 }
 public static void main(String args[]){
        Registration s1 = new Registration();
        Registration s2 = new Registration();
        Registration s3 = new Registration();
        s1.setDetails(2019166,"Hirusha");
        s2.setDetails(2019213,"yyyy"); //Replace xxxx, yyyy with any names
        s1.showDetails();
        s2.showDetails();
 }
}
