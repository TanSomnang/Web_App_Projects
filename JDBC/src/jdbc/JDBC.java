
package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


/*
 * @author MSI
 */
public class JDBC {

    public static void main(String[] args) throws Exception{
        
        try {
            
            // Step 1. Load Driver
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        
            // Step 2. Establish connection
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root", "");
            
            //Step 3. Create Statement
            
            Statement stt= connection.createStatement();
            
            //Step 4. insert values
            stt.execute("insert into testjdbc values ('002','Home')");
            stt.execute("insert into testjdbc values ('003','James')");
            
            ResultSet rs= stt.executeQuery("select distinct * from testjdbc");
            
            while(rs.next())
            {
                System.out.println("ID : "+rs.getInt("id"));
                System.out.println("Name : "+rs.getString("name"));
               
        } 
            }
         catch (ClassNotFoundException ex) {
            System.out.println("Unable to load driver...");
        }
           
    }
    
}
