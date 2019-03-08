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
    </head>
    <body>
       <form method=\"GET\">
                    Username:<br>
                    <input type=text name=username value=><br>
                    Login:<br>
                    <input type=password name=password value=><br><br>
                    <input type=hidden name=action value=logged-in>
                    <input type=submit value=Login>
                    </form>
    </body>
</html>
