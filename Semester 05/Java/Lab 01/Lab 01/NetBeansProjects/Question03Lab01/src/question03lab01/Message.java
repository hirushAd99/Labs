/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03lab01;

/**
 *
 * @author 2019e166
 */
public class Message {

    /**
     * @param args the command line arguments
     */
String message;
public Message(String msg) {
this.message = msg;
}
public void display() {
print(this.message);
}
public void print(String message) {
Message msg = new Message("The message: " + message);
}
public static void main(String[] args) {
Message msg_1 = new Message("SC1");
Message msg_2 = new Message("SC2");
msg_1 = msg_2;
msg_1.display();
new Message("SC3").display();
msg_1 = null;
System.gc();
}
public void finalize() {
System.out.println("'" + this.message + "'" + " successfully garbage collected");
}
}
