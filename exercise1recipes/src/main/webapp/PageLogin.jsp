<%-- 
    Document   : PageLogin

--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DataLayer.TestAccess"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page login</title>
        <link href ="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
            TestAccess acc = new TestAccess();

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            if (acc.comparePassword(username, password)) {
        %><p style="font-size:25px; font-family:tahoma; text-align:center"><a href=\exercise1recipes/lol?action=main-login>Confirm login!</a></p>
                
                <% 
            } else {%>
                        <h1>Something is wrong!</h1> 

        <div id ="head"><i style ="font-size:15px; font-family:tahoma; color:white;">A balanced diet is having a cupcake in each hand</i></div>
        <hr>
        <p><a href=\exercise1recipes/lol?action=login>Your username or password is incorrect</a></p>
        <p><a href=\exercise1recipes/lol?action=newuser>Create a new user</a></p>
        <p input ="submit;" style="font-size:25px; font-family:tahoma; text-align:center;"><a href=\exercise1recipes/lol?action=main>Return to main page</a></p>
        <div id ="foot"><i> Cupcake-Huset: Amerikavej 21 -  DK – 1756 København V - CVR-nr.: 87654321</i> </div>  <%
            }%></a></p> 
    </body>
</html>
