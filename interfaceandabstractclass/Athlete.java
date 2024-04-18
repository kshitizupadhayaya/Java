package interfaceandabstractclass;
// creatting abstract class
public  abstract class Athlete {
    String name,team;
    public Athlete(String name,String team)
    {
        this.name=name;
        this.team=team;
    }
    // interface 
    // abstarct methoed is used to create interface in abstarct class
abstract void status();
    
}
