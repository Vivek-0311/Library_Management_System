
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class newstudent extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
          String s1=request.getParameter("st");
          String s2=request.getParameter("name");
          String s3=request.getParameter("fathername");
          String s4=request.getParameter("course");
       
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
String q="insert into newstudent values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
st.executeUpdate(q);
 response.sendRedirect("newstudent.html");
out.println("<script type=\"text/javascript\">"); 
out.println("alert('Successfull');"); 
out.println("</script>"); 
            con.close();
}
catch(Exception e){
	out.println(e);
}
            out.println("</body>");
            out.println("</html>");
        }
    }

    
   