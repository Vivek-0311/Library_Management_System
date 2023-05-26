

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class issue extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
          String s1=request.getParameter("bookid");
          String s2=request.getParameter("studentid");
          String s3=request.getParameter("issue");
          String s4=request.getParameter("due");
          String s5="No";
       
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet log</title>");            
            out.println("</head>");
            out.println("<body>");
        try
{
    
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signupdb?autoReconnect=true&useSSL=false","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from newbook where bookID='"+s1+"'");
if(rs.next())
{
ResultSet rs1=st.executeQuery("select * from newstudent where studentID='"+s2+"'");
if(rs1.next())
{
String q="insert into issuebooks values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
st.executeUpdate(q);
 response.sendRedirect("issue.html");
}
else{
            out.println("invalid studentID");
}
}
else{
            out.println("invalid bookID");
}
            con.close();
}
catch(Exception e){
	out.println(e);
}
            out.println("</body>");
            out.println("</html>");
        }
    }

    
   