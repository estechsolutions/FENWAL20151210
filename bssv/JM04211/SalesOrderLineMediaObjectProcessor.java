package kidde.e1.bssv.JM04211;

import java.util.ArrayList;
import java.util.Iterator;

import javax.activation.DataHandler;

import kidde.e1.bssv.JM04211.valueobject.MOItem_Internal;
import kidde.e1.bssv.JM04211.valueobject.SalesOrderDetailMO_GT4211;

import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.MOInfo;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.MOServiceException;
import oracle.e1.bssvfoundation.services.IMOService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class SalesOrderLineMediaObjectProcessor extends BusinessService {
    /**
     * TODO: Create Java Doc for: addSalesOrderLineMediaObject
     * Method addSalesOrderLineMediaObject is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList addSalesOrderLineMediaObject(IContext context, IConnection connection, SalesOrderDetailMO_GT4211 internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "addSalesOrderLineMediaObject", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages = insertMediaObject(context, connection, internalVO);
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "addSalesOrderLineMediaObject");

        //Call finish internal method passing context.
        return messages;
    }
    
    
/**
 * TODO: Complete Javadoc for method
 * @param context conditionally provides the connection for the database operation and logging information
 * @param connection can either be an explicit connection or null. If null the default connection is used.
 * @param internalVO the internal value object representing EnterpriseOne input data for TODO: Complete Javadoc
 * @return messages warnings and errors that have occurred during processing
 */
public static E1MessageList getSalesOrderLineMediaObject(IContext context,
                                         IConnection connection, 
                                         SalesOrderDetailMO_GT4211 internalVO) {
   //Call start internal method, passing the context (which was passed from Published Business Service)
   startInternalMethod(context, "getSalesOrderLineMediaObject", internalVO);

   //Create new message list for BSSV processing.
   E1MessageList messages = new E1MessageList();
   //TODO: call method (created by the wizard), which then executes Business Function or Database operation
   messages = selectMediaObject(context, connection, internalVO);
   //TODO:  add messages returned from E1 processing to BSSV message list.


   //Call finish internal method passing context.
   finishInternalMethod(context, "getSalesOrderLineMediaObject");
   //Return E1MessageList containing errors and warnings that occurred during processing BSSV.
   return messages;

}

/**
 * TODO: Complete Javadoc for method
 * @param context conditionally provides the connection for the database operation and logging information
 * @param connection can either be an explicit connection or null. If null the default connection is used.
 * @param internalVO the internal value object representing EnterpriseOne input data for TODO: Complete Javadoc
 * @return messages warnings and errors that have occurred during processing
 */
public static E1MessageList deleteSalesOrderLineMediaObject(IContext context,
                                         IConnection connection, 
                                         SalesOrderDetailMO_GT4211 internalVO) {
   //Call start internal method, passing the context (which was passed from Published Business Service)
   startInternalMethod(context, "deleteSalesOrderLineMediaObject", internalVO);

   //Create new message list for BSSV processing.
   E1MessageList messages = new E1MessageList();
   //TODO: call method (created by the wizard), which then executes Business Function or Database operation
    messages =    deleteMediaObject(context, connection, internalVO);
   //TODO:  add messages returned from E1 processing to BSSV message list.


   //Call finish internal method passing context.
   finishInternalMethod(context, "deleteSalesOrderLineMediaObject");
   //Return E1MessageList containing errors and warnings that occurred during processing BSSV.
   return messages;

}


    /**
     * Calls the INSERT media object.
     * @param context conditionally provides the connection for the media object call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList insertMediaObject(IContext context, IConnection connection, SalesOrderDetailMO_GT4211 internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify condition records must meet to be inserted
        MOItem_Internal[] moItems = internalVO.getMoItems();
        for(int i = 0;i<moItems.length;i++)
        {
            MOItem_Internal moItem = moItems[i];
            MOInfo moInfo = new MOInfo();
            moInfo.setSzMoName(internalVO.getSzMoName());
            moInfo.setSzMoKey(internalVO.getSzMoKey());
            moInfo.setSzItemName(moItem.getSzItemName());
            moInfo.setSzMoType(moItem.getSzMoType());
            moInfo.setSzData(moItem.getSzData());
            try {
                //get moService from context
                IMOService moService = context.getMOService();
                //execute mo insert operation
                moService.insert(context, connection, moInfo);
            } catch (MOServiceException me) {
                //TODO take some action in response to the media object exception
                returnMessages.addMessage(new E1Message(context, "007FIS", me.getMessage()));
            }
            catch (Exception e) {
                //TODO take some action in response to the media object exception
                returnMessages.addMessage(new E1Message(context, "007FIS", e.getMessage()));
            }

        }
        return returnMessages;
    }

    /**
     * Calls the SELECT media object.
     * @param context conditionally provides the connection for the media object call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList selectMediaObject(IContext context, IConnection connection, SalesOrderDetailMO_GT4211 internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify condition records must meet to be selected
        ArrayList result;

        ArrayList results = new ArrayList();

        MOItem_Internal[] moItems = internalVO.getMoItems();
        for(int i = 0;i<moItems.length;i++)
        {
            MOItem_Internal moItem = moItems[i];
            MOInfo moInfo = new MOInfo();
            moInfo.setSzMoName(internalVO.getSzMoName());
            moInfo.setSzMoKey(internalVO.getSzMoKey());
            moInfo.setDownloadMediaObject(internalVO.isDownloadMediaObject());
           // moInfo.setMoSeqNo(moItem.getMoSeqNo());
            moInfo.setSzMoType(moItem.getSzMoType());
         //   moInfo.setSzItemName(moItem.getSzItemName());
            try {
                //get moService from context
                IMOService moService = context.getMOService();
                //execute mo select operation
                result = moService.select(context, connection, moInfo);
                if (result.size() > 0)
                    results.addAll(result);
            } catch (MOServiceException me) {
                //TODO take some action in response to the media object exception
                returnMessages.addMessage(new E1Message(context, "007FIS", me.getMessage()));
            }
            catch (Exception e) {
                //TODO take some action in response to the media object exception
                returnMessages.addMessage(new E1Message(context, "007FIS", e.getMessage()));
            }

        }
        Iterator iterator = results.iterator();
        MOItem_Internal[] output = new MOItem_Internal[results.size()];
        int i = 0;
        while(iterator.hasNext())
        {
            MOInfo moInfo = (MOInfo)iterator.next();
            MOItem_Internal moItem = new MOItem_Internal();
            moItem.setSzItemName(moInfo.getSzItemName());
            moItem.setSzData((DataHandler)moInfo.getSzData());
            moItem.setMoSeqNo(moInfo.getMoSeqNo());
            moItem.setSzMoType(moInfo.getSzMoType());
            output[i] = moItem;
            i++;
        }
        //map results to internal vo
        internalVO.setMoItems(output);
        return returnMessages;
    }

    /**
     * Calls the DELETE media object.
     * @param context conditionally provides the connection for the media object call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList deleteMediaObject(IContext context, IConnection connection, SalesOrderDetailMO_GT4211 internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify condition records must meet to be deleted
        MOItem_Internal[] moItems = internalVO.getMoItems();
        for(int i = 0;i<moItems.length;i++)
        {
            MOItem_Internal moItem = moItems[i];
            MOInfo moInfo = new MOInfo();
            moInfo.setSzMoName(internalVO.getSzMoName());
            moInfo.setSzMoKey(internalVO.getSzMoKey());
            moInfo.setMoSeqNo(moItem.getMoSeqNo());
            moInfo.setSzMoType(moItem.getSzMoType());
            try {
                //get moService from context
                IMOService moService = context.getMOService();
                //execute mo delete operation
                moService.delete(context, connection, moInfo);
            } catch (MOServiceException me) {
                //TODO take some action in response to the media object exception
                returnMessages.addMessage(new E1Message(context, "007FIS", me.getMessage()));
            }
            catch (Exception e) {
                //TODO take some action in response to the media object exception
                returnMessages.addMessage(new E1Message(context, "007FIS", e.getMessage()));
            }

        }
        return returnMessages;
    }
}
