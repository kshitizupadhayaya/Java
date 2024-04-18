package ButtonEvents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example1  extends JFrame implements ActionListener
{
JButton b1;
JTextField t1,t2;
  public Example1()
  
    {   
         setSize(400,500);
         b1=new JButton("click");
         t1=new JTextField();
         t1.setColumns(20);
         t2= new JTextField();
         t2.setColumns(20);
         add(t1);
         add(b1);
         add(t2);
         setLayout(new FlowLayout(FlowLayout.LEFT));
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(t1.getText());
        if(n1%2==0)
        {
        t2.setText("even");
        }
        else{
            t2.setText("odd");
        }
    }
    public static void main(String[] args) {
        new Example1();
    }
    
}
