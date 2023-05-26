
import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class newbook extends HttpServlet {

     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
          String s1=request.getParameter("bt");
          String s2=request.getParameter("name");
          String s3=request.getParameter("publisher");
          String s4=request.getParameter("price");
          String s5=request.getParameter("year");
       
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
String q="insert into newbook values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
st.executeUpdate(q);

 response.sendRedirect("newbook.html");
            con.close();
}
catch(Exception e){
	out.println(e);
}
            out.println("</body>");
            out.println("</html>");
        }
    }

    
   