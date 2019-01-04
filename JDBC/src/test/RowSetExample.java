package test;


import java.sql.SQLException;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;



public class RowSetExample 
{
    public static void main(String[] args) {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            JdbcRowSet jrs=RowSetProvider.newFactory().createJdbcRowSet();
            jrs.setUrl("jdbc:mysql://localhost:3306/mysql");
            jrs.setUsername("root");
            jrs.setPassword("");
            jrs.setCommand("select * from testjdbc");
            jrs.execute();
            
            System.out.println("success...");
            
            while(jrs.next())
            {
                System.out.println("ID : "+jrs.getInt(1));
                System.out.println("ID : "+jrs.getString(2));
            }
            //factory: 
        } catch (SQLException ex) {
//            System.out.println("failed...");
                ex.printStackTrace();
        }
}
}
