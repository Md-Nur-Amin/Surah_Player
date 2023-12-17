
package surah.player;

import java.sql.*;
import javax.swing.JOptionPane;
public class Connect {
    Connection conn;
    public static Connection conneftdb(){
    try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nur amin","root","");
            return conn;
           
    }catch(Exception e ){
     
    JOptionPane.showMessageDialog( null, e);
    return null;
    }
   
    }
}
