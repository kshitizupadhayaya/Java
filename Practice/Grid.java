package Practice;
import java.awt.*;
public class Grid extends Frame {
    Button b1,b2,b3,b4,b5;
    public Grid()
    {
        setSize(400,500);
        setVisible(true);
        setLayout(new GridLayout(3,2));
        b1= new Button("east");
        b2= new Button("west");
        b3=new Button("north");
        b4=new Button("south");
        b5=new Button("center");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    
    
}
public static void main(String[] args) {
    new Grid();
}
}