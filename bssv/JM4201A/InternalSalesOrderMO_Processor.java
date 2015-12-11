package kidde.e1.bssv.JM4201A;

import java.util.ArrayList;
import java.util.Iterator;

import javax.activation.DataHandler;

import kidde.e1.bssv.JM4201A.valueobject.InternalSalesOrderHeaderMO_GT4201A;

import kidde.e1.bssv.JM4201A.valueobject.MOItem_Internal;

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
public abstract class InternalSalesOrderMO_Processor extends BusinessService {
    /**
     * TODO: Create Java Doc for: updateSalesOrderHeaderMO
     * Method updateSalesOrderHeaderMO is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList updateSalesOrderHeaderMO(IContext context, IConnection connection, InternalSalesOrderHeaderMO_GT4201A internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "updateSalesOrderHeaderMO", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages.addMessages(insertMediaObject(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "updateSalesOrderHeaderMO");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the INSERT media object.
     * @param context conditionally provides the connection for the media object call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList insertMediaObject(IContext context, IConnection connection, InternalSalesOrderHeaderMO_GT4201A internalVO) {
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
}
