
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
public class PageOrder {

    public static void generateOrder(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Data_access acc = new Data_access();
        LineItems liner = null;
        ShoppingCart shopper = null;
        String username = request.getParameter("bottom");
        String password = request.getParameter("topping");
        String quant = request.getParameter("qty");
        int bot = Integer.parseInt(username);
        int top = Integer.parseInt(password);
        int quanti = Integer.parseInt(quant);
        liner = new LineItems(top, bot, quanti);
        shopper.addToList(liner);
        try {
            acc.sendOrderToDB(bot, top, quanti);
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
            out.println("<h1>Your order is done!</h1>");

            out.println("</body>");
            out.println("</html>");
        }
    }
}
