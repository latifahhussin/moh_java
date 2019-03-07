import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet(urlPatterns = {"/film"})
public class FilmServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        Connection con = null; // import java.sql.Connection;
        Statement stmt = null; // import java.sql.Statement;
        ResultSet rs = null; //import java.sql.ResultSet;
        
        PrintWriter out = response.getWriter(); //mesti kena import java.io.PrintWriter; - barulah boleh pakai out.print di bahagian bawah
        
        try{
            // load driver
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.cj.jdbc.Driver");
           //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York","root",""); 
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","");
           stmt = con.createStatement();
           String sql = "SELECT * FROM film";
           rs = stmt.executeQuery(sql);
          
           out.print("<table border='1'>");
           out.print("<tr>");
           out.println("<td>ID</td>");
           out.println("<td>Title</td>");
           out.println("</tr>");
           
           while(rs.next()){ // bila ada query
               int id= rs.getInt("film_id"); //cara untuk buat int - getInt
               
               out.println("<tr>");
               out.print("<td>"+ id + "</td>");
               out.print("<td>"+ rs.getString("Title") + "</td>");
               out.println("</tr>");
           }
            out.print("</table>");
      
        }catch (Exception e) {
            System.out.println("Masalah Teknikal");
            System.out.println(e.getMessage());
        }
    }

}