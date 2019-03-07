/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TestAccess {

    /*private DBConnector connector = null;

    Data_access(DBConnector connector) 
    {
        this.connector = connector;
    }

    public ArrayList<User> getTeamMembers(int team_id) throws Exception
    {
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT * "
                + "FROM user natural join team_member natural join team "
                + "WHERE team_id = '" + team_id + "';";
        ResultSet rs = statement.executeQuery(query);
        String username = "";
        int id = 0;
        String password = "";
        boolean isAdmin;
        List<User> users = new ArrayList();
        
        while (rs.next()) 
        {
            username = rs.getString("username");
            id = rs.getInt("user_id");
            password = rs.getString("password");
            isAdmin = rs.getBoolean("admin");
            
            users.add(new User(username, id, password, isAdmin));
        }
        return (ArrayList<User>) users;
    }
     */
    public ArrayList<CupCakeTest> getCupcakes() throws Exception {
        DBConnectortest conn = new DBConnectortest();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT * "
                + "FROM CUPCAKE; ";
        ResultSet rs = statement.executeQuery(query);
        int id = 0;
        String top = "";
        String bottom = "";
        Double price = null;
        List cupcakes = new ArrayList<>();

        while (rs.next()) {
            id = rs.getInt("CUPCAKE_id");
            top = rs.getString("TOPPING");
            bottom = rs.getString("BOTTON");
            price = rs.getDouble("PRICE");

            cupcakes.add(new CupCakeTest(id, top, bottom, price));
        }
        return (ArrayList<CupCakeTest>) cupcakes;
    }

    public String getBottoms(int id) throws Exception {
        DBConnectortest conn = new DBConnectortest();
            Statement statement = conn.getConnection().createStatement();
        
        String query
                = "SELECT * FROM CUPCAKE_BOT "
                + "WHERE CUPCAKEBOT_ID = " + id + "; ";

        ResultSet rs = statement.executeQuery(query);
        String bottom = "";
        int price = 0;
        String first = "";
        String second = "";
        String done = "";
        
        
        while (rs.next()) {
            bottom = rs.getString("BOTTOM");
            price = rs.getInt("PRICE");
            first = bottom.toString();
            second = String.valueOf(price);
            done = first + " " + second;
            }
        return done; 
}
    
    public void changeUserBalance(int totalprice, String username) throws Exception
    {
        DBConnectortest conn = new DBConnectortest();
            Statement statement = conn.getConnection().createStatement();
        
        String query
                = "UPDATE USERS"
                + "SET BALANCE = BALANCE-" + totalprice 
                + " WHERE USERNAME = '" + username + "'; ";
      
    }
    
    public int getPriceTop(int id) throws Exception
    {
         DBConnectortest conn = new DBConnectortest();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT * FROM CUPCAKE_TOP "
                + "WHERE CUPCAKETOP_ID = " + id + "; ";

        ResultSet rs = statement.executeQuery(query);
        
        int price = 0;
        
        while (rs.next()) {
            price = rs.getInt("PRICE");
            
        }
        return price;
    }
    
        public int getPriceBot(int id) throws Exception
    {
         DBConnectortest conn = new DBConnectortest();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT * FROM CUPCAKE_BOT "
                + "WHERE CUPCAKEBOT_ID = " + id + "; ";

        ResultSet rs = statement.executeQuery(query);
        
        int price = 0;
        
        while (rs.next()) {
            price = rs.getInt("PRICE");
            
        }
        return price;
    }
    
    public String getTops(int id) throws Exception
    {
        DBConnectortest conn = new DBConnectortest();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT * FROM CUPCAKE_TOP "
                + "WHERE CUPCAKETOP_ID = " + id + "; ";

        ResultSet rs = statement.executeQuery(query);
        String topping = "";
        int price = 0;
        String first = "";
        String second = "";
        String done = "";
        
        while (rs.next()) {
            topping = rs.getString("TOPPINGS");
            price = rs.getInt("PRICE");
            first = topping.toString();
            second = String.valueOf(price);
            done = first + " " + second;
            
                
        }
        return done; 
    }

public UserTest getUser(String username) throws Exception {
        DBConnectortest conn = new DBConnectortest();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT * "
                + "FROM USERS "
                + "WHERE username = '" + username + "';";

        ResultSet rs = statement.executeQuery(query);
        UserTest us = null;
        //id = 0;
        String password = "";
        double balance = 0;

        while (rs.next()) {
            //id = rs.getInt("USER_ID");
            username = rs.getString("username");
            password = rs.getString("password");
            balance = rs.getDouble("balance");

            us = new UserTest(username, password, balance);
        }
        return us;

    }

    //menes der email eller balance mon tro
    public void createUser(String username, String password) throws Exception {
        DBConnectortest conn = new DBConnectortest();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "insert into USERS (USERNAME, PASSWORD, BALANCE, MAIL)"
                + "values "
                + "('" + username + "', '" + password + "',0 , 'botmail123');";
        statement.executeUpdate(query);
    }
    
        public void sendOrderToDB(int CUPCAKETOP_ID, int CUPCAKEBOT_ID, int AMOUNT) throws Exception {
        DBConnectortest conn = new DBConnectortest();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "insert into ORDERLINE "
                + "(CUPCAKETOP_ID,CUPCAKEBOT_ID,AMOUNT,ORDER_DATE)values "
                + "(" + CUPCAKETOP_ID + ", " + CUPCAKEBOT_ID + ", " + AMOUNT + ", NOW());";
        statement.executeUpdate(query);
    }
    
    public boolean comparePassword(String username, String password) throws Exception
    {
        DBConnectortest conn = new DBConnectortest();
        Statement statement = conn.getConnection().createStatement();
        String query
                = " SELECT PASSWORD "
                + " FROM USERS "
                + " WHERE USERNAME ='" + username + "'; ";
        ResultSet rs = statement.executeQuery(query);

        String passwordreal = "";
        while (rs.next()) {
            passwordreal = rs.getString("PASSWORD");
        }
        if(password.equalsIgnoreCase(passwordreal))
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
}

