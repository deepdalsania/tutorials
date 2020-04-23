package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


@SuppressWarnings("serial")
public class Mouse_Demo extends Applet {

	@Override
	public void init() {
		// TODO Auto-generated method stub
				setBackground(Color.cyan);
				addMouseListener(new MouseAdapter()           //this mechanism is clla inner anonymous class
				{
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					setBackground(Color.BLUE);
				}
				}
				);
	}

	/*public void mouseClicked(MouseEvent arg0) { if we implements mouselistner then we have to define all the methods of that interface
	 * but if we want only one method click the we have to extend class mouse addpter but multiple extends are not allow in java
	 * so we declare another class and extend mouse adapter from that class constructor we call super class constructor then also code
	 * is increase so it is not batterr idea so we have to do different for reduce the code.
		// TODO Auto-generated method stub
		setBackground(Color.BLUE);
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		setBackground(Color.GRAY);
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		setBackground(Color.GREEN);
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		setBackground(Color.ORANGE);
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}*/
}
/*class ABC extends MouseAdapter*/