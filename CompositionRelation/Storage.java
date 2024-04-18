package CompositionRelation;
// create class storagae
public class Storage 
{
String type, memoryspace;
public Storage(String type,String memoryspace)
{
this.type=type;
this.memoryspace=memoryspace;
}

 public String toString()
{
    return("type="+this.type+"  "+"memoryspace="+this.memoryspace);
}
    
}
