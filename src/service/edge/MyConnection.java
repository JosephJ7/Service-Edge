package service.edge;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author joseph
 */
public class MyConnection {
    
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_login_register", "root", "YourPassword");
            System.out.println("Succesfull");
//            jdbc:mysql://localhost:3306/?user=root
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}
