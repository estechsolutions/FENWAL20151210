package kidde.e1.bssv.JP564200;

import java.util.ArrayList;

import javax.activation.DataHandler;

import kidde.e1.bssv.J5642003.InternalF564210AOperations;
import kidde.e1.bssv.J5642003.valueobject.UpdateTableF564210A_D5642003A;
import kidde.e1.bssv.J5642005.AdditionalKiddeSOData;
import kidde.e1.bssv.J5642005.valueobject.AdditionalKiddeSOData_D5642005A;
import kidde.e1.bssv.J5642006.JDEItemLocation;
import kidde.e1.bssv.J5642006.valueobject.JDEItemLocation_D5642010;
import kidde.e1.bssv.J5642009.SalesOrderCommission;
import kidde.e1.bssv.J5642009.valueobject.ComminssionUpdate_D5642009A;
import kidde.e1.bssv.J5642012.CustomerData;
import kidde.e1.bssv.J5642012.valueobject.GetCustomerEDPM_D0100042;
import kidde.e1.bssv.JM4201A.InternalSalesOrderMO_Processor;
import kidde.e1.bssv.JM4201A.valueobject.InternalSalesOrderHeaderMO_GT4201A;
import kidde.e1.bssv.JM4201A.valueobject.MOItem_Internal;
import kidde.e1.bssv.JP564200.valueobject.ConfirmSalesOrderKidde;
import kidde.e1.bssv.JP564200.valueobject.KiddeSalesOrderCommission;
import kidde.e1.bssv.JP564200.valueobject.ProcessSalesOrderKidde;

import oracle.e1.bssv.J4200010.SalesOrderProcessor;
import oracle.e1.bssv.J4200010.valueobject.InternalProcessSalesOrder;
import oracle.e1.bssv.J4200050.SalesOrderQueryProcessor;
import oracle.e1.bssv.J4200050.valueobject.InternalGetSalesOrder;
import oracle.e1.bssv.J4200050.valueobject.InternalShowSalesOrder;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetail;
import oracle.e1.bssv.JP420000.valueobject.ShowSalesHeader;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class Kidde_SalesOrderManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public Kidde_SalesOrderManager() {
    }

    /**
     * Published method for processSalesOrder TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected processSalesOrder
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public ConfirmSalesOrderKidde processSalesOrder(ProcessSalesOrderKidde vo) throws BusinessServiceException {
        return processSalesOrder(null,null,vo);
    }

    /**
     * Protected method for Kidde_SalesOrderManager PublishedBusinessService. processSalesOrder will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected ConfirmSalesOrderKidde processSalesOrder(IContext context, IConnection connection, ProcessSalesOrderKidde vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "processSalesOrder", vo, IConnection.AUTO);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //Check the customer record to see if EDPM is P if so set the order type to SY 7/14/14 -EHS
            // remove the custom logic per Jennifer on 10/16/14 - EHS
//            GetCustomerEDPM_D0100042 customerEDPM = new GetCustomerEDPM_D0100042();
//            customerEDPM.setCActionCode("I");
//            customerEDPM.setCSuppressErrorMessage("1");
//            customerEDPM.setMnCustomerNumber(new MathNumeric(vo.getE1SalesOrder().getHeader().getShipTo().getCustomer().getEntityId()));
//            customerEDPM.setSzCompany(vo.getE1SalesOrder().getHeader().getCompany());
            
//            messages.addMessages(CustomerData.getCustomerEDPM(context, connection, customerEDPM));
            
//            if (customerEDPM.getCBatchProcessingMode().trim().equalsIgnoreCase("P")){
//                vo.getE1SalesOrder().getHeader().getSalesOrderKey().setDocumentTypeCode("SY");
//            }
            
            
 //           messages.addMessages(updateJDEItemLocation(context, connection, vo));
            
            //TODO: Create a new internal value object.
            // Create a new internal vo based on the published vo passed in.
            InternalProcessSalesOrder internalE1VO = new InternalProcessSalesOrder();
            
            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages(vo.getE1SalesOrder().mapFromPublished(context, connection, internalE1VO));
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.

            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }else{
                messages.addMessages(SalesOrderProcessor.processSalesOrder(context, connection, internalE1VO));
            }

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
            
               // write to the sales order media object header GT4201A
                if (vo.getKiddeSalesOrder().getHeaderText().trim().length()>0){
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
                DataHandler textData = new DataHandler(vo.getKiddeSalesOrder().getHeaderText(),"application/text");
                moItem.setSzData(textData);
                arrayMOItem[0]=moItem;
                internalGT4201A.setMoItems(arrayMOItem);
                messages.addMessages(InternalSalesOrderMO_Processor.updateSalesOrderHeaderMO(context, connection, internalGT4201A));
                }
                
                if (messages.hasErrors()) {
                    //Get the string representation of all the messages.
                    String error = messages.getMessagesAsString();
                    //Throw new BusinessServiceException
                    throw new BusinessServiceException(error, context);
                }else{
                    AdditionalKiddeSOData_D5642005A internalD5642005A = new AdditionalKiddeSOData_D5642005A();
                    messages.addMessages(internalD5642005A.mapToUpdateTableD5642005A(internalE1VO, vo));
                    if (messages.hasErrors()) {
                        //Get the string representation of all the messages.
                        String error = messages.getMessagesAsString();
                        //Throw new BusinessServiceException
                        throw new BusinessServiceException(error, context);
                    }
                    messages.addMessages(AdditionalKiddeSOData.UpdateKiddeSOData(context, connection, internalD5642005A));
                    if (messages.hasErrors()){
                        //Get the string represendation of all the messages.
                        String error = messages.getMessagesAsString();
                        //Throw new BuseinessServiceException
                        throw new BusinessServiceException(error, context);
                    }else{
                        // get the count for the relation collection
                        int cntRelation = 0;
                        if (vo.getKiddeSalesOrder().getRelationData() != null){
                            cntRelation = vo.getKiddeSalesOrder().getRelationData().length;
                        }
                            if (cntRelation > 0){ 
                                KiddeSalesOrderCommission  commission[] = new KiddeSalesOrderCommission[cntRelation];
                                commission = vo.getKiddeSalesOrder().getRelationData();
                                for (int i=0; i<cntRelation; i++){
                                    ComminssionUpdate_D5642009A internalD5642009A = new ComminssionUpdate_D5642009A();
                                    internalD5642009A.setMnDocumentOrderInvoiceE(internalE1VO.getMnOrderNo());
                                    internalD5642009A.setSzOrderType(internalE1VO.getSzOrderType());
                                    internalD5642009A.setSzCompanyKeyOrderNo(internalE1VO.getSzOrderCo());
                                    if (i==0){
                                        internalD5642009A.setCReplaceOrAdd("R");
                                    }else{
                                        internalD5642009A.setCReplaceOrAdd("A");
                                    }
                                    internalD5642009A.setSzCommissionCode(commission[i].getRelationCode());
                                    internalD5642009A.setMnCommissionPercentage(new MathNumeric(commission[i].getRelation().doubleValue()));
                                    messages.addMessages(SalesOrderCommission.updateCommission(context, connection, internalD5642009A));
                                    if (messages.hasErrors()){
                                        //Get the string represendation of all the messages.
                                        String error = messages.getMessagesAsString();
                                        //Throw new BuseinessServiceException
                                        throw new BusinessServiceException(error, context);
                                    }
                                }
                            }
                    }
                    
                }
            }

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

    
             InternalGetSalesOrder so = new InternalGetSalesOrder();
             so.getHeaderWhereFields().setF4201_DOCO(internalE1VO.getMnOrderNo());
             so.getHeaderWhereFields().setF4201_DCTO(internalE1VO.getSzOrderType());
             so.getHeaderWhereFields().setF4201_KCOO(internalE1VO.getSzOrderCo());
             so.getHeaderWhereFields().setSzCalledFrom("J564200");

             messages.addMessages(SalesOrderQueryProcessor.getSalesOrder(context, connection, so));
            
            ArrayList resultRecords = so.getQueryHeaderResult();
            if (resultRecords != null){
                if (resultRecords.size()>0){
                    InternalShowSalesOrder internalSO = (InternalShowSalesOrder)resultRecords.get(0);
                    internalE1VO.setSzHoldOrdersCode(internalSO.getF4201_HOLD());
                }
            }
      
            
            //Exception was not thrown, so create the confirm VO from internal VO
            ConfirmSalesOrderKidde confirmVO = new ConfirmSalesOrderKidde(internalE1VO);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "processSalesOrder");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "processSalesOrder");
        }
    }

    protected E1MessageList updateJDEItemLocation(IContext context, IConnection connection, ProcessSalesOrderKidde kiddeSO){
        E1MessageList msgList = new E1MessageList();
        if (kiddeSO.getE1SalesOrder().getHeader().getDetail() != null){
            int cntSODetail = kiddeSO.getE1SalesOrder().getHeader().getDetail().length;
            ProcessSODetail[] soDetail = new ProcessSODetail[cntSODetail];
              soDetail =  kiddeSO.getE1SalesOrder().getHeader().getDetail();
              for(int i=0;i<cntSODetail;i++){
                  JDEItemLocation_D5642010 itemLocation = new JDEItemLocation_D5642010();
                  if (soDetail[i].getProduct().getItem().getItemId() != null){
                    itemLocation.setMnIdentifierShortItem(new MathNumeric(soDetail[i].getProduct().getItem().getItemId()));
                  }
                  itemLocation.setSzIdentifier2ndItem(soDetail[i].getProduct().getItem().getItemProduct());
                  itemLocation.setSzIdentifier3rdItem(soDetail[i].getProduct().getItem().getItemCatalog());
                
                   msgList.addMessages(JDEItemLocation.getItemLocation(context, connection, itemLocation));
                   
                  if (!itemLocation.getSzCostCenter().equalsIgnoreCase("")){
                    soDetail[i].setBusinessUnit(itemLocation.getSzCostCenter());
                    soDetail[i].getProduct().setLocation(itemLocation.getSzLocation());
                  }
                  
              }

            }
              
        
        return msgList;
    }

}
