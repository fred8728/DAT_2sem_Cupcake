<%-- 
    Document   : ProductControl
    Created on : 05-03-2019, 11:27:27
    Author     : frizz
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        <div> 
            <p>hello there bud, wanna order a cup cake?</p>


           <%--  <table style="width:50%"> <tr> <td> Top </td>  <td> Bottom </td> <td> Amount </td></tr>
               <th> <tr> <td> <td><select name=\"bottom\" id=\"bottomSelect\">\n</td> </td>  </th>
                <th> <td> <td><select name=\"bottom\" id=\"bottomSelect\">\n</td> </td> <td> <td> <select name=\"bottom\" id=\"bottomSelect\">\n</td> </td></tr> </th> </table> 
                --%>
                <table border="2px" width="40%">
                <tr> <th> Cupcake Top </th> <th> Cupcake bottom </th> <th> Amount </th>  <th> Comfirm </th>  </tr>
                <tr>  <td> <select name=\"bottom\" id=\"bottomSelect\"> </td> <td> <select name=\"bottom\" id=\"bottomSelect\">
                    </td> <td> <select name=\"bottom\" id=\"bottomSelect\"></td> <td><button>Click here</button></td> </tr>
                </table>
                    <%-- <td><select name=\"bottom\" id=\"bottomSelect\">\n</td>
                    <%--  <td><input type=\"text\" name=\"qty\" placeholder=\"quantity\" id=\"qtyInput\"></td>
                <td><input type=\"submit\" name=\"submit\" value=\"Add to cart\"> </td>
                <td><span id=\"errorContainer\"></span></td> --%>
        </div> 
    </body>
</html>
