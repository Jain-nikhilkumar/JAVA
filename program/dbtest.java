import java.sql.Connection;
import java.sql.DriverManager;

public class dbtest {

  public static void main(String args[]) {
    
      Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","NIHIL" ,"Nikhil2411");
      System.out.println("Connected");
   
  }
}
