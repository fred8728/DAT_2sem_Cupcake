/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.maven.frontcontrollertest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tobias
 */
public class PageLogin
{

    public static void generateLogin(HttpServletResponse response) throws IOException
    {
        
        try (PrintWriter out = response.getWriter())
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FrontController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Login!</h1>");
            out.println("<p><a href=\"/FrontControllerTest/FrontController?action=login\">Log in</a></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
