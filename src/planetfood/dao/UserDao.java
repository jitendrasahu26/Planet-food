package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import planetfood.dbutil.DbConnection;
import planetfood.pojo.Emp;
import planetfood.pojo.User;

public class UserDao 
{
public static String validateUser(User user) throws SQLException
{   
        Connection con=DbConnection.getConnection();
        String qry="select username from users where userid=? and password=? and userType=?";
        PreparedStatement ps=con.prepareStatement(qry);
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getUserType());
        System.out.println(user.getUserId()+" "+user.getPassword()+" "+user.getUserType());
        ResultSet rs=ps.executeQuery();
        String username=null;
        if(rs.next())
        {
            System.out.println("in if");
            username=rs.getString(1);
            
        }
        System.out.println("username:"+username);
        return username;
}

    public static boolean addCashier(User u)throws SQLException
    {
        Connection con=DbConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("Insert into users values(?,?,?,?)");
        ps.setString(1,u.getUsername());
        ps.setString(2,u.getUserId());
        ps.setString(3,u.getPassword());
        ps.setString(4,u.getUserType());
        
        
        
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else
            return true;
    }
    
}
