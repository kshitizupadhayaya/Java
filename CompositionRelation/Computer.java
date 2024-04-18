package CompositionRelation;
public class Computer
{

  String brand, price;
  // here storage class works as data type
  Storage s;

  public Computer (String brand, String price, Storage s)
  {
    this.brand = brand;
    this.price = price;
    this.s = s;

  }
   @Override public String toString ()
  {
    return ("brand=" + this.brand + "  " + "price=" + this.price + "  " +
	    this.s);

  }
  public static void main (String[]args)
  {
    // first we have to create obj of storage class as now it works as data type absence of  obj of class storage we cannot implement class computer
    Storage a = new Storage ("ssd", "32 gb");
    // here a obj of storage class is placed in place of storage data type
    Computer c = new Computer ("asus", "seventy thoussand", a);

    System.out.println (c);
  }
}
