package kidde.e1.bssv.J5642010;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Properties;

import kidde.e1.bssv.J5642010.valueobject.BaanSalesOrder;
import kidde.e1.bssv.J5642010.valueobject.BaanSalesOrderDetails;

import oracle.e1.bssvfoundation.util.MathNumeric;


public class BaanDatabaseMgr {
    
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_BAANConnection = "jdbc:oracle:thin:@";
    
    
    
    public static void main(String[] args) {
        BaanDatabaseMgr mgr = new BaanDatabaseMgr();
        BaanSalesOrder so = new BaanSalesOrder();
        so.setDatabaseName("baanqa1");
        so.setHostname("159.82.220.137");
        so.setOrderNumber("550011020");
        so.setPassword("HELLO123");
        so.setUser("ROJDE");
        so.setPort("6000");
        mgr.getData(so);
    }
    
    public void getData(BaanSalesOrder bso){
        
        try{
            //URL of Oracle database server
            //String url = "jdbc:oracle:thin:@159.82.220.137:6000:baanqa1"; 
        
           // String url = 
            //properties for creating connection to Oracle database
            Properties props = new Properties();
            props.setProperty("user", bso.getUser());
            props.setProperty("password", bso.getPassword());
            props.setProperty("database",bso.getHostname()+":"+bso.getPort()+":"+bso.getDatabaseName());
            
            
            //creating connection to Oracle database using JDBC
            Connection conn = DriverManager.getConnection(DB_BAANConnection,props);

            String selectSQL ="select t$orno, t$pono, t$sqnb, t$item, t$oqua from baan.ttdsls401100 where t$orno=?";

            //creating PreparedStatement object to execute query
            PreparedStatement preStatement = conn.prepareStatement(selectSQL);
            preStatement.setString(1, bso.getOrderNumber());
        
            ResultSet result = preStatement.executeQuery();
            
            ArrayList baanOrderDetails = new ArrayList();
            int cnt = result.getFetchSize();
            while(result.next()){
                BaanSalesOrderDetails detail = new BaanSalesOrderDetails();
                detail.setMnDocumentorderinvoicee(new MathNumeric(result.getBigDecimal("t$orno")));
                detail.setMnLinenumber(new MathNumeric(result.getInt("t$pono")));
                //System.out.println("Sequence " + result.getInt("t$sqnb"));
                detail.setSzIdentifier2nditem(result.getString("t$item"));
                detail.setMnQuantity(new MathNumeric(result.getInt("t$oqua")));
                baanOrderDetails.add(detail);
            }
            
            BaanSalesOrderDetails[] bsoDetails = new BaanSalesOrderDetails[baanOrderDetails.size()];
            baanOrderDetails.toArray(bsoDetails);
            bso.setDetails(bsoDetails);
            
            preStatement.close();
            conn.close();
        }catch(Exception exp){
            System.out.println(exp.getMessage());
         }finally {
            System.out.println("Done");
        }
        

    }
    
    private static Connection getBaanDBConnection(Properties props){
        Connection dbConnection = null;
        
        try{
            Class.forName(DB_DRIVER);
        }catch(ClassNotFoundException exp){
            System.out.println(exp.getMessage());
        }
        
        try{
            dbConnection = DriverManager.getConnection(DB_BAANConnection, props);
        }catch (SQLException exp){
            System.out.println(exp.getMessage());
        }
        
        return dbConnection;
    }
}
