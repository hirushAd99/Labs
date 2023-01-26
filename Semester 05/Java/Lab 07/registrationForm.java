import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class registrationForm extends JFrame{
	registrationForm()
	{
		JFrame f = new JFrame();
		JLabel name = new JLabel("Name");
		name.setBounds(20,50,80,20);
		JTextField nameText = new JTextField();
		nameText.setBounds(120,50,100,20);
		JLabel mobile = new JLabel("Mobile");
		mobile.setBounds(20,80,80,20);
		JTextField mobileText = new JTextField();
		mobileText.setBounds(120,50,100,20);
		JLabel gender = new JLabel("Gender");
		gender.setBounds(20,110,80,20);
		JToolBar genderClick = new JToolBar();
		//
		JLabel dob = new JLabel("DOB");
		dob.setBounds(20,140,80,20);
		//
		//
		JLabel address = new JLabel("Address");
		address.setBounds(20,170,80,20);
		JTextArea addressText = new JTextArea();
		addressText.setBounds(120,170,100,20);
		JButton submit = new JButton("Submit");
		submit.setBounds(20,200,100,30);
		JButton reset = new JButton("Reset");
		reset.setBounds(120,200,100,30);
		
		//Adding to panel
		
		f.add(name);
		f.add(nameText);
		f.add(mobile);
		f.add(mobileText);
		f.add(gender);
		f.add(genderClick);
		
		
	}
	
	public static void main(String[] args)
	{
		new registrationForm();
	}
	
}