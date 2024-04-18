package interfaceandabstractclass;

public class test {
    public static void main(String[] args)
    {
        // 1. create obj of abstract class
        // 2. define a new child class with the help of abstract class
        // 3. call a interface methord with the help of obj of abstract class
        Athlete a=new Cricket("ram", "shyam", 100);
       a.status();
        Athlete b=new football("ram", "shyam", 100);
     b.status();

    }
  
}
