package extraknowledge;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.GridLayout;
 
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
@SuppressWarnings("serial")
public class FlowLayoutDemo extends JFrame {
 
    public FlowLayoutDemo() {
        createJFrame();
    }
 
    private void createJFrame() {
        setTitle("FlowLayout left to right");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
 
        // add content to JFrame
        add(createMainPanel());
 
        setLocationRelativeTo(null);
        setVisible(true);
    }
 
    private JPanel createMainPanel() {
        // create main panel
        JPanel panel = new JPanel(new GridLayout(5, 1, 5, 5));
        // add panels item with align
        panel.add(cereateItemPanel(FlowLayout.LEFT, "LEFT"));
        panel.add(cereateItemPanel(FlowLayout.CENTER, "CENTER"));
        panel.add(cereateItemPanel(FlowLayout.RIGHT, "RIGHT"));
        panel.add(cereateItemPanel(FlowLayout.LEADING, "LEADING"));
        panel.add(cereateItemPanel(FlowLayout.TRAILING, "TRAILING"));
        return panel;
    }
 
    // create JPanel with align and JLabel title
    private JPanel cereateItemPanel(int align, String title) {
        // create JPanel
        JPanel panel = new JPanel(createFlowLayout(align));
        // set Component Orientation
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        // add JLabel
        panel.add(createJLabel(title));
        return panel;
    }
 
    // create FlowLayout with align
    private FlowLayout createFlowLayout(int algin) {
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(algin);
        return layout;
    }
 
    // create JLabel with title and icon
    private JLabel createJLabel(String title) {
        JLabel label = new JLabel(title);
        // get icon for JLabel
        Icon icon = new ImageIcon(getClass().getResource("linkedin.png"));
        label.setIcon(icon);
        // set location for text label
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        return label;
    }
 
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}