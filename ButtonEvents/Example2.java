package ButtonEvents;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Example2  extends JFrame implements ActionListener{
    JButton b1;
    JTextField t1,t2;
    public Example2()
    {   setSize(500,500);
        b1= new JButton("go");
        t1=new JTextField();
        t1.setColumns(20);
        t2=new JTextField();
        t2.setColumns(20);
        
        add(t1);
        add(b1);
        add(t2);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Font f= new Font("Aerial",Font.BOLD,20);
        t2.setFont(f);
        t2.setBackground(Color.RED);
        t2.setForeground(Color.BLUE);
        String text=t1.getText();
        t2.setText(text.toUpperCase());

    }
    public static void main(String[]args)
    {
        new Example2();
    }
    
}
