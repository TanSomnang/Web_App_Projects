
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BankTransaction {
    public void debit(Connection con, int cash, int id) throws SQLException
    {
        PreparedStatement stt = con.prepareStatement("update bank set cash = cash - ? where id = ?");
        stt.setInt(1, cash);
        stt.setInt(1, id);
        stt.execute();
    }
    public void credit(Connection con, int cash, int id) throws SQLException
    {
        PreparedStatement stt = con.prepareStatement("update bank set cash = cash + ? where id = ?");
        stt.setInt(1, cash);
        stt.setInt(1, id);
        stt.execute();
    }
    public static void main(String[] args) {
        BankTransaction bt=null;
        Connection con=null;
        Scanner input=new Scanner(System.in);
        int idDeb, idCre,cash;
        try {
            bt=new BankTransaction();
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
            con.setAutoCommit(false);
            System.out.println("Enter the id and amount to debit: ");
            idDeb=input.nextInt();
            cash=input.nextInt();
       
            System.out.println("Enter the id to credit money");
            idCre = input.nextInt();
            
            bt.debit(con, cash, idDeb);
            bt.credit(con, cash, idCre);
            con.commit();
            
            System.out.println("Transaction Completed");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            try 
            {
                con.rollback();
                System.out.println("Transaction failed...");
            } catch (SQLException ex) 
            {
                System.out.println("Unable to rollback");
            }
        }
    }

    private void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
      
     