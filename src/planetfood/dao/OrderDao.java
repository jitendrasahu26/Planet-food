package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import planetfood.dbutil.DbConnection;
import planetfood.pojo.Order;
import planetfood.pojo.OrderDetail;
import planetfood.pojo.UserProfile;

public class OrderDao 
{
    public static ArrayList<Order> getOrdersByDate(Date startDate, Date endDate) throws SQLException
    {
      Connection conn =DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from orders where ord_date between ? and ?");
        //ps.setString(1, p.getProdId() );
          long ms1=startDate.getTime();
          long ms2=endDate.getTime();
          java.sql.Date d1=new java.sql.Date(ms1);
          java.sql.Date d2=new java.sql.Date(ms2);
          ps.setDate(1, d1);
          ps.setDate(2, d2);
          
           ArrayList<Order> orderList=new ArrayList<Order>();
        //ps.setString(1, catId);
        ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
            Order obj=new Order();
            obj.setOrdId(rs.getString("ord_id"));
            java.sql.Date d=rs.getDate("ord_date");
            SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
            String dateStr=sdf.format(d);
            obj.setOrdDate(dateStr);
            obj.setOrdAmount(rs.getDouble("gst_amount"));
            obj.setGrandTotal(rs.getDouble("grand_total"));
            obj.setDiscount(rs.getDouble("discount"));
            obj.setUserId(rs.getString("user_id"));
            orderList.add(obj);
       }
       return orderList;
          
    }
    
    public static ArrayList<Order> getOrdersByDateByCashier(Date startDate, Date endDate,String name) throws SQLException
    {
      Connection conn =DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from orders where ord_date between ? and ? and user_id=?");
        //ps.setString(1, p.getProdId() );
          long ms1=startDate.getTime();
          long ms2=endDate.getTime();
          name=UserProfile.getUserId();
          System.out.println(name);
          java.sql.Date d1=new java.sql.Date(ms1);
          java.sql.Date d2=new java.sql.Date(ms2);
          ps.setDate(1, d1);
          ps.setDate(2, d2);
          ps.setString(3, name);
          
           ArrayList<Order> orderList=new ArrayList<Order>();
        //ps.setString(1, catId);
        ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
            Order obj=new Order();
            obj.setOrdId(rs.getString("ord_id"));
            java.sql.Date d=rs.getDate("ord_date");
            SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
            String dateStr=sdf.format(d);
            obj.setOrdDate(dateStr);
            obj.setOrdAmount(rs.getDouble("gst_amount"));
            obj.setGrandTotal(rs.getDouble("grand_total"));
            obj.setDiscount(rs.getDouble("discount"));
            obj.setUserId(rs.getString("user_id"));
            orderList.add(obj);
       }
       return orderList;
          
    }
    
    public static ArrayList<Order> getAllData()throws SQLException{
       Connection conn=DbConnection.getConnection();
       String qry="Select * from orders";
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
       ArrayList<Order> OrderList=new ArrayList<Order>();
       while(rs.next())
       {
       //        Product p=new Product();
         //      p.setCatId(rs.getString("cat_id"));
             //  p.setProdId(rs.getString("prod_id"));
           //    p.setProdName(rs.getString("prod_name"));
       //        p.setProdPrice(rs.getDouble("prod_price"));
         //      p.setIsActive(rs.getString("active"));
           //    productList.add(p);
               
            Order obj=new Order();
            obj.setOrdId(rs.getString("ord_id"));
      //      java.sql.Date d=rs.getDate("ord_date");
           obj.setOrdDate(rs.getString("ord_date"));
            obj.setOrdAmount(rs.getDouble("ord_amount"));
            obj.setDiscount(rs.getDouble("discount"));
            obj.setGst(rs.getDouble("gst"));
        //    obj.setOrdDate(dateStr);
            obj.setOrdAmount(rs.getDouble("gst_amount"));
            obj.setGrandTotal(rs.getDouble("grand_total"));
            obj.setUserId(rs.getString("user_id"));
            OrderList.add(obj);
          }
       return OrderList;
         
        }
    
        public static String getNewID() throws SQLException
        {
            Connection conn =DbConnection.getConnection();
            Statement st=conn.createStatement();
            int id=101;
            ResultSet rs=st.executeQuery("Select count(*) from orders"); //query fire
            if(rs.next())
            {
                id=id+rs.getInt(1);
            }
            return "ord"+id;
        }
    public static boolean addOrder(Order order,ArrayList<OrderDetail> orderList)throws Exception{
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into orders values(?,?,?,?,?,?,?,?)");
        ps.setString(1, order.getOrdId());
        String dateStr=order.getOrdDate();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
        java.util.Date d1=sdf.parse(dateStr);
        java.sql.Date d2=new java.sql.Date(d1.getTime());
        ps.setDate(2, d2);
        ps.setDouble(3,order.getGst());
        ps.setDouble(4, order.getGstAmount());
        ps.setDouble(5, order.getDiscount());
        ps.setDouble(6, order.getGrandTotal());
        ps.setString(7,order.getUserId());
        ps.setDouble(8, order.getOrdAmount());
        int x=ps.executeUpdate();
        PreparedStatement ps2=conn.prepareStatement("Insert into order_details values(?,?,?,?)");
        int count=0,y;
        for(OrderDetail detail:orderList)
        {
            ps2.setString(1, detail.getOrdId());
            ps2.setString(2, detail.getProdId());
            ps2.setDouble(3, detail.getQuantity());
            ps2.setDouble(4, detail.getCost());
            y=ps2.executeUpdate();
            count=count+y;
        }
        
        if(x>0 && count==orderList.size())
            return true;
        else
            return false;
    }

    
    
    
}
