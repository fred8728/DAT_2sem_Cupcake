/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tobias
 */
public class PageLogin {

    public static void generateLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try (PrintWriter out = response.getWriter()) {
            Data_access acc = new Data_access();
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            try {
                if (acc.comparePassword(username, password)) {
                    out.println("<p><a href=\"/exercise1recipes/lol?action=main\">Confirm login!</a></p>");
                }
            } catch (Exception e) {
            }
            try {
                if (acc.comparePassword(username, password) != true) {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet lol</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Login!</h1>");
                    out.println("<p><a href=\"/exercise1recipes/lol?action=login\">Wrong ussername or password</a></p>");
                    out.println("<p><a href=\"/exercise1recipes/lol?action=newuser\">create new user here?</a></p>");
                    out.println("</body>");
                    out.println("</html>");
                }
            } catch (Exception e) {
            }
            /* TODO output your page here. You may use following sample code. */

        }
    }
}
