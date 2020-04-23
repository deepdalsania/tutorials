package applet;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class Frame_Demo extends Applet {
	Frame f;
	@Override
	public void init() {
		// TODO Auto-generated method stub
		 f= new Frame("DEEP");
		f.setVisible(true);
		f.setSize(200,200);
		
		
	}
	
}
@SuppressWarnings("serial")
class FrameD extends Frame
{
	public FrameD (String s){
		super(s);
	}
	@Override
	public synchronized void addWindowListener(WindowListener wl) {
		// TODO Auto-generated method stub
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
			//	System.exit(0);
				dispose();
			}
		});
	}
	
}
