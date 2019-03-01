/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author frizz
 */
@WebServlet(urlPatterns = {"/lol"})
public class lol extends HttpServlet {

    private Connection connection = null;
    //Constants
    private static final String IP = "167.99.222.203";
    private static final String PORT = "3306";
    public static final String DATABASE = "r_ex";
    private static final String USERNAME = "test";
    private static final String PASSWORD = "password123!";

    /*Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
        
        this.connection = (Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
    
    
           DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "insert into recipes "
                + "values "
                + "('" + "8" + "', '" + "Lakselasagne" + "');";
        statement.executeUpdate(query);*/
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> list = new ArrayList<>();
        Data_access accessor = new Data_access();
        ArrayList<Integer> num = new ArrayList<>();
        HttpSession session = request.getSession();
        Boolean loggedIn = (Boolean) session.getAttribute("loggedIn");
        String action = request.getParameter("action");
        if (null == action) {
            PageMain.generateMain(response);
            if (loggedIn == null || !loggedIn) {
                PageNewUser.generateUser(response);
                PageLogin.generateLogin(response);

            }

        } else {
            switch (action) {
                case "newuser":
                    PageNewUser.generateUser(response);
                    break;
                case "create_user":
                    PageCreateUser.CreateUser(request, response);
                    break;
                /*   case "login":
                    session.setAttribute("loggedIn", true);
                    PageLoggedIn.generateLoggedIn(response);
                    break;
            }*/
            }
        }
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /*
            //TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet lol</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet: Recipes </h1>");
            String rep = request.getParameter("rep");
            int nr = Integer.parseInt(rep);
            out.println(list.get(nr - 1));
            //   for (int i = 0; i < num.get(0); i++) {
            //     out.println(list.get(i));
            //   out.println("</br>");
            //  out.println(<img src="https://www.agria.dk/imagevault/publishedmedia/yszdzq8xv1itg6h3om6z/schafervalp-pa-sommaren.jpg">);
            //}

            out.println("</body>");
            out.println("</html>");
             */ }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
