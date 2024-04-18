package arraylist;
import java.util.ArrayList;
public class Example
{
  public static void main (String[]args)
  {
    // creating array list
    ArrayList < Integer > num = new ArrayList <> ();
    //  initilizing array
    num.add (100);
    num.add (200);
    num.add (300);
    num.add (400);
// printing  whole array
System.out.println(" THE LISTED ARRAY");
    System.out.println (num);
// printing a desied number from array
    System.out.println (num.get (1));
// to replace any number from array
//placing 500 at index 2
    num.set (2, 500);
// to remove any array   -removing number from index 3
    num.remove (3);
    System.out.println("ARRAY AFTER REMOVING AND SETTING ");
    System.out.println(num);
  }

}
