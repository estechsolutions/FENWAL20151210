package kidde.e1.bssv.JP564206;

import kidde.e1.bssv.JM04211.SalesOrderLineMediaObjectProcessor;
import kidde.e1.bssv.JM04211.valueobject.SalesOrderDetailMO_GT4211;
import kidde.e1.bssv.JP564206.valueobject.FenwalSalesOrderRequest;
import kidde.e1.bssv.JP564206.valueobject.FenwalSalesOrderResponse;
import kidde.e1.bssv.JP564206.valueobject.SalesOrderMediaObjectRequest;
import kidde.e1.bssv.JP564206.valueobject.SalesOrderMediaObjectResponse;
import kidde.e1.bssv.JP564206.valueobject.TotalPriceRequest;
import kidde.e1.bssv.JP564206.valueobject.TotalPriceResponse;

import oracle.e1.bssv.J4200010.SalesOrderProcessor;
import oracle.e1.bssv.J4200010.valueobject.InternalProcessSalesOrder;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

import kidde.e1.bssv.JM4201A.InternalSalesOrderMO_Processor;
import kidde.e1.bssv.JM4201A.valueobject.InternalSalesOrderHeaderMO_GT4201A;
import kidde.e1.bssv.JM4201A.valueobject.MOItem_Internal;
import javax.activation.DataHandler;


/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class Fenwal_SalesOrderManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public Fenwal_SalesOrderManager() {
    }

    /**
     * Published method for CreateSalesOrder TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected CreateSalesOrder
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public FenwalSalesOrderResponse CreateSalesOrder(FenwalSalesOrderRequest vo) throws BusinessServiceException {
        return CreateSalesOrder(null,null,vo);
    }

    /**
     * Protected method for Fenwal_SalesOrderManager PublishedBusinessService. CreateSalesOrder will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected FenwalSalesOrderResponse CreateSalesOrder(IContext context, IConnection connection, FenwalSalesOrderRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "CreateSalesOrder", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object. This is the standard JDE SalesOrder Object
            InternalProcessSalesOrder internalE1VO = new InternalProcessSalesOrder();
            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages(vo.getJDESalesOrderData().mapFromPublished(context, connection, internalE1VO));  
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
            if (messages.hasErrors()){
                String error = messages.getMessagesAsString();
                throw new BusinessServiceException(error, context);
            }else{
                messages.addMessages(SalesOrderProcessor.processSalesOrder(context, connection, internalE1VO));
            }
            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }
            
            
            // write to the sales order media objec header GT4201A
            if(vo.getFenwalSOData().getHeaderText().trim().length() >0){
                InternalSalesOrderHeaderMO_GT4201A internalGT4201A = new InternalSalesOrderHeaderMO_GT4201A();
                internalGT4201A.setDownloadMediaObject(false);
                internalGT4201A.setMnDocumentorderinvoicee(internalE1VO.getMnOrderNo());
                internalGT4201A.setSzCompanykeyorderno(internalE1VO.getSzOrderCo());
                internalGT4201A.setSzOrdertype(internalE1VO.getSzOrderType());
                MOItem_Internal moItem = new MOItem_Internal();
                MOItem_Internal[] arrayMOItem = new MOItem_Internal[1];
                moItem.setMoSeqNo(1);
                moItem.setSzItemName("TEXT");
                moItem.setSzMoType("TEXT");
                DataHandler textData = new DataHandler(vo.getFenwalSOData().getHeaderText(),"application/text");
                moItem.setSzData(textData);
                arrayMOItem[0]=moItem;
                internalGT4201A.setMoItems(arrayMOItem);
                messages.addMessages(InternalSalesOrderMO_Processor.updateSalesOrderHeaderMO(context, connection, internalGT4201A));
            }
            

            //Exception was not thrown, so create the confirm VO from internal VO
            FenwalSalesOrderResponse confirmVO = new FenwalSalesOrderResponse();
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "CreateSalesOrder");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "CreateSalesOrder");
        }
    }
    
    /**
     * Published method for GetTotalPrice TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected GetTotalPrice
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public TotalPriceResponse GetTotalPrice(TotalPriceRequest vo) throws BusinessServiceException {
        return GetTotalPrice(null,null,vo);
    }

    /**
     * Protected method for Test1 PublishedBusinessService. GetTotalPrice will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected TotalPriceResponse GetTotalPrice(IContext context, IConnection connection, TotalPriceRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "GetTotalPrice", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.

            //TODO: Call BusinessService passing context, connection and internal VO

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
            TotalPriceResponse confirmVO = new TotalPriceResponse();
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "GetTotalPrice");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "GetTotalPrice");
        }
    }    


    /**
     * Published method for UpdateSalesOrderMediaObject TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected UpdateSalesOrderMediaObject
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public SalesOrderMediaObjectResponse UpdateSalesOrderMediaObject(SalesOrderMediaObjectRequest vo) throws BusinessServiceException {

        return UpdateSalesOrderMediaObject(null,null,vo);
    }

    /**
     * Protected method for Test2 PublishedBusinessService. UpdateSalesOrderMediaObject will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected SalesOrderMediaObjectResponse UpdateSalesOrderMediaObject(IContext context, IConnection connection, SalesOrderMediaObjectRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "UpdateSalesOrderMediaObject", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            SalesOrderDetailMO_GT4211 internalMO = new SalesOrderDetailMO_GT4211();
            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages(vo.mapFromPublished(context,internalMO));
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
            internalMO.setMnDocumentorderinvoicee(new MathNumeric(vo.getDocumentOrderNoInvoiceetc()));
            internalMO.setMnLinenumber(new MathNumeric(vo.getLineNumber().doubleValue()));
            internalMO.setSzCompanykeyorderno(vo.getOrderCompanyOrderNumber());
            internalMO.setSzOrdertype(vo.getOrderType());
            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception
            messages.addMessages(SalesOrderLineMediaObjectProcessor.addSalesOrderLineMediaObject(context, connection, internalMO));
            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            SalesOrderMediaObjectResponse confirmVO = new SalesOrderMediaObjectResponse();
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "UpdateSalesOrderMediaObject");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "UpdateSalesOrderMediaObject");
        }
    }    
    
}
