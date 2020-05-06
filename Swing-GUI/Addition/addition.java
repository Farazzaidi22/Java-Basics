/**
 * addition
 */

import java.awt.LayoutManager;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*; 

public class addition extends JFrame implements ActionListener
{
    JTextField t1, t2;
    JButton b;
    JLabel l;

    public addition()
    {
        t1 = new JTextField(20);
        t2 = new JTextField(20);

        b = new JButton("OK");
        l = new JLabel("Result");

        b.addActionListener(this);

        add(t1);
        add(t2);
        add(b);
        add(l);

        FlowLayout experimentLayout = new FlowLayout();
        setLayout(experimentLayout);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int value = num1 + num2;
        l.setText(value + "");
    }  
}