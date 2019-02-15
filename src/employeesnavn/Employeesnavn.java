/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesnavn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

/**
 *
 * @author frizz
 */
public class Employeesnavn {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, Exception {
        // TODO code application logic here
        
        String firstname[] = {"kurt", "lars", "knud", "ole"};
        String lastname[] = {"nielsen", "larsen", "mikkelsen", "lassen"};
        
        System.out.println(firstname[new Random().nextInt(firstname.length)] + " " + lastname[new Random().nextInt(lastname.length)]);
        
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "insert into prøv "
                + "values "
                + "('" + firstname[new Random().nextInt(firstname.length)] + "', '" + lastname[new Random().nextInt(lastname.length)] + "');";
        statement.executeUpdate(query);
    }
    
}
