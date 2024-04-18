package Exceptionhandling.CustomException;

public class Student
{
  String name;
  int Semister;
  // throws our own exception Semister
  public Student (String name, int Semister) throws Semister
  {
    if (Semister < 1 || Semister > 8)
      {
	throw new Semister ("invalied try again");
      }
    else
      {
	this.name = name;
	this.Semister = Semister;
      }
  }

  void det ()
  {
    System.out.println ("name=" + name + "sem=" + Semister);
  }
  public static void main (String[]args)
  {
    try
    {
      Student s = new Student ("ram", 4);
      s.det ();
    }
    // cath exception Semister
    catch (Semister e)
    {
      System.out.println (e.getMessage ());
    }
  }

}
