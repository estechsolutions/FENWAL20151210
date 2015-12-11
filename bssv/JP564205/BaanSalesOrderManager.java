package kidde.e1.bssv.JP564205;

import kidde.e1.bssv.J5642010.BaanDatabaseMgr;
import kidde.e1.bssv.J5642010.BaanSalesOrderValidation;
import kidde.e1.bssv.J5642010.valueobject.BaanSalesOrder;
import kidde.e1.bssv.J5642013.BaanSalesOrderData;
import kidde.e1.bssv.J5642013.valueobject.BaanSalesOrderRequest;
import kidde.e1.bssv.JP564205.valueobject.ReplyBaanSalesOrder;
import kidde.e1.bssv.JP564205.valueobject.RequestBaanSalesOrder;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BaanSalesOrderManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public BaanSalesOrderManager() {
    }

    /**
     * Published method for getBaanSalesOrder TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected getBaanSalesOrder
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public ReplyBaanSalesOrder getBaanSalesOrder(RequestBaanSalesOrder vo) throws BusinessServiceException {
        return getBaanSalesOrder(null,null,vo);
    }

    /**
     * Protected method for BaanSalesOrderManager PublishedBusinessService. getBaanSalesOrder will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected ReplyBaanSalesOrder getBaanSalesOrder(IContext context, IConnection connection, RequestBaanSalesOrder vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "getBaanSalesOrder", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            
            BaanSalesOrderRequest salesorder = new BaanSalesOrderRequest();
            
            salesorder.setSzBaanOrderNumber(vo.getBaanSalesOrderNumber().toString());
            salesorder.setMnDocumentOrderInvoiceE(new MathNumeric(vo.getSalesOrderNumber()));
            salesorder.setSzCompanyKeyOrderNo(vo.getSalesOrderCompany());
            salesorder.setSzOrderType(vo.getSalesOrderType());
            
            //TODO: Call BusinessService passing context, connection and internal VO
      //      BaanDatabaseMgr dbManager = new BaanDatabaseMgr(); 
      //      dbManager.getData(salesorder);
            
            messages.addMessages(BaanSalesOrderData.processBaanSalesOrderStatus(context, connection, salesorder));
            
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.

            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            ReplyBaanSalesOrder confirmVO = new ReplyBaanSalesOrder(salesorder.getCErrorCode());
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "getBaanSalesOrder");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "getBaanSalesOrder");
        }
    }
}
