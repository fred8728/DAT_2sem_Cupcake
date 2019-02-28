import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Data_access 
{
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
    public ArrayList<Cupcake> getCupcakes() throws Exception
    {
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT * "
                + "FROM cupCake; ";
        ResultSet rs = statement.executeQuery(query);
        int id = 0;
        String top = "";
        String bottom = "";
        Double price = null;
        List cupcakes = new ArrayList<>();
        
        while (rs.next())
        {
            id = rs.getInt("CUPCAKE_id");
            top = rs.getString("TOPPING");
            bottom = rs.getString("BOTTON");
            price = rs.getDouble("PRICE");
            
            cupcakes.add(new Cupcake(id, top, bottom, price));
        }
        return (ArrayList<Cupcake>) cupcakes;
    }
    
    public List getBottoms(String bottom) throws Exception
    {
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT BOTTOM "
                + "FROM cupCake; ";
        ResultSet rs = statement.executeQuery(query);
        
        List cupcakes = new ArrayList<>();
        
        while (rs.next())
        {
            bottom = rs.getString("BOTTOM");
            
            cupcakes.add(bottom);
        }
        return cupcakes;
    }

    public User getUser(String username) throws Exception
    {
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT * "
                + "FROM USERS "
                + "WHERE username = '" + username + "';";
                
        ResultSet rs = statement.executeQuery(query);
        User us = null;
        String password = "";
        double balance = 0;
       
        
        while (rs.next())
        {
            username = rs.getString("username");
            password = rs.getString("password");
            balance = rs.getDouble("balance");
            
            us = new User(username, password, balance);
        }
        return us;
        
    }
    //menes der email eller balance mon tro
    public void createUser(String username, String password, String balance) throws Exception
    {
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "insert into USERS "
                + "values "
                + "('" + username + "', '" + password + "', '" + balance + ");";
        statement.executeUpdate(query);
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