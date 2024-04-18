package Database;
import java.sql.*;



public class Example1 {
    public static void main(String[] args)
{
    String username="root";
    String url=("jdbc:mysql://localhost:33061//kshitiz");
    String pw="";
    try
{
Class.forName("com.mysl.jdbc.driver");
Connection cn=DriverManager.getConnection(url, username, pw);
Statement st=cn.createStatement();
String q= "SELECT*FROM ram";
ResultSet rs =st.executeQuery(q);
while(rs.next())
{
    System.out.println("name"+rs.getString(1)+"id"+rs.getInt(2)+"salary"+rs.getInt(3)+"kid"+rs.getInt(4)+"cid"+rs.getInt(5));
}
cn.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
    
}
