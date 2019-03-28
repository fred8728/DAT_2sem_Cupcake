<%-- 
    Document   : PageOrder
    Created on : 07-03-2019, 12:43:33
    Author     : emils
--%>

<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DataLayer.TestAccess"%>

<%
    TestAccess acc = new TestAccess();

    String bottom = request.getParameter("bottom");
    String topping = request.getParameter("topping");

    String username = request.getParameter("bottom");
    String password = request.getParameter("topping");
    String quant = request.getParameter("qty");
    int bot = Integer.parseInt(bottom);
    int top = Integer.parseInt(topping);
    int quanti = Integer.parseInt(quant);
    String str = acc.getBottoms(bot);
    String temp = acc.getTops(top);
    int price  = acc.getPriceBot(bot) + acc.getPriceTop(top);

    int total = quanti * price;
    String name = str.replace("6", "with ");
    String topp = temp.replace("6", "");
    String namee = name.replace("5", "with ");
    String toppp = topp.replace("5", "");
    String finish = namee + toppp;
    acc.sendOrderToDB(bot, top, quanti);
 %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href ="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
                <table style="width:100%">
            <tr>
                <th><img src="images/cupcake1.jpg" alt ="Trulli" width="200" height="222"></th>
                <td><img src="images/cupcake2.jpg" alt="Trulli" width="300" height="222"></td>
                <td><img src="images/cupcake3.jpeg<%-- http://truffle-assets.imgix.net/pxqrocxwsjcc_7nIEvHD97i8y4EoC6kewWe_banana-split-cupcakes_landscapeThumbnail_en-US.jpeg?w=600&fl=progressive&auto=format,compress&cs=tinysrgb&dpr=1--%>" alt="Trulli" width="300" height="222"></td>
                <td><img src="images/cupcake4.jpg <%--https://easybaked.files.wordpress.com/2013/12/pink-champagne-cupcakes.jpg --%>" alt="Trulli" width="200" height="222"></td>
                <td> <img src="images/cupcake5.jpg<%-- https://brest.maville.com/recettes/sites/maville.com.recettes/files/styles/normale/public/field/image/recette/P0D2353121G_0.jpg?itok=AaQcIme2--%>" alt ="Trulli" width ="200" height="222"></td>
                <td><img src="images/cupcake6.jpg" alt="Trulli" width="300" height="222"></td>
            </tr>
        </table>
        <div id ="head"><i style ="font-size:15px; font-family:tahoma; color:white;">A balanced diet is having a cupcake in each hand</i></div>
        <hr>

        <h1>Your order is done!</h1>

        
        <table class=table table-striped><thead><tr><th>Name</th><th>Quantity</th><th>Price</th>
                    <th>Total</th></tr></thead><tbody><tr>
                    <td>  <%=finish %></td><td> <%=quant %></td><td> <%=price %></td><td class=lineprice><%= total %></td><td><form action=Control method=POST>
                            <input type=hidden name=origin value=removeLine><input type=hidden name=lineId value=473>
                            </form></td></tr><tr><td></td><td></td><td></td>
                    <td>
                        <form id="checkoutForm" action=Control method=POST><input type=hidden name=origin value=submitInvoice/>
                            <input type=submit value=Check out your order></form></td></tr>
            </tbody>
        </table>
        <p><a href=\exercise1recipes/lol?action=main>Return to main page!</a></p>
        
            <div id ="foot"><i> Cupcake-Huset: Amerikavej 21 -  DK – 1756 København V - CVR-nr.: 87654321</i> </div>
    </body>
</html>

