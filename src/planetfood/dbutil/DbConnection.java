package planetfood.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

    
public class DbConnection 
{
    private static Connection conn;
    static
    {
        try
        {
                    Class.forName("oracle.jdbc.OracleDriver");
                //JOptionPane.showMessageDialog(null,"Driver Loaded Successfully");
                conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-MU4FHUPL:1521/XE","user2","jeetu2");
                JOptionPane.showMessageDialog(null,"Connected Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }
            catch(ClassNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null,"Error loading Driver class"+ex,"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,"SQL Error"+ex,"Error",JOptionPane.ERROR);
                ex.printStackTrace();
            }
    }
        public static Connection getConnection()
        {
            return conn;
        }
        //jab app close hogi to public static void closeConnection() method bhi yahi call hoga,try aur catch k sath

    
}
