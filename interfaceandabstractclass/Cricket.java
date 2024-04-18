package interfaceandabstractclass;

public class Cricket extends Athlete
 {
    int runs;

    public Cricket( String name,String team,int runs)
    {
        // inheriting from abstract calls
        super(name, team);
        this.runs=runs;
    }
    // implementing interface methord
public void status()
{
   System.out.println("name="+name+"  " +"team name="+team+"  "+"runs="+runs);
}
    
}
