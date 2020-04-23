package applet;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class AppletDemo extends Applet {

	
	String s = "";
	@Override
	public void init() {
		// TODO Auto-generated method stub
	s+="init "; //only one time call means at initialization time
	
	
	}
	public void start() {
		// TODO Auto-generated method stub
		s+="start "; // call after init method but when we close temporary again it call 
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		s+="stop "; //when we minimize the appletviewer at that time it call after that start is again call at maximize time
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Applet Destroy permanently");
	}
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString(s, 50, 50);
		}

}
