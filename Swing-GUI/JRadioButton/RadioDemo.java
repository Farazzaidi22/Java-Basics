/**
 * RadioDemo
 */
import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.*; 

public class RadioDemo extends JFrame
{
    /**
     *
     */
    JTextField t1;
    JButton b;
    JRadioButton r1,r2;
    JLabel l;

    public RadioDemo()
    {
        t1 = new JTextField(20);

        b = new JButton("OK");
        
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

        l = new JLabel("Greetings");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t1);
        add(r1);
        add(r2);
        add(b);
        add(l);

        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet");
                String name = t1.getText();

                if(r1.isSelected())
                {
                    name = "Mr. " + name;
                }
                else{
                    name = "Ms. " + name;
                }

                l.setText(name);
            }  
        });

        FlowLayout experimentLayout = new FlowLayout();
        setLayout(experimentLayout);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}