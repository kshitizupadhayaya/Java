package Practice;
import java.net.*;
public class Inett 
{
    public static void main(String[] args) throws Exception 
    {
        InetAddress inet=InetAddress.getByName("www.ncit.edu.np");
        System.out.println("hostname="+inet.getHostName());
        System.out.println("ip address="+inet.getHostAddress());
    
        InetAddress[] netflix= InetAddress.getAllByName("www.netflix.com");
        for(InetAddress i:netflix)
        {
        System.out.println("hostname="+i.getHostAddress());
        }
        InetAddress local= InetAddress.getLocalHost();
        System.out.println("local hostname="+local.getHostName());
        System.out.println("local Hostaddress="+local.getHostAddress());

System.out.println("is loop.,back="+local.isLoopbackAddress());
System.out.println("is multicast="+local.isMulticastAddress());
System.out.println("is+"+InetAddress.getLoopbackAddress());


     }
  

}
