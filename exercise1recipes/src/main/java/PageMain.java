
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tobias
 */
public class PageMain {

    public static void generateMain(HttpServletResponse response) throws IOException {

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet lol</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Main landing page!</h1>");
            out.println("<p><a href=\"/exercise1recipes/lol?action=newuser\">Create new user!</a></p>");
            out.println("<p><a href=\"/exercise1recipes/lol?action=buy\">Buy something</a></p>");
            out.println("<p><a href=\"/exercise1recipes/lol?action=login\">Log in here!</a></p>");
            out.println("<td><select name=\"bottom\" id=\"bottomSelect\">\n"
                    + "                                            <option value=\"0\">Choose bottom</option>\n"
                    + "\n"
                    + "\n"
                    + "                                            <option value=\"1\">Chocolate: 5.0</option><option value=\"2\">Blueberry: 5.0</option><option value=\"3\">Raspberry: 5.0</option><option value=\"4\">Crispy: 6.0</option><option value=\"5\">Strawberry: 6.0</option><option value=\"6\">Rum/Raisin: 7.0</option><option value=\"7\">Orange: 8.0</option><option value=\"8\">Lemon: 8.0</option><option value=\"9\">Blue cheese: 9.0</option>\n"
                    + "                                        </select></td>");
            out.print("<td><select name=\"topping\" id=\"toppingSelect\">\n"
                    + "                                            <option value=\"0\">Choose topping</option>\n"
                    + "\n"
                    + "\n"
                    + "                                            <option value=\"1\">Chocolate: 5.0</option><option value=\"2\">Vanilla: 5.0</option><option value=\"3\">Nutmeg: 5.0</option><option value=\"4\">Pistacio: 6.0</option><option value=\"5\">Almond: 7.0</option>\n"
                    + "                                        </select></td>\n"
                    + "                                    <td><input type=\"text\" name=\"qty\" placeholder=\"quantity\" id=\"qtyInput\"></td>\n"
                    + "                                    <td><input type=\"submit\" name=\"submit\" value=\"Add to cart\"></td><td><span id=\"errorContainer\"></span></td>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
