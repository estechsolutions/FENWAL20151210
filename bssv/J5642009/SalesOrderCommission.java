package kidde.e1.bssv.J5642009;

import kidde.e1.bssv.J5642009.valueobject.ComminssionUpdate_D5642009A;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class SalesOrderCommission extends BusinessService {
    /**
     * TODO: Create Java Doc for: updateCommission
     * Method updateCommission is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList updateCommission(IContext context, IConnection connection, ComminssionUpdate_D5642009A internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "updateCommission", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages.addMessages(callKidde_BaanToJDECommissionUpdate(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "updateCommission");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the Kidde_BaanToJDECommissionUpdate(N5642009) business function which has the D5642009A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callKidde_BaanToJDECommissionUpdate(IContext context, IConnection connection, ComminssionUpdate_D5642009A internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnDocumentOrderInvoiceE", internalVO.getMnDocumentOrderInvoiceE());
        bsfnParams.setValue("szCompanyKeyOrderNo", internalVO.getSzCompanyKeyOrderNo());
        bsfnParams.setValue("szOrderType", internalVO.getSzOrderType());
        bsfnParams.setValue("szCommissionCode", internalVO.getSzCommissionCode());
        bsfnParams.setValue("mnCommissionPercentage", internalVO.getMnCommissionPercentage());
        bsfnParams.setValue("cReplaceOrAdd", internalVO.getCReplaceOrAdd());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "Kidde_BaanToJDECommissionUpdate", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }


        //map output parameters to output value object
        internalVO.setCErrorCode(bsfnParams.getValue("cErrorCode").toString());
        internalVO.setSzErrorDescription((String)bsfnParams.getValue("szErrorDescription"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
