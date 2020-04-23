package applet;

import java.awt.BorderLayout;
import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class RegistrationForm_Demo extends JFrame {
	
	public RegistrationForm_Demo(){
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		//setLayout(new GridLayout(2,1,2,2));
		add(new JLabel("First Name : "));
		add(new JTextField(8));
		add(new JLabel("Last Name : "));
		add(new JTextField(8));
		add(new JLabel("Email : "));
		add(new JTextField(8));
		add(new JLabel("Gender : "));
		add(new JCheckBox("MALE"));
		add(new JCheckBox("FEMALE"));
		add(new JCheckBox("OTHER"));
		add(new JButton("SUBMIT"));
		setLayout(new BorderLayout());
	//	add(new JLabel(new ImageIcon("F:/ScamScanner/Deep.JPG")));
		
	}
	public static void main(String[] args) {
		RegistrationForm_Demo rd = new RegistrationForm_Demo();
	    rd.setTitle("Registration Form");
	    rd.setSize(200, 125);
	    rd.setLocationRelativeTo(null); //center the frame
	    rd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    rd.setVisible(true);
	}
}
