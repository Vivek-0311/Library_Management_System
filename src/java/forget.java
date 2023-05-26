
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class forget extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
          String s1=request.getParameter("enroll");
          String s2=request.getParameter("ename");
          String s3=request.getParameter("epass");
         
        
       
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
st.executeUpdate("update login set password='"+s3+"' where rollno='"+s1+"' AND name='"+s2+"'");

 response.sendRedirect("forgetsuc.html");
            con.close();
}
catch(Exception e){
	out.println(e);
}
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    