package ButtonEvents;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Example3 extends JFrame implements ActionListener
{
JButton red,blue,green;
public Example3()
{
    red=new JButton("Red");
    blue=new JButton("Blue");
    green=new JButton("Green");
    add(red);
    add(blue);
    add(green);
    setLayout(new FlowLayout(FlowLayout.LEFT));
    setVisible(true);
    setSize(500,500);
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
    else if(e.getSource()==blue)
    {
      getContentPane() . setBackground(Color.BLUE);
    }
    else
    {
     getContentPane() .  setBackground(Color.GREEN);
    }

}
public static void main(String[] args)
{
    new Example3();
}
    
}
