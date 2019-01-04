package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MSI
 */
public class DBProcess {
    public static void main(String[] args) {
        int age;
        String name;
        double score;
        Scanner input = new Scanner(System.in);
        Students obj=new Students();        //data transfer object
        
        System.out.println("Enter Name, age and score: ");
        name = input.nextLine();
        age = input.nextInt();
        score = input.nextDouble(); 
        
        obj.setName(name);
        obj.setAge(age);
        obj.setScore(score);
        
        DB.getCon();
        Students stud[]=new Students[5];
//        for(int i=0;i<stud.length;i++)
//        {
//            Scanner input2=new Scanner(System.in);
//            System.out.println("Enter Name, age and score: ");
//            name = input2.nextLine();
//            age = input2.nextInt();
//            score = input2.nextDouble();
//            
//            obj.setName(name);
//            obj.setAge(age);
//            obj.setScore(score);
//            
//            stud[i]=new Students();
//            stud[i].setName(name);
//            stud[i].setAge(age);
//            stud[i].setScore(score);
//        }

        Students stud1=new Students();
        Students stud2=new Students();
        Students stud3=new Students();
        Students stud4=new Students();
        
        stud1.setName("Home");
        stud1.setAge(12);
        stud1.setScore(33);
        
        stud2.setName("James");
        stud2.setAge(13);
        stud2.setScore(122);
        
        stud3.setName("Kame");
        stud3.setAge(14);
        stud3.setScore(330);
        
        stud4.setName("Icon");
        stud4.setAge(19);
        stud4.setScore(30);
        
        ArrayList<Students> list=new ArrayList();
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud4);
        try {
//            DB.insert(obj);
           Students temp= DB.view("Somnang");
            System.out.println(temp);
//            DB.insertMulti(list);
//            DB.viewAll();
            DB.update(obj);
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }
    }
    
}

class DB
{
    public static Connection con=null;
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root","");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public static void insert(Students obj) throws SQLException
    {
        Statement stt=con.createStatement();
        stt.execute("Insert into students values ('"+obj.getName()+"','"+obj.getAge()+"','"+obj.getScore()+"')");
        System.out.println("Data inserted");     
    }
    public static void insertMulti(ArrayList<Students> list) throws SQLException
    {
        Statement stt=con.createStatement();
        for(Students obj:list)
        {
           stt.execute("Insert into students values ('"+obj.getName()+"','"+obj.getAge()+"','"+obj.getScore()+"')"); 
        }
        System.out.println("Data inserted");
    }
    public static Students view(String name) throws SQLException
    {
        
        PreparedStatement ps=con.prepareStatement("select * from students where name=?");
        ps.setString(1, name);
        ResultSet rs= ps.executeQuery();
        rs.next();
        int Age=rs.getInt("Age");
        String Name=rs.getString("name");
        double Score=rs.getDouble("Score");
        
        Students obj=new Students();
        obj.setAge(Age);
        obj.setName(Name);
        obj.setScore(Score);
        return obj;
    }
    
    public static ArrayList<Students> viewAll() throws SQLException
    {
        ArrayList<Students> list=new ArrayList();
        Statement stt=con.createStatement();
        ResultSet rs=stt.executeQuery("select * from students");
        while(rs.next())
            {
                System.out.println("Name : "+rs.getString("name"));
                System.out.println("Age : "+rs.getInt("age"));
                System.out.println("Score : "+rs.getInt("score")); 
                System.out.println("********************************************");
            }
        
        return list;
    }

  public static void update(Students obj)
  {
      Statement stt;
        try {
            String name;
            Scanner input=new Scanner(System.in);
            System.out.println("Please enter name and age to update: ");
            name=input.nextLine();
            
            stt = con.createStatement();
            stt.executeUpdate("update students set name='"+obj.getName()+"' where age="+obj.getAge()+"");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
      
  }
    
}
