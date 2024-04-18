package Practice;



import javax.swing.*;
public class Box extends JFrame {
    JButton b1,b2,b3,b4,b5;
    public Box()
    {
     
        setVisible(true);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.PAGE_AXIS));
        b1= new JButton("bin 1");
        b2= new JButton("bin 2");
        b3=new JButton("bin 3");
        b4=new JButton("long   name   button  ");
        b5=new JButton("bin 5");
        b1.setAlignmentX(CENTER_ALIGNMENT);
        b2.setAlignmentX(CENTER_ALIGNMENT);
        b3.setAlignmentX(CENTER_ALIGNMENT);
        b4.setAlignmentX(CENTER_ALIGNMENT);
        b5.setAlignmentX(CENTER_ALIGNMENT);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    public static void main(String[] args) {
        new Box();
    }
}
