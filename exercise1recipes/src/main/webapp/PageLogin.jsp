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
        <style>

            body{
                background-color: lightpink;
                margin: 20px;
                width: 1450px;
                padding: 20px;
            }
            div#head{
                position: fixed;
                top: 0px;
                left: 0px;
                width: 100%;
                background: lightcoral;
                padding: 15px;  
            }
            div#foot{
                position: fixed;
                bottom: 0px;
                left: 0px;
                width: 100%;
                background: lightcoral;
                padding: 15px;
            } 
        </style>
    </head>
    <body>
        <h1 style="font-size:30px; font-family:tahoma; text-align:center; color:white;">Something is wrong!</h1> 
        <%
            TestAccess acc = new TestAccess();

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            if (acc.comparePassword(username, password)) {
        %><p style="font-size:25px; font-family:tahoma; text-align:center"><a href=\exercise1recipes/lol?action=login><% out.print("confirm login!");
            } else {
                out.print("test");
            }%></a></p> 



        <div id ="head"><i style ="font-size:15px; font-family:tahoma; color:white;">A balanced diet is having a cupcake in each hand</i></div>
        <hr>
        <p style="font-size:25px; font-family:tahoma; text-align:center"><a href=\exercise1recipes/lol?action=login>Your username or password is incorrect</a></p>
        <p style="font-size:25px; font-family:tahoma; text-align:center"><a href=\exercise1recipes/lol?action=newuser>Create a new user</a></p>
        <div id ="foot"><i> Cupcake-Huset: Amerikavej 21 -  DK – 1756 København V - CVR-nr.: 87654321</i> </div>

    </body>
</html>
