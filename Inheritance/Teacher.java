package Inheritance;
// extending child class 
public class Teacher  extends Employee{
    String name;
    int id,monthlysalary,nos;

    public Teacher(String name,int id,int monthlysalary,int nos)
    {
        // using super class to inherit from empoyee class
        super(name,id,monthlysalary);
        this.nos=nos;
    }
    @Override
    int salary()
    {
        return (super.salary()+nos*1000);
    }
    String details()
    {
        String q=(super.details()+"nos="+this.nos);
        return q;
    }
public static void main(String[] args)
{
    Employee e= new Employee("kshitiz", 12, 10000);
    Teacher t=new Teacher("ram", 02, 1000, 2);
    System.out.println("employee details");
    System.out.println(e.details());
    System.out.println("teacher details");
    System.out.println(t.details());

}
    
}
