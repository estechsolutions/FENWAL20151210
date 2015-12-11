package kidde.e1.bssv.J5642013;

import kidde.e1.bssv.J5642010.BaanSalesOrderValidation;
import kidde.e1.bssv.J5642010.valueobject.BaanSalesOrder;
import kidde.e1.bssv.J5642013.valueobject.BaanSalesOrderRequest;

import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.ServicePropertyException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.ServicePropertyAccess;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BaanSalesOrderData extends BusinessService {
    
    private static final String BAAN_DATABASE = "J5642013_BAAN_DATABASE";
    private static final String HOST = "J5642013_BAAN_HOST";    
    private static final String PORT = "J5642013_BAAN_PORT";
    private static final String USER = "J5642013_BAAN_USER";
    private static final String PASSWORD = "J5642013_BAAN_PASSWORD";
    
    /**
     * TODO: Create Java Doc for: processBaanSalesOrderStatus
     * Method processBaanSalesOrderStatus is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList processBaanSalesOrderStatus(IContext context, IConnection connection, BaanSalesOrderRequest internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "processBaanSalesOrderStatus", internalVO);
        String baanDatabaseName = "baanqa1";
        String baanHostName = "159.82.220.137";
        String baanPort = "6000";
        String baanUser = "ROJDE";
        String baanPassword = "HELLO123";
        
        E1MessageList messages = new E1MessageList();
        try{
            
            baanDatabaseName = ServicePropertyAccess.getSvcPropertyValue(context, BAAN_DATABASE);
            
        }catch(ServicePropertyException spExp){
            System.out.println(spExp.getMessage());
            // Log the failure if the service constant could not be retreived.
            context.getBSSVLogger().app(context, 
                                       "Attempt to retrieve Service Constant: Baan Database Name failed.", 
                                       "Verify that key exists in P951000 entered.", 
                                       BAAN_DATABASE, spExp);
            //Create new E1 Message using DD item for service constant exception.
            E1Message scMessage = new E1Message(context, "001FIS", BAAN_DATABASE);
            messages.addMessage(scMessage);
        }
        
        try{
            
            baanHostName = ServicePropertyAccess.getSvcPropertyValue(context, HOST);
            
        }catch(ServicePropertyException spExp){
            System.out.println(spExp.getMessage());
            // Log the failure if the service constant could not be retreived.
            context.getBSSVLogger().app(context, 
                                       "Attempt to retrieve Service Constant: Baan Database Name failed.", 
                                       "Verify that key exists in P951000 entered.", 
                                       HOST, spExp);
            //Create new E1 Message using DD item for service constant exception.
            E1Message scMessage = new E1Message(context, "001FIS", HOST);
            messages.addMessage(scMessage);
        }

        try{
            
            baanPort = ServicePropertyAccess.getSvcPropertyValue(context, PORT);
            
        }catch(ServicePropertyException spExp){
            System.out.println(spExp.getMessage());
            // Log the failure if the service constant could not be retreived.
            context.getBSSVLogger().app(context, 
                                       "Attempt to retrieve Service Constant: Baan Database Name failed.", 
                                       "Verify that key exists in P951000 entered.", 
                                       PORT, spExp);
            //Create new E1 Message using DD item for service constant exception.
            E1Message scMessage = new E1Message(context, "001FIS", PORT);
            messages.addMessage(scMessage);
        }        
        
        try{
            
            baanUser = ServicePropertyAccess.getSvcPropertyValue(context, USER);
            
        }catch(ServicePropertyException spExp){
            System.out.println(spExp.getMessage());
            // Log the failure if the service constant could not be retreived.
            context.getBSSVLogger().app(context, 
                                       "Attempt to retrieve Service Constant: Baan Database Name failed.", 
                                       "Verify that key exists in P951000 entered.", 
                                       USER, spExp);
            //Create new E1 Message using DD item for service constant exception.
            E1Message scMessage = new E1Message(context, "001FIS", USER);
            messages.addMessage(scMessage);
        }        
        
        try{
            
            baanPassword = ServicePropertyAccess.getSvcPropertyValue(context, PASSWORD);
            
        }catch(ServicePropertyException spExp){
            System.out.println(spExp.getMessage());
            // Log the failure if the service constant could not be retreived.
            context.getBSSVLogger().app(context, 
                                       "Attempt to retrieve Service Constant: Baan Database Name failed.", 
                                       "Verify that key exists in P951000 entered.", 
                                       PASSWORD, spExp);
            //Create new E1 Message using DD item for service constant exception.
            E1Message scMessage = new E1Message(context, "001FIS", PASSWORD);
            messages.addMessage(scMessage);
        }        
        
        //Create new message list for BusinessService processing.

        BaanSalesOrder baanSalesOrder = new BaanSalesOrder();
        baanSalesOrder.setMnDocumentOrderInvoiceE(internalVO.getMnDocumentOrderInvoiceE());
        baanSalesOrder.setOrderNumber(internalVO.getSzBaanOrderNumber());
        baanSalesOrder.setSzCompanyKeyOrderNo(internalVO.getSzCompanyKeyOrderNo());
        baanSalesOrder.setSzOrderType(internalVO.getSzOrderType());
        baanSalesOrder.setDatabaseName(baanDatabaseName);
        baanSalesOrder.setHostname(baanHostName);
        baanSalesOrder.setPassword(baanPassword);
        baanSalesOrder.setUser(baanUser);
        baanSalesOrder.setPort(baanPort);
        
        if (baanSalesOrder.getOrderNumber().trim().length()!=0){
            messages.addMessages(BaanSalesOrderValidation.getBaanSalesOrder(context, connection, baanSalesOrder));
        }else{
            internalVO.setCErrorCode("1");
            context.getBSSVLogger().app(context, 
                                       "Baan Sales Order is empty", 
                                       "Verify F564210A.DL02 has a value.", 
                                       "", null);
            //Create new E1 Message using DD item for service constant exception.
            E1Message scMessage = new E1Message(context, "001FIS", "Invalid Baan Order");
            messages.addMessage(scMessage);
        }
        
        if (messages.hasErrors()){
            internalVO.setCErrorCode("1");
        }else{
            internalVO.setCErrorCode("0");
        }


        //Call finish internal method passing context.
        finishInternalMethod(context, "processBaanSalesOrderStatus");

        //Call finish internal method passing context.
        return messages;
    }
}
