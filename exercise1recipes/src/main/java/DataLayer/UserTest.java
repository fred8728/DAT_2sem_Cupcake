/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 *
 * @author frizz
 */
public class UserTest {
    private String username;
    private String password;
    private double balance;
    
    UserTest(String username, String password, double balance)
    {
        this.username = username;
        this.password = password;
        this.balance = balance;
        
    }
    
    public String toString (){
        return "User: Username = " + username + " " + ",Password = " + password + " " +  ",Balance = " + balance; 
    }
    
}