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

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
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
            img{


            }
            preview {
                display: inline-block;
                margin: 0 40px 0 0;
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

        <div id ="head"><i style ="font-size:15px; font-family:tahoma; color:white;">A balanced diet is having a cupcake in each hand</i></div
        <%TestAccess acc = new TestAccess();%> 
        
        <hr>
        <div> 
<<<<<<< HEAD
            <h1>Select the cupcake you wish to order:</h1>
            <br>
=======

            <p>hello there bud, wanna order a cup cake? </p>
            

>>>>>>> 04678e6371f99256a52c3383f9026bcffdf2ec22

           <%--  <table style="width:50%"> <tr> <td> Top </td>  <td> Bottom </td> <td> Amount </td></tr>
               <th> <tr> <td> <td><select name=\"bottom\" id=\"bottomSelect\">\n</td> </td>  </th>
                <th> <td> <td><select name=\"bottom\" id=\"bottomSelect\">\n</td> </td> <td> <td> <select name=\"bottom\" id=\"bottomSelect\">\n</td> </td></tr> </th> </table> 
                --%>

                 <form id="addProduct" action="?action=order" method="POST">
                        <input type="hidden" name="action" value="order">
                        <table class="table table-striped">
                            <thead><tr><th>Bottom</th><th>Topping</th><th>Quantity</th><th>Select</th><th></th></tr></thead>
                            <tbody>
                                <tr> <th> Cupcake Top </th> <th> Cupcake bottom </th> <th> quantity </th>  <th> Confirm </th>  </tr>

                <tr>  <td> <select name=topping id="option"><option value=1><%= acc.getTops(1) %></option><option value=2><%= acc.getTops(2) %></option><option value=3><%= acc.getTops(3) %></option>
                           <option value=4><%= acc.getTops(4) %></option><option value=5><%= acc.getTops(5) %></option><option value=6><%= acc.getTops(6) %></option>
                           <option value=7><%= acc.getTops(7) %></option><option value=8><%= acc.getTops(8) %></option><option value=9><%= acc.getTops(9) %></option> </td> 
                    
                    <td> <select name=bottom id="option"><option value=1><%= acc.getBottoms(1) %></option><option value=2><%= acc.getBottoms(2) %></option><option value=3><%= acc.getBottoms(3) %></option><option value=4><%= acc.getBottoms(4) %></option>
                            <option value=5><%= acc.getBottoms(5) %></option><option value=6><%= acc.getBottoms(6) %></option><option value=7><%= acc.getBottoms(7) %></option>
                            <option value=8><%= acc.getBottoms(8) %></option><option value=9><%= acc.getBottoms(9) %></option><option value=10><%= acc.getBottoms(10) %></option></td> 
                                
                            <td><input type="text" name="qty" placeholder="quantity" id="qtyInput"></td>
                                    <td><input type="submit" name="action" value="Add to cart"></td><td><span id="errorContainer"></span></td>
</tr>
                </table>
            </form>

        </div> 
        <p input ="submit;" style="font-size:25px; font-family:tahoma; text-align:center;"><a href=\exercise1recipes/lol?action=main>Return to main page</a></p>
        <div id ="foot"><i> Cupcake-Huset: Amerikavej 21 -  DK – 1756 København V - CVR-nr.: 87654321</i> </div>
    </body>
</html>
