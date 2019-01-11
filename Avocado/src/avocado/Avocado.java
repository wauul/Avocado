/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avocado;
import java.sql.*;
/**
 *
 * @author Waul
 */
public class Avocado {
    
    private static final String USRNAME = "admin";
    private static final String PASSWORD = "admin";
    private static final String DBCON = "jdbc:mysql://localhost:3306/avocado";
    
    private static int accType;
    private static int accID;
    
    static void setaccType(int x){
        accType = x;
    }
    

    
    static void setaccID(int x){
        accID = x;
    }    
    
    
    static int getaccID(){
        return accID;
    }
    

    public static void main(String[] args) throws SQLException {
        Connexion c = new Connexion();
        c.setVisible(true);

    }

    static Connection DBConn() { 
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(DBCON,USRNAME,PASSWORD);         
        }
        catch(SQLException e){
            System.err.println(e);
        }
    return conn;//To change body of generated methods, choose Tools | Templates.
    }
    
}
