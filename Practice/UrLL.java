package Practice;
import java.net.*;

public class UrLL {
    public static void main(String[] args) throws Exception
     {
        URL url= new URL("https://ncit.com/student/sem=?.#fb.com");
        System.out.println("protocal="+url.getProtocol());
        System.out.println("host="+url.getHost());
        System.out.println("port="+url.getPort());
        System.out.println("default port="+url.getDefaultPort());
        System.out.println("authority="+url.getAuthority());
        System.out.println("path="+url.getPath());
        System.out.println("querySTring="+url.getQuery());
        System.out.println("refrence="+url.getRef());
    }
}
