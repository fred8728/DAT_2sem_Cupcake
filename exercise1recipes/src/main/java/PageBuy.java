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
public class PageBuy {

    public static void generateBuy(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try (PrintWriter out = response.getWriter()) {
            Data_access acc = new Data_access();
            String bot = request.getParameter("bot");
            String top = request.getParameter("top");
            try {




            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FrontController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<td><select name=\"bottom\" id=\"bottomSelect\">\n"
                    + "<option value=\"0\">Choose bottom</option>\n"
                    + "\n"
                    + "\n"
                    + "<option value=\"1\">"+ acc.getBottoms(1)+"</option><option value=\"2\">"+ acc.getBottoms(2)+"</option><option value=\"3\">"+ acc.getBottoms(3)+"</option><option value=\"4\">"+ acc.getBottoms(4)+"</option><option value=\"5\">"+ acc.getBottoms(5)+"</option><option value=\"6\">"+ acc.getBottoms(6)+"</option><option value=\"7\">"+ acc.getBottoms(7)+"</option><option value=\"8\">"+ acc.getBottoms(8)+"</option><option value=\"9\">"+ acc.getBottoms(9)+"</option>\n"
                    + "</select></td>");
            out.print("<td><select name=\"topping\" id=\"toppingSelect\">\n"
                    + "<option value=\"0\">Choose topping</option>\n"
                    + "\n"
                    + "\n"
                    + "<option value=\"1\">"+ acc.getTops(1)+"</option><option value=\"2\">"+ acc.getTops(2)+"</option><option value=\"3\">"+ acc.getTops(3)+"</option><option value=\"4\">"+ acc.getTops(4)+"</option><option value=\"5\">"+ acc.getTops(5)+"</option>\n"
                    + "</select></td>\n"
                    + "<td><input type=\"text\" name=\"qty\" placeholder=\"quantity\" id=\"qtyInput\"></td>\n"
                    + "<td><input type=\"submit\" name=\"submit\" value=\"Add to cart\"></td><td><span id=\"errorContainer\"></span></td>");
            out.println("</body>");
            out.println("</html>");
                        } catch (Exception e) {
            }
        }
    }
}