import java.awt.LayoutManager;
import java.awt.*;  
import javax.swing.*;  
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Demo_swing
 */
public class Demo_swing extends JFrame // by deafult cardlayout
{
    public Demo_swing() {
        FlowLayout experimentLayout = new FlowLayout();
        setLayout(experimentLayout);
        JLabel l = new JLabel("Hello world");
        JLabel l1 = new JLabel("Hello faraz");

        add(l);
        add(l1);
    }    
}