package Menu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
public class Menu extends MouseAdapter {
    JFrame f;
    JMenu file;
    JMenuItem select,copy,paste,exit;
    JMenuBar b;
    JTextArea t;
    JLabel l;
    public Menu()
    {
        f= new JFrame();
        f.setSize(400,500);
        b=new JMenuBar();
        f.setJMenuBar(b);
        file =new JMenu("file");
        b.add(file);
     
        select=new JMenuItem("select");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        exit=new JMenuItem("exit");
        t=new JTextArea("type here");
        l=new JLabel();
        f.add(t);
        file.add(select);
        file.add(copy);
        file.add(paste);
        file.add(exit);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        select.addActionListener(e -> {
            t.selectAll();
        });
        copy.addActionListener( e ->{
            t.copy();
        });
        paste.addActionListener(e ->{
            t.paste();
        });
        exit.addActionListener(e->
        {
              System.exit(0);
        });
        f.addMouseListener(this);

    }
    public void mouseClicked(MouseEvent e)
    {
        l.setText("you clicked");
    }
    public static void main(String[] args )
    {
        new Menu();
    }
}
