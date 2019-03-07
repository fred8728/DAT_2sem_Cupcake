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
    </head>
    <body>
        <h1>Make a new User</h1>

        <form method=\"GET\">
            Username:<br>
            <input type=text name=username value=><br>
            Login:<br>
            <input type=password name=password value=><br><br>
            
            <input type=hidden name=action value=create_user>
            <input type=submit value=Create User>
            <%--"<input type=\"hidden\" name=\"action\" value=\"create_user\">"
                    + "<input type=\"submit\" value=\"Create User\">" --%>
            <br>
            <button type=create_user> Create User</button>
        </form>
    </body>
</html>
