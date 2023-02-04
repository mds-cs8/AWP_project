// * in this class we add feedback to our database by use MYSQL query
package amoujiShop;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import amoujiShop.connectDB;

//@WebServlet(urlPatterns = {"/addMsg"})
public class addMsg extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // here we store request value to var.
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone_number = request.getParameter("phone_number");
            String Request = request.getParameter("Request");
            String Subject = request.getParameter("Subject");
            String Message = request.getParameter("Message");

            //print eb page by print HTML tah
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\"/>");
            out.println("<title>add feed4j results</title>");
            out.println("</head>");
            out.println("<body>");
            request.getRequestDispatcher("navBar.jsp").include(request, response); // use navBar jsp
            out.println("<div class=\"add-correct\">");

            // here connection with database
            Connection conn = connectDB.getConnection();
            System.out.println("coneccted");

            // insert data to satabase via insert query
            String sql = "INSERT INTO amougi_shop.feedbacks (Name, Email, Phone_Number,Request_Type,Subject, Message,Creation_DateTime) VALUES (?, ?, ?, ?, ?, ?, NOW())";   //NOW() mysql function
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, name);
            pStmt.setString(2, email);
            pStmt.setString(3, phone_number);
            pStmt.setString(4, Request);
            pStmt.setString(5, Subject);
            pStmt.setString(6, Message);

            int k = pStmt.executeUpdate();
            out.println(k);
            // returns number of affected rows
            if (k == 1) {
                //insert a record success
                out.println("<p class=\"correct\"> Data was added successfully. </p>");

            } else // i.e.  k = 0
            {
                //insert a record error
                out.println("<p class=\"wrong-masg\"> There was an error in adding the data! Try again. </p>");
            }
            out.println("</div>");
            request.getRequestDispatcher("footer.jsp").include(request, response); // use navBar jsp

            out.println("</body>");
            out.println("</html>");

        } catch (Exception ex) {
            out.println("<p class=\"wrong-masg\"> There was an error exception meesage: " + ex + "</p>");
            out.println("</div>");
            request.getRequestDispatcher("footer.jsp").include(request, response); // use navBar jsp

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }

    }
}
