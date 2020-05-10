/**
 * MouseListner
 */
import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//import jdk.internal.org.jline.terminal.MouseEvent;

import java.awt.event.*; 


public class MouseListner extends JFrame {

    
    public MouseListner(){

        addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
                int x = e.getX();
                int y = e.getY();

                System.out.println(x + " , "  + y);
            }
        });

        
        FlowLayout experimentLayout = new FlowLayout();
        setLayout(experimentLayout);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}