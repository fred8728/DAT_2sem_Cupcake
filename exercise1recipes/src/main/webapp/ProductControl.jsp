<%-- 
    Document   : ProductControl
    Created on : 05-03-2019, 11:27:27
    Author     : frizz
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DataLayer.TestAccess"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Cupcake Ordering</title>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 
        
        
    </head>
    <body>
       
        <h1>Select the cucpcake you wish to order:</h1>
                <%TestAccess acc = new TestAccess();%> 
                
                
        <div> 
            <p>hello there bud, wanna order a cup cake? </p>
            


           <%--  <table style="width:50%"> <tr> <td> Top </td>  <td> Bottom </td> <td> Amount </td></tr>
               <th> <tr> <td> <td><select name=\"bottom\" id=\"bottomSelect\">\n</td> </td>  </th>
                <th> <td> <td><select name=\"bottom\" id=\"bottomSelect\">\n</td> </td> <td> <td> <select name=\"bottom\" id=\"bottomSelect\">\n</td> </td></tr> </th> </table> 
                --%>
                <table border=2px width=40%>
                    

                <tr> <th> Cupcake Top </th> <th> Cupcake bottom </th> <th> quantity </th>  <th> Confirm </th>  </tr>

                <tr>  <td> <select name=\"topping\" id="option"><option value=\"1\"><%= acc.getTops(1) %></option><option value=\"2\"><%= acc.getTops(2) %></option><option value=\"3\"><%= acc.getTops(3) %></option>
                           <option value=\"4\"><%= acc.getTops(4) %></option><option value=\"5\"><%= acc.getTops(5) %></option><option value=\"6\"><%= acc.getTops(6) %></option><option value=\"7\"><%= acc.getTops(7) %></option><option value=\"8\"><%= acc.getTops(8) %></option><option value=\"9\"><%= acc.getTops(9) %></option> </td> 
                    
                    <td> <select name=\"bottom\" id="option"><option value=\"1\"><%= acc.getBottoms(1) %></option><option value=\"2\"><%= acc.getBottoms(2) %></option><option value=\"3\"><%= acc.getBottoms(3) %></option><option value=\"4\"><%= acc.getBottoms(4) %></option><option value=\"5\"><%= acc.getBottoms(5) %></option><option value=\"6\"><%= acc.getBottoms(6) %></option>
                            <option value=\"7\"><%= acc.getBottoms(7) %></option><option value=\"8\"><%= acc.getBottoms(8) %></option><option value=\"9\"><%= acc.getBottoms(9) %></option><option value=\"10\"><%= acc.getBottoms(10) %></option>\"bottomSelect\"></td> 
                                    
                    <td> <select name=\"bottom\" id=\"bottomSelect\"></td> <td><button>Click here</button></td> </tr>
                    

                </table>
                    <%-- <td><select name=\"bottom\" id=\"bottomSelect\">\n</td>
                    <%--  <td><input type=\"text\" name=\"qty\" placeholder=\"quantity\" id=\"qtyInput\"></td>
                <td><input type=\"submit\" name=\"submit\" value=\"Add to cart\"> </td>
                <td><span id=\"errorContainer\"></span></td> --%>
        </div> 
    </body>
</html>
