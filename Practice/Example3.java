package Practice;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Example3 extends JFrame implements ActionListener {
    JButton red, blue, green;

    public Example3() {
        setSize(400, 500);

        red = new JButton("red");
        blue = new JButton("blue");
        green = new JButton("green");

        add(red);
        add(blue);
        add(green);

        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==red)
        {
            getContentPane().setBackground(Color.RED);
        }
     else   if(e.getSource()==blue)
        {
            getContentPane().setBackground(Color.BLUE);
        }
       else if(e.getSource()==green)
        {
            getContentPane().setBackground(Color.GREEN);
        }
    }
public static void main(String[] args) {
    new Example3();
}}

       