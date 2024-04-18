import java.awt.*;
public class Flow extends Frame  
{
 Button b1,b2,b3,b4,b5;
public Flow()
{//
 // Button[] btn =new Button[6];
 // for(int i=0;i<btn.length;i++)
 // {
 //     btn[i]=new Button(""+(i+1));
 //     add(btn[i]);
 // }
 b1=new Button("1");
  b2=new Button("2");
  b3=new Button("3");
  b4=new Button("4");
  b5=new Button("5");
 
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 add(b5);


 // allign the component through left margin
 //setLayout( new FlowLayout(FlowLayout.LEFT));


 // allign the component through center margin
  //  setLayout( new FlowLayout(FlowLayout.CENTER));

  // allign the component through right margin
 // setLayout( new FlowLayout(FlowLayout.RIGHT));

  // allign the component through right margin
  //setLayout( new FlowLayout(FlowLayout.LEADING));


  // allign the component through trailing margin
  setLayout( new FlowLayout(FlowLayout.TRAILING));


    setSize(500, 400);
    setVisible(true);
}
public static void main(String[] args)
{
    new Flow();
}
}
