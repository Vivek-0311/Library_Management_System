
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class statics extends HttpServlet {

 
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
          
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet log</title>");            
            out.println("<link rel='stylesheet' href='show.css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("  <div id='warpper'><div class='container'><div class='nav-items'><div><a href='newstudent.html'>New Student</a></div><div><a href='newbook.html'>New Book</a></div> <div><a href='statics'>Statistics</a></div><div><a href='issue.html'>Issue Book</a></div><div><a href='return.html'>ReturnBook</a></div><div><a href='index.html'>Logout</a></div></div></div></div>");
            
        try
{
    
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signupdb?autoReconnect=true&useSSL=false","root","root");
Statement st=con.createStatement();
String q="select * from issuebooks";
ResultSet rs=st.executeQuery(q);
            
            out.println("<div class='show'>");
            out.println("<table cellpadding='1' cellspacing='1'>");
            out.println("<caption><div class='issue'>Issue Book</div></caption>");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>Student ID</th>");
            out.println("<th>Book ID</th>");
            out.println("<th>Issue Date</th>");
            out.println("<th>Due Date</th>");
            out.println("<th>Return</th>");
            out.println(" </tr>");
            out.println("</thead>");
while(rs.next())
{
            out.println("<tr>");
            out.println("<td>"+rs.getString(1)+"</td>");
            out.println("<td>"+rs.getString(2)+"</td>");
            out.println("<td>"+rs.getString(3)+"</td>");
            out.println("<td>"+rs.getString(4)+"</td>");
            out.println("<td>"+rs.getString(5)+"</td>");        
            out.println(" </tr>");

}   
            out.println("</table>");
            out.println("</div>");
      

            con.close();
}
catch(Exception e){
	out.println(e);
}
            out.println("</body>");
            out.println("</html>");
        }
    }

    
     