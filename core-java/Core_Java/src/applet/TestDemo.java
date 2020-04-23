package applet;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TestDemo extends Frame {
	Frame f;
	public TestDemo() {
		f=new Frame("Deep");
		f.setBounds(100, 200, 300, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				f.dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		TestDemo d=new TestDemo();
		
	}
}
