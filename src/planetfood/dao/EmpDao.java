package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import planetfood.dbutil.DbConnection;
import planetfood.pojo.Emp;
import planetfood.pojo.Product;

public class EmpDao 
{
    public static boolean addEmployee(Emp e)throws SQLException
    {
        Connection con=DbConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("Insert into employees values(?,?,?,?)");
        ps.setInt(1,e.getEmpid());
        ps.setString(2, e.getEmpname());
        ps.setString(3, e.getJob());
        ps.setDouble(4, e.getEmpsal());
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else
            return true;
    }
    
     public static ArrayList<Emp> getAllEmployees() throws SQLException
            {
                ArrayList<Emp> empList=new ArrayList<Emp>();
                Connection con=DbConnection.getConnection();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from employees");
                while(rs.next())
                {
                    Emp e=new Emp();
                    e.setEmpid(rs.getInt("EMPID"));
                    e.setEmpname(rs.getString("EName"));
                    e.setJob(rs.getString("JOB"));
                    e.setEmpsal(rs.getDouble("SAL"));
                    
                    empList.add(e);
                    
                }
                return empList;
            }

    public static boolean searchEmp(Emp e) throws SQLException
    {
        Connection con=DbConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("select * from employees where emp_id=?");
        
        ps.setInt(1,e.getEmpid());
        
         int count1=ps.executeUpdate();
        if(count1==0)
            return false;
        else
            return true;
   
    }
    
    public static boolean UpdateEmployee(Emp e)throws SQLException
    {
        Connection con=DbConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("update employees set ename=?,job=?,sal=? where emp_id=?");
        ps.setString(1, e.getEmpname());
        ps.setString(2,e.getJob());
        ps.setDouble(3, e.getEmpsal());
        ps.setInt(4,e.getEmpid());
        
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else
            return true;
        
    }
   
    public static ArrayList<Emp> getAllData()throws SQLException
    {
       Connection conn=DbConnection.getConnection();
       String qry="select * from employees";
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
       ArrayList<Emp> empList=new ArrayList<Emp>();
       while(rs.next())
       {
               Emp e=new Emp();
               e.setEmpid(rs.getInt("Emp_Id"));
               e.setEmpname(rs.getString("EName"));
               e.setJob(rs.getString("Job"));
               e.setEmpsal(rs.getDouble("Sal"));
               empList.add(e);
        }
       return empList;
        }




    public static boolean deleteEmployee(int i)throws SQLException
    {
        Connection con=DbConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("delete from employees where emp_id=?");
        ps.setInt(1,i);
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else
            return true;
        
    }

}

