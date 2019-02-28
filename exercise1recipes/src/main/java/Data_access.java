import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public ArrayList<Team> getTeams() throws Exception
    {
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "SELECT * "
                + "FROM team; ";
        
                //SELECT team_id, username, teamname FROM user natural join team_member natural join team;
                // + "WHERE team_id ='" + teamid + "';";
                
        ResultSet rs = statement.executeQuery(query);
        int id = 0;
        String name = "";
        ArrayList members = new ArrayList<>();
        
    
        List <Team> teams = new ArrayList();
        
        
        
        while (rs.next())
        {
            id = rs.getInt("team_id");
            name = rs.getString("teamname");
            members.add(rs.getString("teamname"));
            
            teams.add(new Team(id, name, members));
        }
        return (ArrayList<Team>) teams;
    }
*/
    public Recipe getRecipe(int id) throws Exception
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
    
/*
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