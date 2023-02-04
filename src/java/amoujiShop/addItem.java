/**
 * in this class we add new item to our database by use MYSQL query
 */
package amoujiShop;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import amoujiShop.connectDB;
import java.sql.*;
import javax.servlet.annotation.WebServlet;

//@WebServlet(urlPatterns = {"/addItem"})
public class addItem extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // here we store request value to var.
            String type = request.getParameter("type");
            String model = request.getParameter("model");
            String year = request.getParameter("year");
            String manufacturer = request.getParameter("manufacturer");
            String description = request.getParameter("description");
            String count = request.getParameter("count");
            String price = request.getParameter("price");

            //create our web page by print HTML tag
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\"/>");

            out.println("<title>add Appliances results</title>");
            out.println("</head>");
            out.println("<body>");
            request.getRequestDispatcher("navBar.jsp").include(request, response); // use navBar jsp
            out.println("<div class=\"add-correct\">");

            // here connection with database
            Connection conn = connectDB.getConnection();
            System.out.println("coneccted");

            // insert data to satabase via insert query
            String sql = "INSERT INTO amougi_shop.appliances (Type, Model, Year,Manufacturer, Description, Count, Price_per_Unit ,Creation_DateTime) VALUES (?, ?, ?, ?, ?, ?,?, NOW())";   //NOW() mysql function
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, type);
            pStmt.setString(2, model);
            pStmt.setString(3, year);
            pStmt.setString(4, manufacturer);
            pStmt.setString(5, description);
            pStmt.setString(6, count);
            pStmt.setString(7, price);

            int k = pStmt.executeUpdate();
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
            out.println("</div>");
            request.getRequestDispatcher("footer.jsp").include(request, response); // use navBar jsp
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }

    }
}
