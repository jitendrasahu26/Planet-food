package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import planetfood.dbutil.DbConnection;
import planetfood.pojo.Product;

public class ProductDao 
{
        public static String getNewId() throws SQLException
        {
            Connection conn =DbConnection.getConnection();
            Statement st=conn.createStatement();
            int id=101;
            ResultSet rs=st.executeQuery("Select count(*) from products"); //query fire
            if(rs.next())
            {
                id=id+rs.getInt(1);
            }
            return "P"+id;
        }
    public static boolean addProduct(Product p)throws SQLException
    {
        Connection conn =DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into products values (?,?,?,?,?) ");
        ps.setString(1, p.getProdId() );
        ps.setString(2, p.getCatId());
        ps.setString(3, p.getProdName());
        ps.setDouble(4, p.getProdPrice());
        ps.setString(5, "y");
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else
            return true;
    }
    public static HashMap<String,Product> getProductByCategory(String catId) throws SQLException
    {
        Connection conn=DbConnection.getConnection();
        String qry="Select * from Products where cat_id=?";
        PreparedStatement ps=conn.prepareStatement(qry);
        HashMap<String,Product> productList=new HashMap<String,Product>();
        ps.setString(1, catId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            Product p=new Product();
            p.setCatId(catId);
            p.setProdId(rs.getString("prod_id"));
            p.setProdName(rs.getString("prod_name"));
            p.setProdPrice(rs.getDouble("prod_price"));
            p.setIsActive(rs.getString("active"));
            productList.put(p.getProdId(), p);
        }
           return productList;     
    }
    
    public static ArrayList<Product> getAllData()throws SQLException{
       Connection conn=DbConnection.getConnection();
       String qry="Select * from Products";
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
       ArrayList<Product> productList=new ArrayList<Product>();
       while(rs.next()){
               Product p=new Product();
               p.setCatId(rs.getString("cat_id"));
               p.setProdId(rs.getString("prod_id"));
               p.setProdName(rs.getString("prod_name"));
               p.setProdPrice(rs.getDouble("prod_price"));
               p.setIsActive(rs.getString("active"));
               productList.add(p);
          }
       return productList;
         
        }

        public static boolean updateProduct(Product p)throws SQLException
        {
                Connection conn =DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update products set prod_name=?,prod_price=?,active=? where prod_id=?");
        ps.setString(4, p.getProdId() );
        //ps.setString(2, p.getCatId());
        ps.setString(1, p.getProdName());
        ps.setDouble(2, p.getProdPrice());
        ps.setString(3, p.getIsActive());
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else
            return true;
    
            
        }
    public static HashMap<String,String> getActiveProductsByCategory(String catId)throws SQLException
    {
                Connection conn =DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select prod_name,prod_id from products where cat_id=? andactive='y'");
        ps.setString(1, catId);
        ResultSet rs=ps.executeQuery();
        HashMap<String,String> productList=new HashMap<>();
        while(rs.next())
        {
            String prodName=rs.getString("prod_name");
            String prodId=rs.getString("prod_id");
            productList.put(prodName, prodId);
            
        }
        return productList;
    }
     public static boolean removeProduct(String prodId)throws SQLException
     {
       Connection conn =DbConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("delete from products where prod_name=?");
       ps.setString(1, prodId);
       int x=ps.executeUpdate();
       if(x>0)
           return true;
       else
           return false;
         
     }
       
}








