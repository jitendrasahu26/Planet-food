package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import planetfood.dbutil.DbConnection;
import planetfood.pojo.Category;

public class CategoryDao 
{
        public static String getNewId() throws SQLException
    {
        Connection conn =DbConnection.getConnection();
        Statement st=conn.createStatement();
        int id=101;
        ResultSet rs=st.executeQuery("Select count(*) from categories2"); //query fire
        if(rs.next())
        {
            id=id+rs.getInt(1);
        }
        return "C"+id;
    }

    
    
    
    
    
    
    
    public static HashMap<String,String> getAllCategoryId() throws SQLException
    {
        Connection conn =DbConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select Cat_id ,cat_name from categories2");
        HashMap<String,String> categories =new  HashMap<>();
        while(rs.next())
        {
            String catName=rs.getString(1);
            String catId=rs.getString(2);
            categories.put(catId,catName);
        }
        return categories;
    }
    
    public static ArrayList<Category> getAllData()throws SQLException
    {
       Connection conn=DbConnection.getConnection();
       String qry="select * from categories2";
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
       ArrayList<Category> CatList=new ArrayList<Category>();
       while(rs.next())
       {
               Category c=new Category();
               
               c.setCat_id(rs.getString("Cat_Id"));
               c.setCat_name(rs.getString("Cat_name"));
               CatList.add(c);
        }
       return CatList;
        }
    
  public static boolean addCategory(Category c)throws SQLException
    {
        Connection con=DbConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("Insert into categories2 values(?,?)");
        //ps.setInt(1,e.getEmpid());
        //ps.setString(2, e.getEmpname());
        //ps.setString(3, e.getJob());
        //ps.setDouble(4, e.getEmpsal());
        ps.setString(1, c.getCat_id());
        ps.setString(2, c.getCat_name());
        
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else
            return true;
    }
  public static boolean updateCategory(Category c)throws SQLException
  {
              Connection con=DbConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("update categories2 set cat_name=? where cat_id=?");
      
    
        
        
        ps.setString(1, c.getCat_name());
        ps.setString(2, c.getCat_id());
        
        System.out.println("CatId="+c.getCat_id());
        System.out.println("Catname="+c.getCat_name());
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else
            return true;

  }      
    
    
    
    
    
}

    
    
    

