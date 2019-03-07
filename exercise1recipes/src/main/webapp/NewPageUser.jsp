<%-- 
    Document   : NewPageUser
    Created on : 06-03-2019, 20:45:19
    Author     : ahmed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" type="text/css" href="style.css"> <%-- to work you gotta remove the bootstrap links --%>
         <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 

        <title>New login Page</title>
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
        <div id ="head"><i style ="font-size:15px; font-family:tahoma; color:white;">A balanced diet is having a cupcake in each hand</i></div>
        <img src ="https://www.bakingmad.com/BakingMad/media/content/Recipes/Cupcakes-Muffins/Cupcakes/Mary-Berry-chocolate-cupcake/1-Mary-Berry-chocolate-cupcakes-WEB.jpg" alt ="Trulli" width="200" height="222">
        <img src ="https://www.firefliesandmudpies.com/wp-content/uploads/Mocha-Cupcakes-3-1.jpg" alt ="Trulli" width="300" height ="222"> 
        <img src ="https://www.fifteenspatulas.com/wp-content/uploads/2011/10/Chocolate-Peanut-Butter-Cupcakes-Fifteen-Spatulas-12-640x427.jpg" alt ="Trulli" width="300" height ="222">
        <img src ="https://pespdotcom.files.wordpress.com/2019/01/gettyimages-183060524.jpg?w=2000" alt ="Trulli" width="300" height ="222">
        <img src ="https://bakerbynature.com/wp-content/uploads/2016/04/untitled-44-of-50-1.jpg" alt ="Trulli" width="200" height ="222">
        <h1 style="font-size:30px; font-family:tahoma; text-align:center; color:white;"><b>Make a new User</b></h1>
        <hr>
        <form method=\"GET\">
            <h1 style= "font-size:20px; font-family:tahoma; text-align:center;"><b>Username:</b></h1>
            <p align ="center"><input type=text name=username value=></p>
            <h1 style= "font-size:20px; font-family:tahoma; text-align:center;"><b>Password:</b></h1>
            <p align="center"><input type=password name=password align=center value=></p>
            <p align="center"><input type=hidden name=action value=create_user align=center></p>
            <p align="center"><input type=submit value=Create User align=center></p>
            <br>
            <div id ="foot"><i> Cupcake-Huset: Amerikavej 21 -  DK – 1756 København V - CVR-nr.: 87654321</i> </div>
        </form>
    </body>
</html>
