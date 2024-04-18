package ButtonEvents;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class Example4  implements ActionListener
 {
    JButton b1,b2;
    JTextField t1,t2,t3;

    JFrame f;

    public Example4()
    {

        f = new JFrame();
        f.setSize(500,400);

        b1=new JButton("+");
        b2=new JButton("-");
        t1= new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t1.setColumns(20);
        t2.setColumns(20);
        t3.setColumns(20);
        
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(t3);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
public void actionPerformed(ActionEvent e)
    {

      int n1=Integer.parseInt(t1.getText());
      int n2=Integer.parseInt(t2.getText());
      if(e.getSource()==b1)
      {
   t3.setText(""+(n1+n2));

      
      }
      else if(e.getSource()==b2){
        t3.setText(""+(n1-n2));
      
      
      }
    }
    public static void main(String[] args)
    {
       new Example4();
        
    }
   
 }