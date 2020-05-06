/**
 * calculator
 */
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*; 


public class calculator extends JFrame implements ActionListener{

    JTextField t1, t2;
    JButton b1, b2;
    JLabel l;

    public calculator()
    {
        t1 = new JTextField(20);
        t2 = new JTextField(20);

        b1 = new JButton("ADD");
        b2 = new JButton("SUB");

        l = new JLabel("Result: ");

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(t1);
        add(t2);
        add(b1);
        add(b2);
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
        int value = 0;


        if(e.getSource() == b1)
        {
            value = num1 + num2;
        }
        else
        {
            value = num1 - num2;
        }

        l.setText(value + "");

    }  

}