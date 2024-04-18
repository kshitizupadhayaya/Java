package interfaceandabstractclass;

public class football extends Athlete {
    int goals;
    public football(String name,String team,int goals)
    {
        super(name,team);
        this.goals=goals;
    }
       // implementing interface methord
    public void status()
    
    {
        System.out.println("name="+name+"  " +"team name="+team+"  "+"gols="+this.goals);

    }
    
}
