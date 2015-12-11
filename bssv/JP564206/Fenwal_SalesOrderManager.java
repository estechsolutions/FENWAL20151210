package kidde.e1.bssv.JP564206;

import kidde.e1.bssv.JM04211.SalesOrderLineMediaObjectProcessor;
import kidde.e1.bssv.JM04211.valueobject.SalesOrderDetailMO_GT4211;
import kidde.e1.bssv.JP564206.valueobject.FenwalSalesOrderRequest;
import kidde.e1.bssv.JP564206.valueobject.FenwalSalesOrderResponse;
import kidde.e1.bssv.JP564206.valueobject.SalesOrderMediaObjectRequest;
import kidde.e1.bssv.JP564206.valueobject.SalesOrderMediaObjectResponse;

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

import javax.activation.DataHandler;

import kidde.e1.bssv.J5642002.InternalApplyFreightProcess;
import kidde.e1.bssv.J5642002.valueobject.InternalApplyFreightCode_D5642011;
import kidde.e1.bssv.J5642003.InternalF564210AOperations;
import kidde.e1.bssv.J5642003.valueobject.UpdateTableF564210A_D5642003A;
import kidde.e1.bssv.J5642005.AdditionalKiddeSOData;
import kidde.e1.bssv.J5642005.valueobject.AdditionalKiddeSOData_D5642005A;
import kidde.e1.bssv.JM04211.valueobject.MOItem_Internal;
import kidde.e1.bssv.JP564206.valueobject.FenwalLineMediaText;

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
            }else{
                UpdateTableF564210A_D5642003A internalD5642003A = new UpdateTableF564210A_D5642003A();
                messages.addMessages(internalD5642003A.mapToUpdateTableF654210A_D5642003A(internalE1VO, vo));
                if (messages.hasErrors()) {
                    //Get the string representation of all the messages.
                    String error = messages.getMessagesAsString();
                    //Throw new BusinessServiceException
                    throw new BusinessServiceException(error, context);
                }
                messages.addMessages(InternalF564210AOperations.updateF564210A(context, connection, internalD5642003A));
            }
 
            AdditionalKiddeSOData_D5642005A internalD5642005A = new AdditionalKiddeSOData_D5642005A();
            messages.addMessages(internalD5642005A.mapToUpdateTableD5642005A(internalE1VO, vo));
            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            } 
            
            messages.addMessages(AdditionalKiddeSOData.UpdateKiddeSOData(context, connection, internalD5642005A));
            
            // write to the sales order media object header GT4201A
        if(vo.getFenwalSOData().getHeaderText() != null){  
            if(vo.getFenwalSOData().getHeaderText().trim().length() >0){
                InternalSalesOrderHeaderMO_GT4201A internalGT4201A = new InternalSalesOrderHeaderMO_GT4201A();
                internalGT4201A.setDownloadMediaObject(false);
                internalGT4201A.setMnDocumentorderinvoicee(internalE1VO.getMnOrderNo());
                internalGT4201A.setSzCompanykeyorderno(internalE1VO.getSzOrderCo());
                internalGT4201A.setSzOrdertype(internalE1VO.getSzOrderType());
                kidde.e1.bssv.JM4201A.valueobject.MOItem_Internal moItem = new kidde.e1.bssv.JM4201A.valueobject.MOItem_Internal();
                kidde.e1.bssv.JM4201A.valueobject.MOItem_Internal[] arrayMOItem = new kidde.e1.bssv.JM4201A.valueobject.MOItem_Internal[1];
                moItem.setMoSeqNo(1);
                moItem.setSzItemName("TEXT");
                moItem.setSzMoType("TEXT");
                DataHandler textData = new DataHandler(vo.getFenwalSOData().getHeaderText(),"application/text");
                moItem.setSzData(textData);
                arrayMOItem[0]=moItem;
                internalGT4201A.setMoItems(arrayMOItem);
                messages.addMessages(InternalSalesOrderMO_Processor.updateSalesOrderHeaderMO(context, connection, internalGT4201A));
            }
        }

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = "Media Object Header failed *** "+messages.getMessagesAsString();
                //Throw new BusinessServiceException
                context.getBSSVLogger().warn(context, error);
            }



            if(vo.getFenwalSOData().getAppliedFreightCode() != null){
                InternalApplyFreightCode_D5642011 internalFreightCode = new InternalApplyFreightCode_D5642011();
                internalFreightCode.setMnDocumentOrderInvoiceE(internalE1VO.getMnOrderNo());
                internalFreightCode.setSzOrderType(internalE1VO.getSzOrderType());
                internalFreightCode.setSzCompanyKey(internalE1VO.getSzOrderCo());
                internalFreightCode.setCApplyFreightYN(vo.getFenwalSOData().getAppliedFreightCode());
                messages.addMessages(InternalApplyFreightProcess.updateAppliedFreightCode(context, connection, internalFreightCode));
                
            }


            if (messages.hasErrors()){
                String error = messages.getMessagesAsString();
                error = "Freight Code Failed but Order Created *** "+error;
                context.getBSSVLogger().warn(context, error);
            }


            if (vo.getFenwalSOData().getMediaTextMessage() != null){
              if (vo.getFenwalSOData().getMediaTextMessage().length >0){
                FenwalLineMediaText[] mediaText = new FenwalLineMediaText[vo.getFenwalSOData().getMediaTextMessage().length];
                mediaText = vo.getFenwalSOData().getMediaTextMessage();
                
                
                for(int i=0;i<vo.getFenwalSOData().getMediaTextMessage().length; i++){
                    SalesOrderDetailMO_GT4211 internalGT4211 = new SalesOrderDetailMO_GT4211();
                    internalGT4211.setDownloadMediaObject(false);
                    internalGT4211.setMnDocumentorderinvoicee(internalE1VO.getMnOrderNo());
                    internalGT4211.setSzCompanykeyorderno(internalE1VO.getSzOrderCo());
                    internalGT4211.setSzOrdertype(internalE1VO.getSzOrderType());
                   // internalGT4211.setMnLinenumber(internalE1VO.getInternalProcessSODetail(i).getMnLineNo());
                    
                    int numberOfLineItems = internalE1VO.getInternalProcessSODetail().size();
                    String motext = "";
                    MathNumeric mnlineNumber = null;
                    for(int j=0; j<numberOfLineItems; j++){
                        if (mediaText[i].getItemId().intValue() == internalE1VO.getInternalProcessSODetail(j).getMnShortItemNo().intValue()){
                            motext = mediaText[i].getMediaTextMessage();
                            mnlineNumber = internalE1VO.getInternalProcessSODetail(j).getMnLineNo();
                        }
                    }
                    internalGT4211.setMnLinenumber(mnlineNumber);
                    
                    kidde.e1.bssv.JM04211.valueobject.MOItem_Internal moLine = new kidde.e1.bssv.JM04211.valueobject.MOItem_Internal();
                    kidde.e1.bssv.JM04211.valueobject.MOItem_Internal[] arrayLine = new kidde.e1.bssv.JM04211.valueobject.MOItem_Internal[1];
                    moLine.setMoSeqNo(1);
                    moLine.setSzItemName("TEXT");
                    moLine.setSzMoType("TEXT");
                    DataHandler lineData = new DataHandler(motext,"application/text");
                    moLine.setSzData(lineData);
                    arrayLine[0] = moLine;
                    internalGT4211.setMoItems(arrayLine);
                    messages.addMessages(SalesOrderLineMediaObjectProcessor.addSalesOrderLineMediaObject(context, connection, internalGT4211));
                    
                }
                
              }
            }

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = "Medida Object Line Entry failes ***  "+messages.getMessagesAsString();
                context.getBSSVLogger().warn(context, error);
            }



            //Exception was not thrown, so create the confirm VO from internal VO
            FenwalSalesOrderResponse confirmVO = new FenwalSalesOrderResponse(internalE1VO);
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
