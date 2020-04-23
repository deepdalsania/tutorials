package applet;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


@SuppressWarnings("serial")
public class Menubar extends Frame{
		
		
	    Frame f;
		public Menubar(){
			
		
		f = new Frame("Frame");
		MenuBar mb = new MenuBar();
		Menu m = new Menu("File");
		Menu sb = new Menu("Save");

		m.add(new MenuItem("New"));
		m.add(new MenuItem("Open"));
	
		sb.add(new MenuItem("SaveAs"));
		sb.add(new MenuItem("SaveAll"));
		m.add(sb);
		m.add(new MenuItem("Print"));
		m.add(new MenuItem("Refresh"));
		m.add(new MenuItem("Exit"));
		mb.add(m);
		f.setMenuBar(mb);
		f.setSize(300, 300);
		f.setLocale(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we) {
					f.dispose();
				}
			});
		}
		
		
		public static void main(String[] args) {
		
			new Menubar();
		}
	}


