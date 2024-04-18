import java.awt.*;
public class Grid extends Frame {
    Button b1,b2,b3,b4,b5,b6;
    public Grid()
{
    
    b1=new Button("1");
    b2=new Button("2");
    b3=new Button("3");
    b4=new Button("4");
    b5=new Button("5");
    b6=new Button("6");
   add(b1);
   add(b2);
   add(b3);
   add(b4);
   add(b5);
   add(b6);
  
  // Button[] btn=new Button[6];
  // 
  //
  // for(int i=0;i<btn.length;i++)
  // {
  //    btn[i]=new Button(""+(i+1));
  //    add(btn[i]);
  // }
    setSize(400,500);
    setVisible(true);
   
    //1.setLayout(new GridLayout());
    
    
    
    //2.setLayout(new GridLayout(2,3));



    setLayout(new GridLayout(5,2,23,50));
 
}
public static void main(String[] args)
{
    new Grid();
}
    
}
