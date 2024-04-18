package Url;
import java.net.*;

public class Inet
 {
 public static void main(String[] args) throws Exception
 {

    InetAddress[] netflix=InetAddress.getAllByName("WWW.netflix.com");
    for (InetAddress i : netflix) 
        
  
    {
        System.out.println(i.getHostAddress());
    }
    InetAddress host=InetAddress.getLocalHost();
    {
        System.out.println("host adress="+host.getHostAddress());
        System.out.println("hostname="+host.getHostName());
    }
 }   
}
