package Url;
import java.net .*;

public class Example1 
{
    public static void main(String[] args) throws Exception
    {
      URL url= new URL("https://ncit.com/student/sem=?.#fb.com");
      System.out.println("host"+url.getHost());
      System.out.println("port"+url.getPort());
      System.out.println("path="+url.getPath());
      System.out.println("ref"+url.getRef());
      System.out.println("comb of both hostport and port ="+url.getAuthority());
    }
    
}
