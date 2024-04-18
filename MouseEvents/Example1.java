package MouseEvents;
import java.awt.*;
import javax.swing.*;


import java.awt.event.*;

public class Example1 extends MouseAdapter {
    JFrame f;
    JTextField t1, t2;

    public Example1() {
        f = new JFrame();
        f.setSize(400, 500);
        t1 = new JTextField();
        t2 = new JTextField();
        t1.setColumns(20);
        t2.setColumns(20);
        t1.setToolTipText("show in or out");
        t2.setToolTipText("x and y coordinate");

        f.add(t1);
        f.add(t2);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.addMouseListener(this);
        f.addMouseMotionListener(this);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        t1.setText("in");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        t1.setText("mouse exited");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        String v = "X=" + e.getX() + " Y=" + e.getY();
        t2.setText(v);
    }

    public static void main(String[] arg) {
        new Example1();
    }
}