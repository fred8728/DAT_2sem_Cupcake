/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DataLayer.TestAccess;
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
            throws ServletException, IOException, Exception {
        ArrayList<String> list = new ArrayList<>();
        Data_access accessor = new Data_access();
        ArrayList<Integer> num = new ArrayList<>();
        HttpSession session = request.getSession(true);
        Boolean loggedIn = (Boolean) session.getAttribute("loggedIn");
        String action = request.getParameter("action");
        if (null == action) {
            if (session.isNew() || loggedIn == null || !loggedIn) {
                session.setAttribute("loggedIn", false);
                main(request, response);
                //PageMain.generateMain(response);
                // PageLogin.generateLogin(request, response);
                //PageNewUser.generateUser(response);
            }
            // PageMain.generateMain(response);

        } else {
            switch (action) {
                case "newuser":

                    newPageUser(request, response);
                    // createUser(request, response);

                    //PageNewUser.generateUser(response);
                    break;
                case "create_user":
                    createUser(request, response);
                    //  PageCreateUser.CreateUser(request, response);
                    break;
                case "main":
                    main(request, response);
                    //   PageMain.generateMain(response); 
                    break;
                case "login":
                    
                    loggedin(request, response);

                    //PageLoggedIn.generateLoggedIn(response);
                    break;
                case "logged-in":
                    session.setAttribute("loggedIn", true);
                    login(request, response);
                   // PageLogin.generateLogin(request, response);
                    break;
                case "buy":
                    if (loggedIn == false) {
                        main(request, response);
                    } else {
                        buy(request, response);
                    }
                    //PageBuy.generateBuy(request, response);
                    break;
                case "order":
                    //order(request, response);
                    PageOrder.generateOrder(request, response);
                    break;
                case "test":
                    response.sendRedirect("pageMain.jsp"); // setup to link to a .jsp file
                    // PageOrder.generateOrder(request, response);
                    break;
                    case "main-logout":
                    session.setAttribute("loggedIn", false);
                    main(request, response); // setup to link to a .jsp file
                    // PageOrder.generateOrder(request, response);
                    break;
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

    private void main(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("pageMain.jsp").forward(request, response);
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        TestAccess.createUser(username, password);

        request.getRequestDispatcher("CreateUserPage.jsp").forward(request, response);
    }

    private void loggedin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("PageLoggedinjsp.jsp").forward(request, response);
    }

    private void buy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("ProductControl.jsp").forward(request, response);
    }

    private void order(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("PageOrder.jsp").forward(request, response);
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("PageLogin.jsp").forward(request, response);
    }

    private void
            newPageUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("NewPageUser.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(lol.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(lol.class.getName()).log(Level.SEVERE, null, ex);
        }
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
