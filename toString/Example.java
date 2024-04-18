package toString;

public class Example {
    String name;
    int age;
    Example(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    // using to string function 
    public String toString()
    {
        return ("name="+this.name+"\n"+"roll="+this.age);
    }
    public static void main(String[] args)
    {
        Example e= new Example("kshitiz", 20);
        // printing values 
        // normally we also have to call function name for printing value written in function but for to string we donot need to call function name with object of class
        System.out.println(e);
    }
    
}
