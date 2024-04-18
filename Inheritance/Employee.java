package Inheritance;

public class Employee {
    String name;
    int id, monthlysalary;
    public Employee(String name,int id,int monthlysalary)
    {
        this.name=name;
        this.id=id;
        this.monthlysalary=monthlysalary;
    }
    int salary()
    {
        return (this.monthlysalary*12);
    }
    // methord to return details
    String details()
    {
        // call methord salary insted of callling this.monthlysalary
        String q=("name="+this.name+"id="+this.id+"monthly salay="+this.monthlysalary+"salary="+salary());
        return q;
    }

}
