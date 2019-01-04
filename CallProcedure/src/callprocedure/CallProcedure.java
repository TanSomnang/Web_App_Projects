package callprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MSI
 */
public class CallProcedure {
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
            CallableStatement cs=con.prepareCall("{call Insertrec(?,?,?)}");
            cs.setString(1, "Jiggle");
            cs.setInt(2, 12);
            cs.setDouble(3, 99);
            
            cs.execute();
            System.out.println("insertion completed");
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
       
    }
    
}
