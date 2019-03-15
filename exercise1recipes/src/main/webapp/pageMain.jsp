<%-- 
    Document   : pageMain
    Created on : 06-03-2019, 17:38:40
    Author     : ahmed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        p{
            font-size:25px;
            font-family:tahoma; 
            text-align:center;
            
        }
        h1{
           font-size:40px;
           font-family:tahoma;
           text-align:center;
           color:white; 
        }
     
        </style>
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
        <form method=\"POST\">
            <hr>
            <p><input type=hidden name=action value=main-logout></p>
            <p><input type=submit value=logout > </p>
            <br>
            <div id ="foot"><i> Cupcake-Huset: Amerikavej 21 -  DK – 1756 København V - CVR-nr.: 87654321</i> </div>
        </form>
            <h1>Welcome to a world of cupcakes!</h1>
            <p><a href=\exercise1recipes/lol?action=newuser>Create new user</a></p>
            <p><a href=\exercise1recipes/lol?action=buy>Buy something</a></p>
            <p><a href=\exercise1recipes/lol?action=login>Log in here</a></p>
            <div id ="foot"><i> Cupcake-Huset: Amerikavej 21 -  DK – 1756 København V - CVR-nr.: 87654321</i> </div>
    </body>
</html>

