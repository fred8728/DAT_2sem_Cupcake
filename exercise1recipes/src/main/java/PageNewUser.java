
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emils
 */
public class PageNewUser {

    public static void generateUser(HttpServletResponse response) throws IOException {

        try (PrintWriter out = response.getWriter()) {
            Data_access acc = new Data_access();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet lol</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Make a new User!</h1>");
            out.println("<p><a href=\"/exercise1recipes/lol?action=newuser\">Log in</a></p>");
            out.println("<form method=\"GET\">" //post
                    + "Username:<br>"
                    + "<input type=\"text\" name=\"username\" value=\"\"><br>"
                    + "Login:<br>"
                    + "<input type=\"password\" name=\"password\" value=\"\"><br><br>"
                    + "<input type=\"hidden\" name=\"action\" value=\"create_user\">"
                    + "<input type=\"submit\" value=\"Login\">"
                    + "</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
