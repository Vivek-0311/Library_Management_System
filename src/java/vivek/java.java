
import java.sql.*;


class java
{
public static void main(String[] ar)
{
    try
{
    
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///ayudb","root","root");
Statement st=con.createStatement();
String q="insert into login values('sita','jii')";
st.executeUpdate(q);
con.close();
}
catch(Exception e){
	System.out.println(e);
}
}
}