package Practice;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Example2 extends JFrame implements ActionListener
{
    JButton b1;
    JTextField t1,t2;
    public Example2()
    {
        setSize(400,500);
    
        b1= new JButton("go");
        t1= new JTextField();
        t1.setColumns(20);
        t2= new JTextField();
        t2.setColumns(20);
        add(t1);
        add(b1);
        add(t2);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        Font f = new Font("Aerial",Font.BOLD,20);
        t2.setFont(f);
        t2.setForeground(Color.RED);
        t2.setBackground(Color.BLUE);
        t2.setText(t1.getText().toUpperCase());
    }
    public static void main(String[] args) {
        new Example2();
    }
}
