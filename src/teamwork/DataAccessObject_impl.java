package teamwork;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
    Made by Rasmus Hemmingsen & Emil skovbo
*/

public class DataAccessObject_impl {

    private DBConnector connector = null;

    DataAccessObject_impl(DBConnector connector)
    {
        this.connector = connector;
    }

    /*
        GetTeamMembers seach for team members by a team id
    */
    public ArrayList<User> getTeamMembers(int team_id)
    {
        

        try
        {
            // The query that we send to the sql database.
            // Since we are seaching for a team_id, we need to use WHERE
            // Since java use the query as a string, we use where at the end
            // So that we can seach for the team_id input.
            String query = "SELECT * from user natural join team_member "
                    + "natural join team WHERE team_id = " + team_id;
            
            //We connect to the data base and send the query as a statement 
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            //We need these varibels so that our input from the database
            //Can be used in java
            int user_id;
            String username;
            String password;
            boolean admin;
            ArrayList<User> teamMembers = new ArrayList();

            while (rs.next())
            {
                //The varibels we made before are given the values from the
                //database
                user_id = rs.getInt("User_id");
                username = rs.getString("username");
                password = rs.getString("password");
                admin = rs.getBoolean("admin");
                
                //The input from the database are added to an arraylist that
                //as a new User
                teamMembers.add(new User(user_id, username, password, admin));

            }
            return teamMembers;

        } 
        //We need to catch the SQL exception if anything goes wrong 
        catch (SQLException ex)
        {
            return null;
        }

    }

    /*
        GetTeams returns an arrayList with teams 
    */
    public ArrayList<Team> getTeams()
    {
        try
        {
            //The query we seach for in the database 
            String query = "SELECT * FROM team";
            
            //We connect to the data base and send the query as a statement 
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //The varibels we made before are given the values from the
            //database
            int team_id;
            String teamName;
            ArrayList<Team> teams = new ArrayList();

            while (rs.next())
            {
                team_id = rs.getInt("team_id");
                teamName = rs.getString("teamname");

                teams.add(new Team(team_id, teamName, getTeamMembers(team_id)));

            }
            return teams;
        }
        //We need to catch the SQL exception if anything goes wrong 
        catch (SQLException ex)
        {
            return null;
        }

    }
    
    /*
    Finds a team by seaching for teamid.
    And returning a Team
    */

    public Team getTeam(int id)
    {

        try
        {
            // The query that we send to the sql database.
            // Since we are seaching for a id, we need to use WHERE
            // Since java use the query as a string, we use where at the end
            // So that we can seach for the id input.
            String query = "SELECT * from user natural join "
                    + "team_member natural join team WHERE team_id = " + id;

            //We connect to the data base and send the query as a statement 
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            //The varibels we made before are given the values from the
            //database
            int team_id;
            String teamName;
            Team team = null;

            while (rs.next())
            {
                team_id = rs.getInt("team_id");
                teamName = rs.getString("teamname");

                team = new Team(team_id, teamName, getTeamMembers(team_id));

            }
            return team;
        } 
        //We need to catch the SQL exception if anything goes wrong 
        catch (SQLException ex)
        {
            return null;
        }

    }

    public Team getTeam(String teamname)
    {

        try
        {
            // The query that we send to the sql database.
            // Since we are seaching for a teamname, we need to use WHERE
            // Since java use the query as a string, we use where at the end
            // So that we can seach for the teamname input.
            String query = "SELECT * from user natural join team_member "
                    + "natural join team WHERE teamname = '" + teamname + "'";

            //We connect to the data base and send the query as a statement 
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            //The varibels we made before are given the values from the
            //database
            int team_id;
            String teamName;
            Team team = null;

            while (rs.next())
            {
                team_id = rs.getInt("team_id");
                teamName = rs.getString("teamname");

                team = new Team(team_id, teamName, getTeamMembers(team_id));

            }
            return team;
        } 
        //We need to catch the SQL exception if anything goes wrong 
        catch (SQLException ex)
        {
            return null;
        }

    }

    public ArrayList<User> getUsers()
    {
        try
        {
            //The query we seach for
            String query = "SELECT * from user";

            //We connect to the data base and send the query as a statement 
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            //The varibels we made before are given the values from the
            //database
            int user_id;
            String username;
            String password;
            boolean admin;
            ArrayList<User> teamMembers = new ArrayList();

            while (rs.next())
            {
                user_id = rs.getInt("User_id");
                username = rs.getString("username");
                password = rs.getString("password");
                admin = rs.getBoolean("admin");

                teamMembers.add(new User(user_id, username, password, admin));

            }
            return teamMembers;

        } 
        //We need to catch the SQL exception if anything goes wrong 
        catch (SQLException ex)
        {
            return null;
        }
    }

    public User getUser(int id)
    {
        try
        {
            // The query that we send to the sql database.
            // Since we are seaching for a user_id, we need to use WHERE
            // Since java use the query as a string, we use where at the end
            // So that we can seach for the user_id input.
            String query = "SELECT * from user natural join "
                    + "team_member natural join team WHERE user_id = " + id;

            //We connect to the data base and send the query as a statement 
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            //The varibels we made before are given the values from the
            //database
            int user_id;
            String username;
            String password;
            boolean admin;
            User user = null;

            while (rs.next())
            {
                user_id = rs.getInt("User_id");
                username = rs.getString("username");
                password = rs.getString("password");
                admin = rs.getBoolean("admin");

                user = new User(user_id, username, password, admin);

            }
            return user;

        } 
        //We need to catch the SQL exception if anything goes wrong 
        catch (SQLException ex)
        {
            return null;
        }
    }

    public User getUser(String username)
    {
        try
        {
            // The query that we send to the sql database.
            // Since we are seaching for a username, we need to use WHERE
            // Since java use the query as a string, we use where at the end
            // So that we can seach for the username input.
            String query = "SELECT * from user natural join "
                    + "team_member natural join team WHERE username = '" + username + "'";

            //We connect to the data base and send the query as a statement 
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            //The varibels we made before are given the values from the
            //database
            int user_id;
            String tempusername = "";
            String password;
            boolean admin;
            User user = null;

            while (rs.next())
            {
                user_id = rs.getInt("User_id");
                username = rs.getString("username");
                password = rs.getString("password");
                admin = rs.getBoolean("admin");

                user = new User(user_id, tempusername, password, admin);

            }
            return user;

        } 
        //We need to catch the SQL exception if anything goes wrong 
        catch (SQLException ex)
        {
            return null;
        }
    }

}
