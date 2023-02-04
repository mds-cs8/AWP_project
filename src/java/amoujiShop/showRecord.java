// in this class we select data from DB and show it in web page
package amoujiShop;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import amoujiShop.connectDB;

//@WebServlet(urlPatterns = {"/showRecord"})
public class showRecord extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            //print eb page by print HTML tah
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\"/>");
            out.println("<title>show Appliances records</title>");
            out.println("</head>");
            out.println("<body>");
            request.getRequestDispatcher("navBar.jsp").include(request, response);
            out.println("<div class=\"table--container\">");

            // here connection with database
            Connection conn = connectDB.getConnection();
            System.out.println("coneccted");

            // select data from satabase via select query
            String sql = "select * from amougi_shop.appliances";
            PreparedStatement pStmt = conn.prepareStatement(sql);
            ResultSet rs = pStmt.executeQuery();

            if (!rs.isBeforeFirst()) { // if nothing in DB
                out.println("<p> No registration records in database! </p>");
            } else {
                out.println("<table>");
                out.println("<tr class=\"thead\">");
                out.println(" <th>ID</th>");
                out.println("<th>Type</th>");
                out.println(" <th>Model</th>");
                out.println("<th>Year</th>");
                out.println("<th>Count</th>");
                out.println("<th>Price</th>");
                out.println("<th>DateTime</th>");
                out.println("</tr>");
                while (rs.next()) {
                    //create table to display data
                    out.println("<tr>");
                    out.println("<td>" + rs.getInt(1) + "</td>");
                    out.println("<td>" + rs.getString(2) + "</td>");
                    out.println("<td>" + rs.getString(3) + "</td>");
                    out.println("<td>" + rs.getString(4).substring(0, 4) + "</td>");
                    out.println("<td>" + rs.getInt(7) + "</td>");
                    out.println("<td>" + rs.getDouble(8) + "</td>");
                    out.println("<td>" + rs.getTimestamp(9) + "</td>");
                    out.println("</tr>");
                }

                out.println("</table>");
            }

            out.println("</div>");
            request.getRequestDispatcher("footer.jsp").include(request, response); // use navBar jsp

            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {
            //throw new ServletException(ex);
            out.println("<p class=\"wrong-masg\"> There was an error exception meesage: " + ex + "</p>");
            out.println("</div>");
            out.println("</div>");

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }

    }
}
