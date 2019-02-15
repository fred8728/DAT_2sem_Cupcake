package teamwork;

import java.util.ArrayList;

/*
    Made by Rasmus Hemmingsen & Emil skovbo
*/

// The team class 
public class Team {

    private String teamname;
    private ArrayList<User> members;
    private int team_id;
    
    //Team needs an id, name, and a list of members
    public Team(int team_id, String teamname, ArrayList<User> members)
    {
        this.members = members;
        this.teamname = teamname;
        this.team_id = team_id;
    }

    public String getName()
    {
        return teamname;
    }

    public void setName(String name)
    {
        this.teamname = name;
    }

    public ArrayList<User> getMembers()
    {
        return members;
    }

    public void setMembers(ArrayList<User> members)
    {
        this.members = members;
    }
//hello this is test 
    //fdiudfdfjh
    //ehkjdfkjndf
    //rehijerhjjubrtjo
    //rfhierhjkrkjhrr
    public int getId()
    {
        return team_id;
    }

    public void setTeam_id(int team_id)
    {
        this.team_id = team_id;
    }

    public String getTeamname()
    {
        return teamname;
    }

    public void setTeamname(String teamname)
    {
        this.teamname = teamname;
    }

    
}
