<%-- 
    Document   : newjsp
    Created on : 08-03-2019, 10:10:08
    Author     : emils
" //post
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
            h1{
                font-size:30px;
                font-family:tahoma;
                text-align:center;
                color:white;
            }
            p{
                font-size:20px;
                font-family:tahoma;
                text-align:center;
            }
        </style>
    </head>
    <body>
        <div id ="head"><i style ="font-size:15px; font-family:tahoma; color:white;">A balanced diet is having a cupcake in each hand</i></div>
        <table style="width:100%">
            <tr>
                <th><img src="http://poivrebleu.com/wp-content/uploads/2015/01/cupcake.jpg" alt ="Trulli" width="200" height="222"></th>
                <td><img src="https://truffle-assets.imgix.net/pxqrocxwsjcc_3akycaxhkoae6wouswaoig_vegan-fruit-mince-pie_landscape_no-graphic.jpg" alt="Trulli" width="300" height="222"></td>
                <td><img src="http://truffle-assets.imgix.net/pxqrocxwsjcc_7nIEvHD97i8y4EoC6kewWe_banana-split-cupcakes_landscapeThumbnail_en-US.jpeg?w=600&fl=progressive&auto=format,compress&cs=tinysrgb&dpr=1" alt="Trulli" width="300" height="222"></td>
                <td><img src="https://easybaked.files.wordpress.com/2013/12/pink-champagne-cupcakes.jpg" alt="Trulli" width="200" height="222"></td>
                <td> <img src="https://brest.maville.com/recettes/sites/maville.com.recettes/files/styles/normale/public/field/image/recette/P0D2353121G_0.jpg?itok=AaQcIme2" alt ="Trulli" width ="200" height="222"></td>
                <td><img src="https://truffle-assets.imgix.net/pxqrocxwsjcc_4mlylloieeiqmyecgk0qq8_rose%CC%81-champagne-cupcakes-landscape-no-graphic.jpg" alt="Trulli" width="300" height="222"></td>
            </tr>

        </table>
        
        <form method=\"GET\">
            <h1><b>Log in here</b></h1>
            <hr>
            <p><b>Username:</b></p>
            <p><input type=text name=username value=></p>
            <p><b>Password:</b></p>
            <p><input type=password name=password value=></p>
            <p><input type=hidden name=action value=logged-in></p>
            <p><input type=submit value=Login User></p>
            <div id ="foot"><i> Cupcake-Huset: Amerikavej 21 -  DK – 1756 København V - CVR-nr.: 87654321</i> </div>
        </form>
    </body>
</html>
