package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;



@SuppressWarnings("serial")
public class Layout_Demo extends Applet{
	
		@Override
		public void init() {
			// TODO Auto-generated method stub
		
			FlowLayout f = new FlowLayout(FlowLayout.LEADING);
			setLayout(f); // flow layout is default layout of applet
			setBounds(100, 50, 50, 40);
			Checkbox c = new Checkbox("MUSIC");
			add(c);
			
			FlowLayout f1 = new FlowLayout(FlowLayout.TRAILING);
			setLayout(f1); 
			setBounds(100, 50, 50, 40);
			Checkbox c1 = new Checkbox("DANCE");
			add(c1);
		//	setLayout(new FlowLayout(FlowLayout.RIGHT));
			Button b = new Button("SAVE");
			add(b);
			Button b1 = new Button("SUBMIT");
			add(b1);
			setLayout(new FlowLayout(FlowLayout.TRAILING));
			Label l = new Label("Email : ");
			add(l);
		//	setLayout(new FlowLayout(FlowLayout.TRAILING));
			TextField tf = new TextField(10);
			add(tf);
			
			
		}
		
}
