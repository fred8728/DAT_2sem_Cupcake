<%-- 
    Document   : PageBuyjsp
    Created on : 07-03-2019, 10:36:07
    Author     : emils
--%>
<% Data_access acc = new Data_access();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
                   

            try {

          <td><select name=bottom id=bottomSelect>
                    <option value=0>Choose bottom</option>
                    
                  
                    <option value=1><% acc.getBottoms(1); %></option><option value=2><%acc.getBottoms(2);%></option><option value=3><%acc.getBottoms(3)%>
                    </option>
                    <option value=4>
                        <% acc.getBottoms(4);%><div>
                    </div></option>
                    <option value=\"5\"><% acc.getBottoms(5);%></option><option value=\"6\"><% acc.getBottoms(6);%>
                    "</option><option value=\"7\">"+ acc.getBottoms(7)+"</option><option value=\"8\">"+ acc.getBottoms(8)+"</option><option value=\"9\">"+ acc.getBottoms(9)+
                    "</option>\n"
                    + "</select></td>");
            out.print("<td><select name=\"topping\" id=\"toppingSelect\">\n"
                    + "<option value=\"0\">Choose topping</option>\n"
                    + "\n"
                    + "\n"
                    + "<option value=\"1\">"+ acc.getTops(1)+"</option><option value=\"2\">"+ acc.getTops(2)+"</option><option value=\"3\">"+ 
                    acc.getTops(3)+"</option><option value=\"4\">"+ acc.getTops(4)+"</option><option value=\"5\">"+ acc.getTops(5)+"</option>\n"
                    + "</select></td>\n"
                    + "<td><input type=\"text\" name=\"qty\" placeholder=\"quantity\" id=\"qtyInput\"></td>\n"
                    + "<td><input type=\"submit\" name=\"submit\" value=\"Add to cart\"></td><td><span id=\"errorContainer\"></span></td>");
            out.println("</body>");
            out.println("</html>");
                        } catch (Exception e) {
                
                out.println("<h2>Compose cupcakes from 1 bottom and 1 top and add to shopping cart</h2>");
                out.println("<form id=\"addProduct\" action=\"?action=order\" method=\"GET\">\n"
                        + "<input type=\"hidden\" name=\"action\" value=\"order\">\n"
                        + "<table class=\"table table-striped\">\n"
                        + "<thead><tr><th>Bottom</th><th>Topping</th><th>Quantity</th><th>Select</th><th></th></tr></thead>\n"
                        + "<tbody>"
                        + "<tr><td><select name=\"bottom\" id=\"bottomSelect\">\n"
                        + "<option value=\"0\">Choose bottom</option>\n"
                        + "\n"
                        + "\n"
                        + "<option value=\"1\">" + <%acc.getBottoms(1);%> + "</option><option value=\"2\">" + acc.getBottoms(2) + "</option><option value=\"3\">" + acc.getBottoms(3) + "</option><option value=\"4\">" + acc.getBottoms(4) + "</option><option value=\"5\">" + acc.getBottoms(5) + "</option><option value=\"6\">" + acc.getBottoms(6) + "</option><option value=\"7\">" + acc.getBottoms(7) + "</option><option value=\"8\">" + acc.getBottoms(8) + "</option><option value=\"9\">" + acc.getBottoms(9) + "</option>\n"
                        + "</select></td>");
                out.print("<td><select name=\"topping\" id=\"toppingSelect\">\n"
                        + "<option value=\"0\">Choose topping</option>\n"
                        + "\n"
                        + "\n"
                        + "<option value=\"1\">" + acc.getTops(1) + "</option><option value=\"2\">" + acc.getTops(2) + "</option><option value=\"3\">" + acc.getTops(3) + "</option><option value=\"4\">" + acc.getTops(4) + "</option><option value=\"5\">" + acc.getTops(5) + "</option><option value=\"6\">" + acc.getTops(6) + "</option><option value=\"7\">" + acc.getTops(7) + "</option><option value=\"8\">" + acc.getTops(8) + "</option><option value=\"9\">" + acc.getTops(9) + "</option>\n"
                        + "</select></td>\n"
                        + "<td><input type=\"text\" name=\"qty\" placeholder=\"quantity\" id=\"qtyInput\"></td>\n"
                        + "<td><input type=\"submit\" name=\"action\" value=\"Add to Cart\"></td><td><span id=\"errorContainer\"></span></td></tr></tbody>\n"
                        + "</table>\n"
                        + "</form>");
                out.println("</body>");
                out.println("</html>");
                String bot = request.getParameter("bottomSelect");
                String top = request.getParameter("topping");
                int topprice = Integer.parseInt(top);
                int botprice = Integer.parseInt(bot);
                acc.getPriceBot(botprice);
                acc.getPriceTop(topprice);
        
        
    </body>
</html>
