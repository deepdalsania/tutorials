package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Event_Handling extends Applet implements ActionListener{

	/**
	 * @param args
	 */
	Button b1 ;
	Label id ;
	TextField tf ;
	public void init() {
		// TODO Auto-generated method stub
		
		
		add(new Label("Email : "));
		tf = new TextField("enter your email here",40);
		add(tf);
		b1 = new Button("SUBMIT");
		b1.setBounds(150,500,60,50);
		add(b1);
		b1.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
	//	System.out.println("event handled succesfully"); when click on submit button at that time this message will print on console.
		tf.setText(b1.getLabel());
		//id.setText(id.getText());
		
	}
}
