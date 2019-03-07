/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnectortest {
    private Connection connection = null;
	
    //Constants
    private static final String IP	 = "167.99.209.106"; 
    private static final String PORT     = "3306";
    public static final String DATABASE = "cupcakeData";
    private static final String USERNAME = "frederik"; 
    private static final String PASSWORD = "1234";	     	
	
     public DBConnectortest() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
        
        this.connection = (Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
        
        
    }
         public Connection getConnection() {
        return this.connection;
    }
}