
import java.sql.Statement;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frizz
 */
public class Main {
    
    
    public static void main(String[] args) throws Exception {
        Data_access accessor = new Data_access();
        
        User us = accessor.getUser("sim2000");
        System.out.println(us.toString());
        
        System.out.println("___________________________________");
        
        List <Cupcake> cup = accessor.getCupcakes();
        for (Cupcake c : cup){
            System.out.println(c.toString());
        }
        
        System.out.println("________________________________");
        
       /*       
        DBConnector conn = new DBConnector();
        Statement statement = conn.getConnection().createStatement();
        String query
                = "insert into recipes "
                + "values "
                + "('" + "8" + "', '" + "Lakselasagne" + "');";
        statement.executeUpdate(query);
        
        
        Recipe rep = accessor.getRecipe(2);
        
        String str = rep.toString();
        str = str.replace("{id=" + 2 + ", dish=", ":");
        
        System.out.println(rep.toString());
        System.out.println(rep.toString());
        System.out.println(rep.toString());
        System.out.println(rep.toString());
        System.out.println(rep.toString());
        */
        
    }
}
