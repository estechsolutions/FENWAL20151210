package kidde.e1.bssv.JPM04211;

import kidde.e1.bssv.JM04211.SalesOrderLineMediaObjectProcessor;
import kidde.e1.bssv.JM04211.valueobject.MOItem_Internal;
import kidde.e1.bssv.JM04211.valueobject.SalesOrderDetailMO_GT4211;
import kidde.e1.bssv.JPM04211.valueobject.GetSalesOrderDetailRequest;
import kidde.e1.bssv.JPM04211.valueobject.MOItem_Publish;
import kidde.e1.bssv.JPM04211.valueobject.SalesOrderDetailReply;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class SalesOrderDetailMediaObjectManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public SalesOrderDetailMediaObjectManager() {
    }

    /**
     * Published method for selectSalesOrderLineMO TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected selectSalesOrderLineMO
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public SalesOrderDetailReply selectSalesOrderLineMO(GetSalesOrderDetailRequest vo) throws BusinessServiceException {
        return selectSalesOrderLineMO(null,null,vo);
    }

    /**
     * Protected method for SalesOrderDetailMediaObjectManager PublishedBusinessService. selectSalesOrderLineMO will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected SalesOrderDetailReply selectSalesOrderLineMO(IContext context, IConnection connection, GetSalesOrderDetailRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "selectSalesOrderLineMO", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
             SalesOrderDetailMO_GT4211 internalVO = new SalesOrderDetailMO_GT4211();
             internalVO.setMnDocumentorderinvoicee(new MathNumeric(vo.getOrderNumber()));
             internalVO.setSzOrdertype(vo.getOrderType());
             internalVO.setSzCompanykeyorderno(vo.getOrderCompany());
             
             if (vo.getLineNumber() !=null){
                internalVO.setMnLinenumber(new MathNumeric(vo.getLineNumber()));
             }
            
             internalVO.setDownloadMediaObject(false);
              
             MOItem_Internal internalMOItem = new MOItem_Internal();
             internalMOItem.setMoSeqNo(1);
             internalMOItem.setSzItemName("Text1");
             internalMOItem.setSzMoType("TEXT");
             MOItem_Internal[] moItems = new MOItem_Internal[1];
             moItems[0] = internalMOItem;                
             internalVO.setMoItems(moItems);   



             //TODO: Call BusinessService passing context, connection and internal VO
             messages.addMessages(SalesOrderLineMediaObjectProcessor.getSalesOrderLineMediaObject(context, connection, internalVO));

             //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
             //If messages contains errors, throw the exception

             if (messages.hasErrors())
             {
               //Get the string representation of all the messages.
               String error = messages.getMessagesAsString();
               //Throw new BusinessServiceException
               throw new BusinessServiceException(error, context);
             }

             //Exception was not thrown, so create the confirm VO from internal VO
             SalesOrderDetailReply confirmVO = new SalesOrderDetailReply(internalVO);
             confirmVO.setE1MessageList(messages);
             finishPublishedMethod(context, "getMediaRecord");
             //return outVO, filled with return values and messages
             return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "selectSalesOrderLineMO");
        }
    }


    static public MOItem_Internal[] convertMOItemArrayPublish(MOItem_Publish[] pubArray)
    { 
      MOItem_Internal[] retVMOItem = null;
      if(pubArray != null)
      {
        if(pubArray.length > 0)
        {
          retVMOItem = new MOItem_Internal[pubArray.length];
          for(int i=0; i<pubArray.length; i++)
          {
            retVMOItem[i] = new MOItem_Internal();
            retVMOItem[i].setMoSeqNo(pubArray[i].getMoSeqNo());
            retVMOItem[i].setSzItemName(pubArray[i].getSzItemName());
            retVMOItem[i].setSzMoType(pubArray[i].getSzMoType());
            retVMOItem[i].setSzData(pubArray[i].getSzData());
          }   
        }
      }
      return retVMOItem;
    }

}
