package transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MSI
 */
public class Transaction {
    public static void main(String[] args) {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
            con.setAutoCommit(false);
//            Statement stt=con.createStatement();
//            stt.execute("truncate table students");
            PreparedStatement ps=con.prepareStatement("insert into students values(?,?,?)");
            ps.setString(1,"Hem");
            ps.setInt(2,22);
            ps.setDouble(3,88);
            
            ps.execute();
            con.commit();
            System.out.println("Transaction Completed");
            
        } catch (SQLException | ClassNotFoundException ex) {
            try {
                con.rollback();
                System.out.println("Rolled Back");
            } catch (SQLException ex1) {
                System.out.println("Transaction Failed");
            }
            
        }
    }
    
}
