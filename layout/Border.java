import java.awt.*;
public class Border extends Frame
{
    // creating button 
  Button b1, b2, b3, b4, b5;
  public Border ()
  {
    // setting title for the frame
	setTitle ("first");
	b1 = new Button ("north");
	b2 = new Button ("south");
	b3 = new Button ("east");
	b4 = new Button ("west");
	b5 = new Button ("center");
    // setting border layout 
	setLayout (new BorderLayout ());
    // if we want gap 


    //setLayout(new BorderLayout( 10,10));

    
    // adding  button to specific location  
	add (b1, BorderLayout.NORTH);
	add (b2, BorderLayout.SOUTH);
	add (b3, BorderLayout.EAST);
	add (b4, BorderLayout.WEST);
	add (b5, BorderLayout.CENTER);
	setSize (400, 500);
   // pack();
	setVisible (true);

  }
  public static void main (String[]arg)
  {
	new Border ();
  }

}
