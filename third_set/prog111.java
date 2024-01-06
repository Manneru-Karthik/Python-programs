import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
public class prog111 {
    public static void main(String[] args) {
        String url="jdbc:sqlite:C:/sqlite/SSIT.db";
      try{
        Connection conn=DriverManager.getConnection(url);
        if(conn!=null){
            DatabaseMetaData dbmd=conn.getMetaData();
            System.out.println("The driver name is "+dbmd.getDriverName());
            System.out.println("A new database has been created.");
        }
      }catch(SQLException sq){
        System.out.println(sq.getMessage());
      }
    }
}
