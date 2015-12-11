package kidde.e1.bssv.J5642010;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Properties;

import java.util.TimeZone;

import kidde.e1.bssv.J5642010.valueobject.BaanSalesOrder;

import kidde.e1.bssv.J5642010.valueobject.BaanSalesOrderDetails;

import kidde.e1.bssv.J5642011.BaanSalesOrderDetailUpdate;
import kidde.e1.bssv.J5642011.valueobject.BaanSalesOrderStatus_D5642045;

import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BaanSalesOrderValidation extends BusinessService {
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_BAANConnection = "jdbc:oracle:thin:@";
    /**
     * TODO: Create Java Doc for: getBaanSalesOrder
     * Method getBaanSalesOrder is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList getBaanSalesOrder(IContext context, IConnection connection, BaanSalesOrder internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "getBaanSalesOrder", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();



        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        // String url = 
         //properties for creating connection to Oracle database
         Properties props = new Properties();
         props.setProperty("user", internalVO.getUser());
         props.setProperty("password", internalVO.getPassword());
         props.setProperty("database",internalVO.getHostname()+":"+internalVO.getPort()+":"+internalVO.getDatabaseName());
         context.getBSSVLogger().app(context, "Baan connection parms: "+props.getProperty("database"));
         try{
          
          //Checkt to see if DB Driver class is found
          Class.forName(DB_DRIVER);
          //Setting the TimeZone do to jdbc 
          TimeZone timeZone = TimeZone.getTimeZone("US/Eastern");
          TimeZone.setDefault(timeZone);   
             
         //creating connection to Oracle database using JDBC
         Connection conn = DriverManager.getConnection(DB_BAANConnection,props);
         context.getBSSVLogger().app(context, "Driver Mananger Connection was Successfull "+conn.toString());
         
 //        Recoded the sql statement per Kidde resources 11/14/14 - Eric Sahm           
 //        String selectSQL = "select baan.ttdsls401100.t$orno, baan.ttdsls401100.t$pono, max(baan.ttdsls401100.t$sqnb), baan.ttdsls401100.t$item, baan.ttdsls401100.t$oqua,  baan.ttdsls401100.t$dqua, baan.twhinh210100.t$lsta, baan.ttdsls401100.t$dldt from baan.ttdsls401100, baan.twhinh210100 where baan.twhinh210100.t$orno = baan.ttdsls401100.t$orno and baan.ttdsls401100.t$orno = ? and baan.twhinh210100.t$pono =  baan.ttdsls401100.t$pono and baan.twhinh210100.t$oorg = 1 group by baan.ttdsls401100.t$orno, baan.ttdsls401100.t$pono,  baan.ttdsls401100.t$item, baan.ttdsls401100.t$oqua,  baan.ttdsls401100.t$dqua, baan.twhinh210100.t$lsta, baan.ttdsls401100.t$dldt union select  baan.ttdsls401100.t$orno,  baan.ttdsls401100.t$pono,  max(baan.ttdsls401100.t$sqnb),  baan.ttdsls401100.t$item,  baan.ttdsls401100.t$oqua,  baan.ttdsls401100.t$dqua, baan.twhinh220100.t$lsta, baan.ttdsls401100.t$dldt from baan.ttdsls401100, baan.twhinh220100 where baan.twhinh220100.t$orno = baan.ttdsls401100.t$orno and baan.ttdsls401100.t$orno = ? and baan.twhinh220100.t$pono = baan.ttdsls401100.t$pono and baan.twhinh220100.t$oorg = 1 group by baan.ttdsls401100.t$orno, baan.ttdsls401100.t$pono,  baan.ttdsls401100.t$item, baan.ttdsls401100.t$oqua,  baan.ttdsls401100.t$dqua, baan.twhinh220100.t$lsta, baan.ttdsls401100.t$dldt";    
 
        String selectSQL = "select baan.ttdsls401100.t$orno, baan.ttdsls401100.t$pono, baan.ttdsls401100.t$sqnb, baan.ttdsls401100.t$oqua, baan.ttdsls401100.t$dqua,"+
        "(select baan.twhinh210100.t$item from baan.twhinh210100 where baan.twhinh210100.t$orno = baan.ttdsls401100.t$orno and baan.twhinh210100.t$pono = baan.ttdsls401100.t$pono and baan.twhinh210100.t$seqn = baan.ttdsls401100.t$sqnb * 1000) \"IBItem\", "+
        "(select  baan.twhinh210100.t$lsta from baan.twhinh210100 where baan.twhinh210100.t$orno = baan.ttdsls401100.t$orno and baan.twhinh210100.t$pono = baan.ttdsls401100.t$pono and baan.twhinh210100.t$seqn = baan.ttdsls401100.t$sqnb * 1000) \"IBStatus\","+
        "(select baan.twhinh220100.t$item from baan.twhinh220100 where baan.twhinh220100.t$orno = baan.ttdsls401100.t$orno and baan.twhinh220100.t$pono = baan.ttdsls401100.t$pono and baan.twhinh220100.t$seqn = baan.ttdsls401100.t$sqnb) \"OBItem\","+
        "(select  baan.twhinh220100.t$lsta from baan.twhinh220100 where baan.twhinh220100.t$orno = baan.ttdsls401100.t$orno and baan.twhinh220100.t$pono = baan.ttdsls401100.t$pono and baan.twhinh220100.t$seqn = baan.ttdsls401100.t$sqnb) \"OBStatus\" "+ 
        ",baan.ttdsls401100.t$acti, baan.ttdsls401100.t$clyn, baan.ttdsls401100.t$item from baan.ttdsls401100 where baan.ttdsls401100.t$orno = ? and baan.ttdsls401100.t$oltp <> 1";
 
 
 
 
             
         //creating PreparedStatement object to execute query
         PreparedStatement preStatement = conn.prepareStatement(selectSQL);
         preStatement.setString(1, internalVO.getOrderNumber());
 //        preStatement.setString(2, internalVO.getOrderNumber());
        
         ResultSet result = preStatement.executeQuery();
         context.getBSSVLogger().app(context, "Connection to Baan was Successfull, data returned");
         ArrayList baanOrderDetails = new ArrayList();
         int cnt = result.getFetchSize();    
         String itemName = "";   
         Integer quantityOrdered = 0;
             
         while(result.next()){
             BaanSalesOrderDetails detail = new BaanSalesOrderDetails();
             BaanSalesOrderStatus_D5642045 orderStatus = new BaanSalesOrderStatus_D5642045();
             orderStatus.setMnDocumentOrderInvoiceE(internalVO.getMnDocumentOrderInvoiceE());
             orderStatus.setSzCompanyKeyOrderNo(internalVO.getSzCompanyKeyOrderNo());
             orderStatus.setSzOrderType(internalVO.getSzOrderType());

             //result.getString("t$acti") 
             //value to check for is "tdsls4246m000" and make status BLANK (0) or "tdsls4247m000" and make statue OPEN (5)            
             String actiValue = result.getString(10).trim();
            
             // result.getString("t$item") - item name 
             itemName = result.getString(12).trim();
             
             //detail.setBaanOrderNumber(result.getString("t$orno"));   
             detail.setBaanOrderNumber(result.getString(1));
             orderStatus.setSzBaanOrderNumber(result.getString(1));

             //detail.setMnLinenumber(new MathNumeric(result.getInt("t$pono")));
             detail.setMnLinenumber(new MathNumeric(result.getInt(2)));
             orderStatus.setMnBaanPositionNumber(new MathNumeric(result.getInt(2)));

             //detail.setMnBaanSequence(new MathNumeric(result.getInt("t$sqnb")));
             detail.setMnBaanSequence(new MathNumeric(result.getInt(3)));
             orderStatus.setMnBaanSequenceNumber(new MathNumeric(result.getInt(3)));

             //detail.setMnQuantity(new MathNumeric(result.getInt("t$oqua")));
             detail.setMnQuantity(new MathNumeric(result.getInt(4)));
             orderStatus.setMnBaanOrderQty(new MathNumeric(result.getInt(4)));
             quantityOrdered = result.getInt(4);

             //detail.setMnDeliveredQuantity(new MathNumeric(result.getInt("t$dqua")));
             detail.setMnDeliveredQuantity(new MathNumeric(result.getInt(5)));
             orderStatus.setMnBaanDeliveredQty(new MathNumeric(result.getInt(5)));
             
            //detail.setSzIdentifier2nditem(result.getString("IBItem"));
             if (result.getString(6)!= null){
                detail.setSzIdentifier2nditem(result.getString(6).trim());
                orderStatus.setSzIdentifier3rdItem(result.getString(6).trim());
                
                //detail.setMnBaanStatus(new MathNumeric(result.getInt("IBStatus")));
                if (result.getInt(7) !=0 ){
                    detail.setMnBaanStatus(new MathNumeric(result.getInt(7)));
                    orderStatus.setSzBaanLineStatus((new MathNumeric(result.getInt(7)).toString()));
                }else{
                    if (actiValue.equals("tdsls4247m000")){
                        detail.setMnBaanStatus(new MathNumeric(5));
                        orderStatus.setSzBaanLineStatus("5");
                    }else{
                        detail.setMnBaanStatus(new MathNumeric(0));
                        orderStatus.setSzBaanLineStatus("0");
                    }
                }
             }else{
                 if (result.getString(8) != null){
                     //detail.setSzIdentifier2nditem(result.getString("OBItem"));
                     detail.setSzIdentifier2nditem(result.getString(8).trim());
                     orderStatus.setSzIdentifier3rdItem(result.getString(8).trim());
                     
                     //detail.setMnBaanStatus(new MathNumeric(result.getInt("OBStatus")));
                     if (result.getInt(9) !=0 ){
                         detail.setMnBaanStatus(new MathNumeric(result.getInt(9)));
                         orderStatus.setSzBaanLineStatus((new MathNumeric(result.getInt(9)).toString()));
                     }else{
                         if (actiValue.equals("tdsls4247m000")){
                             detail.setMnBaanStatus(new MathNumeric(5));
                             orderStatus.setSzBaanLineStatus("5");
                         }else{
                             detail.setMnBaanStatus(new MathNumeric(0));
                             orderStatus.setSzBaanLineStatus("0");
                         }
                     }
                 }else{
                     detail.setSzIdentifier2nditem(itemName);
                     orderStatus.setSzIdentifier3rdItem(itemName); 
                     //detail.setMnBaanStatus(new MathNumeric(result.getInt("IBStatus")));
                     if (result.getInt(7) !=0 ){
                         detail.setMnBaanStatus(new MathNumeric(result.getInt(7)));
                         orderStatus.setSzBaanLineStatus((new MathNumeric(result.getInt(7)).toString()));
                     }else{
                         if (result.getInt(9) !=0 ){
                             detail.setMnBaanStatus(new MathNumeric(result.getInt(9)));
                             orderStatus.setSzBaanLineStatus((new MathNumeric(result.getInt(9)).toString()));
                         }else{
                            if (actiValue.equals("tdsls4247m000")){
                                 detail.setMnBaanStatus(new MathNumeric(5));
                                orderStatus.setSzBaanLineStatus("5");
                            }else{
                                 detail.setMnBaanStatus(new MathNumeric(0));
                                 orderStatus.setSzBaanLineStatus("0");
                         }
                     }

                 }
             }
        }
        
        // Check to see the line has been cancelled and if so override the status to 999
        // detail.setMnBaanStatus(new MathNumeric(result.getInt("11")));     
             if (result.getInt(11)==1){
                 detail.setMnBaanStatus(new MathNumeric(999));
                 orderStatus.setSzBaanLineStatus("999");
             }
             
             
        baanOrderDetails.add(detail);
        messages.addMessages(BaanSalesOrderDetailUpdate.updateBaanSalesOrderStatus(context, connection, orderStatus));
             
         }
         
         BaanSalesOrderDetails[] bsoDetails = new BaanSalesOrderDetails[baanOrderDetails.size()];
         baanOrderDetails.toArray(bsoDetails);
         internalVO.setDetails(bsoDetails);
         
         preStatement.close();
         conn.close();
         }catch(ClassNotFoundException exp){
             System.out.println("Class not found for Oracle JDBC Driver within J5642010  "+exp.getMessage());
             context.getBSSVLogger().warn(context, "Class not found for Oracle JDBC Driver within J5642010");
             messages.addMessage(new E1Message(context,"006FIS","Class not found for Oracle JDBC Driver within J5642010"));
         }catch (SQLException exp){   
             System.out.println("SQL Exception creating the connection within J5642010 "+exp.getMessage());
             context.getBSSVLogger().warn(context, "SQL Exception creating the connection within J5642010  "+exp.getMessage());
             messages.addMessage(new E1Message(context, "019FIS","SQL Exception creating the connection within J5642010"));
         }catch(Exception exp){
            System.out.println("Error within J564210  "+exp.getMessage());
            context.getBSSVLogger().app(context, "Failed to get Baan Database Connection and or Data");
            messages.addMessage(new E1Message(context,"016FIS","Failed to get Baan Database Connection and or Data"));
         }finally {
            System.out.println("Exiting the the J5642010");
            context.getBSSVLogger().app(context, "Exiting the the J5642010");
        }       
        //TODO:  add messages returned from E1 processing to BusinessService message list.

        //Call finish internal method passing context.
        finishInternalMethod(context, "getBaanSalesOrder");

        //Call finish internal method passing context.
        return messages;
    }
}
