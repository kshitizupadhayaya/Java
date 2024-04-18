import java.awt.*;
import javax.swing.*;

public class Box extends JFrame {

    JButton b1, b2, b3, b4, b5;

    public Box() {
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("long  utton  4 helli ");
        b5 = new JButton("5");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b5.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        
//b1.setAlignmentY(Component.CENTER_ALIGNMENT);
//b2.setAlignmentY(Component.CENTER_ALIGNMENT);
//b3.setAlignmentY(Component.CENTER_ALIGNMENT);
//b4.setAlignmentY(Component.CENTER_ALIGNMENT);
//b5.setAlignmentY(Component.CENTER_ALIGNMENT);




        // allign from x axis 
        
        //setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        // allign from y axis 
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // same as x axis
       // setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));

// same as y axis 
        //setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Box();
    }
}