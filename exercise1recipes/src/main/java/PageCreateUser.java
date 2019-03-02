
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
 * @author frizz
 */
public class PageCreateUser {

    public static void CreateUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Data_access acc = new Data_access();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            acc.createUser(username, password);
        } catch (Exception e) {
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet lol</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>You have created a new user!</h1>");
            out.println("<p><a href=\"/exercise1recipes/lol?action=main\">Return to main page</a></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
