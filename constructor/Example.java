package constructor;

public class Example
{
  int age;
  int roll;
  // DEFAULT CONSTRUCTOR
  public Example ()
  {
    System.out.println ("defult constructor called\n");
  }
  //PARAMETERIZIED CONSTRUCTOR
  public Example (int age, int roll)
  {
    System.out.println ("parameterized constructor called \n    ");
    this.age = age;
    this.roll = roll;
  }
  // COPY CONSTRUCTOR
  Example (Example k)
  {
    System.out.println ("copy condtructor called");
    age = k.age;
    roll = k.roll;

  }
  
  public static void main (String[]args)
  {
    // parametried constructor call
    Example e = new Example (10, 20);

    //defult constructor call

    Example e1 = new Example ();
    

    //copy construcator call
    //to call copy constructor we have to input parametriozed call as argument and then we create new class obj to call it
    Example e2=new Example(e);
    Example e4=e2;

    System.out.println (e.age);
    System.out.println (e.roll);
    System.out.println (e1.age);
    System.out.println (e1.roll);
    System.out.println(e4.age);
    System.out.println(e4.roll);
    


  }

}
