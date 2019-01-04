
package type1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.ir.Statement;

/**
 *
 * @author MSI
 */
public class Type1 {

    public static void main(String[] args) {
        try {
            Connection con=null;
            Statement stt=null;
            Class.forName("sun.jdbc.odbc.JdcbOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:", "root", "");
                    
                    } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Type1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
