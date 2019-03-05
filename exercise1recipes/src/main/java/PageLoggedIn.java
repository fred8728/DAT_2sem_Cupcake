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
public class PageLoggedIn {

    public static void generateLoggedIn( HttpServletResponse response) throws IOException {

        try (PrintWriter out = response.getWriter()) {
            
            //  else{
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FrontController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Log in here!</h1>");
            out.println("<form method=\"GET\">" //post
                    + "Username:<br>"
                    + "<input type=\"text\" name=\"username\" value=\"\"><br>"
                    + "Login:<br>"
                    + "<input type=\"password\" name=\"password\" value=\"\"><br><br>"
                    + "<input type=\"hidden\" name=\"action\" value=\"logged-in\">"
                    + "<input type=\"submit\" value=\"Login\">"
                    + "</form>");

            out.println("</body>");
            out.println("</html>");

            // }
        }
    }
}
