import javax.swing.*;
  
public class Simple2 extends JFrame{//inheriting JFrame 
 
	JFrame f; 
	 
	Simple2(){  
	JTextField t1=new JTextField(10);
	JButton b=new JButton("click");//create button

	b.setBounds(130,100,100, 40);  //x axis, y axis, width, height  
          
	add(b);//adding button on frame  
	setSize(400,500); //400 width and 500 height   
	setLayout(null);  //using no layout managers  
	setVisible(true); //making the frame visible   
}  
public static void main(String[] args) {  
	new Simple2();  
	}
}  