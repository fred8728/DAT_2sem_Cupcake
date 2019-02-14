package teamwork;


/*
    Made by Rasmus Hemmingsen & Emil skovbo
*/

public class User {

    private int userId;
    private String userName;
    private String password;
    private boolean admin;

    //User needs userId a username, a password and a boolean to cheack if they are admin
    public User(int userId, String userName, String password, boolean admin)
    {
        this.admin = admin;
        this.password = password;
        this.userId = userId;
        this.userName = userName;

    }

    public int getId()
    {
    return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getUsername()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public boolean isAdmin()
    {
        return admin;
    }

    public void setAdmin(boolean admin)
    {
        this.admin = admin;
    }

    @Override
    public String toString()
    {
        return "User{" + "userId=" + userId + '}';
    }

}
