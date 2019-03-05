
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Data_access {

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
    public ArrayList<Cupcake> getCupcakes() throws Exception {
        DBConnector conn = new DBConnector();
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

            cupcakes.add(new Cupcake(id, top, bottom, price));
        }
        return (ArrayList<Cupcake>) cupcakes;
    }

    public String getBottoms(int id) throws Exception {
        DBConnector conn = new DBConnector();
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
    
    public int getPriceTop(int id) throws Exception
    {
         DBConnector conn = new DBConnector();
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
         DBConnector conn = new DBConnector();
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
        DBConnector conn = new DBConnector();
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

public User getUser(String username) throws Exception {
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT * "
                + "FROM USERS "
                + "WHERE username = '" + username + "';";

        ResultSet rs = statement.executeQuery(query);
        User us = null;
        //id = 0;
        String password = "";
        double balance = 0;

        while (rs.next()) {
            //id = rs.getInt("USER_ID");
            username = rs.getString("username");
            password = rs.getString("password");
            balance = rs.getDouble("balance");

            us = new User(username, password, balance);
        }
        return us;

    }

    //menes der email eller balance mon tro
    public void createUser(String username, String password) throws Exception {
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "insert into USERS "
                + "values "
                + "('" + username + "', '" + password + "',0);";
        statement.executeUpdate(query);
    }
    
    public boolean comparePassword(String username, String password) throws Exception
    {
        DBConnector conn = new DBConnector();
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
    /*public Recipe getRecipe(int id) throws Exception
    {
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT * "
                + "FROM recipe "
                + "WHERE ID_recipe = '" + id + "';";
                
        ResultSet rs = statement.executeQuery(query);
        Recipe rec = null;
        String dish = "";
        String instruct = "";
        
        while (rs.next())
        {
            id = rs.getInt("ID_recipe");
            dish = rs.getString("dish");
            instruct = rs.getString("instructions");
            
            rec = new Recipe(id, dish, instruct);
        }
        return rec;
        
    }
    public static int max()throws Exception{
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT MAX(id_recipe) AS max_id From recipe;";
                
        ResultSet rs = statement.executeQuery(query);
        if (rs.next())
        {
            int id = rs.getInt("max_id");
            return id;
        } else {
            return 0;
        }
    }
    
    public Team getTeam(String teamname) throws Exception
    {
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT team_id, teamname "
                + "FROM team natural join team_member "
                + "WHERE teamname = '" + teamname + "';";
                
        ResultSet rs = statement.executeQuery(query);
        Team team = null;
        int id = 0;
        ArrayList members = new ArrayList<>();
        
        while (rs.next())
        {
            id = rs.getInt("team_id");
            teamname = rs.getString("teamname");
            members.add(rs.getString("teamname"));
            
            team = new Team(id, teamname, members);
        }
        return team;*/
}
