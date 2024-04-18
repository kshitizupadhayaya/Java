package Practice;
import java.awt.*;
public class Border  extends Frame{
    Button b1,b2,b3,b4,b5;
    public Border()
    {
        setSize(400,500);
        setVisible(true);
        setLayout(new BorderLayout());
        b1= new Button("east");
        b2= new Button("west");
        b3=new Button("north");
        b4=new Button("south");
        b5=new Button("center");
        add(b1,BorderLayout.EAST);
        add(b2,BorderLayout.WEST);
        add(b3,BorderLayout.NORTH);
        add(b4,BorderLayout.SOUTH);
        add(b5,BorderLayout.CENTER);

    }
    public static void main(String[] args) {
        new Border();
    }
}
