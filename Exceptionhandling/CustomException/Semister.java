package Exceptionhandling.CustomException;
// we create our own exception called Semister 
public class Semister extends Exception {
    public Semister(String msg)
    {
        super(msg);
    }
    
}
