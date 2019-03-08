<%-- 
    Document   : PageOrder
    Created on : 07-03-2019, 12:43:33
    Author     : emils
--%>

<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>4
<%@page import="DataLayer.TestAccess"%>
<%!
public static void generateOrder(HttpServletRequest request, HttpServletResponse response) throws IOException {

TestAccess acc = new TestAccess();


        String bottom = request.getParameter("bottom");
        String topping = request.getParameter("topping");

        String username = request.getParameter("bottom");
        String password = request.getParameter("topping");
        String quant = request.getParameter("qty");
        int bot = Integer.parseInt(bottom);
        int top = Integer.parseInt(topping);
        int quanti = Integer.parseInt(quant);
        String str = "";
        String temp = "";
        int price = 0;
        try {
            str = acc.getBottoms(bot);
            temp = acc.getTops(top);
            price = acc.getPriceBot(bot) + acc.getPriceTop(top);
        } catch (Exception e) {
        }
        int total = quanti * price;
        String name = str.replace("6", "with ");
        String topp = temp.replace("6", "");
        String namee = name.replace("5", "with ");
        String toppp = topp.replace("5", "");
        String finish = namee + toppp;
        
        



        try {
            acc.sendOrderToDB(bot, top, quanti);
        } catch (Exception e) {
        }

        %>

<% } %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                  <h1>Your order is done!</h1>

             <table class=table table-striped><thead><tr><th>Name</th><th>Quantity</th><th>Price</th>
                        <th>Total</th><th>Remove</th></tr></thead><tbody><tr>
                         <td> <%= finish %>
                         </td><td><%= quant %></td>
                         <td><%= price %></td><td class=\"lineprice\"><%=total%> "</td><td><form action=\"Control\" method=\"POST\">
                                <input type=\"hidden\" name=\"origin\" value=\"removeLine\"><input type=\"hidden\" name=\"lineId\" value=\"473\">
                                <input type=\"submit\"value=\"remove\"></form></td></tr><tr><td><h4>Total price</h4></td><td></td><td></td>
                        <td id=\"totalprice\"></td><td>
                            <form id=\"checkoutForm\" action=\"Control\" method=\"POST\"><input type=\"hidden\" name=\"origin\" value=\"submitInvoice\"/>
                                <input type=\"submit\" value=\"Check out your order></form></td></tr>\n"
                                        </tbody>
                                        </table>
           <p><a href=\"/exercise1recipes/lol?action=main\">Return to main page!</a></p>
    </body>
</html>

