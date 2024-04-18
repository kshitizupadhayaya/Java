package Practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example4 extends MouseAdapter {
    JFrame f;
    JTextField t1,t2;
    public Example4()
    {
        f= new JFrame("hi");
        f.setSize(400,500);
        t1= new JTextField();
        t1.setColumns(20);
        t2=new JTextField();
        t2.setColumns(20);
        f.add(t1);
        f.add(t2);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.addMouseListener(this);
f.addMouseMotionListener(this);

    }
    public void mouseEntered(MouseEvent e)
    {
        t1.setText("in");
    }
    public void mouseExited(MouseEvent e)
    {
        t1.setText("out");
    }
    public void mouseMoved(MouseEvent e)
    {
        String v="x="+e.getX()+"y="+e.getY();
        t2.setText(v);
    }
    public static void main(String[] args) {
      new Example4();
        
    }
}
