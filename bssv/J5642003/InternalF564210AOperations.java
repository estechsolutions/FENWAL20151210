package kidde.e1.bssv.J5642003;

import kidde.e1.bssv.J5642003.valueobject.UpdateTableF564210A_D5642003A;

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
public abstract class InternalF564210AOperations extends BusinessService {
    /**
     * TODO: Create Java Doc for: updateF564210A
     * Method updateF564210A is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList updateF564210A(IContext context, IConnection connection, UpdateTableF564210A_D5642003A internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "updateF564210A", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();
        
        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages.addMessages(callF564210ACustomSalesUpdate(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.

        //Call finish internal method passing context.
        finishInternalMethod(context, "updateF564210A");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the F564210ACustomSalesUpdate(N5642003) business function which has the D5642003A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callF564210ACustomSalesUpdate(IContext context, IConnection connection, UpdateTableF564210A_D5642003A internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szTransactionAction", internalVO.getSzTransactionAction());
        bsfnParams.setValue("szCompanyKeyOrderNo", internalVO.getSzCompanyKeyOrderNo());
        bsfnParams.setValue("mnDocumentOrderInvoiceE", internalVO.getMnDocumentOrderInvoiceE());
        bsfnParams.setValue("szOrderType", internalVO.getSzOrderType());
        bsfnParams.setValue("mnAddressNumber", internalVO.getMnAddressNumber());
        bsfnParams.setValue("szNameRemark", internalVO.getSzNameRemark());
        bsfnParams.setValue("szNameRemarksLine2", internalVO.getSzNameRemarksLine2());
        bsfnParams.setValue("szDescription001", internalVO.getSzDescription001());
        bsfnParams.setValue("jdDateExpiredJulian1", internalVO.getJdDateExpiredJulian1());
        bsfnParams.setValue("jdDateEffectiveJulian1", internalVO.getJdDateEffectiveJulian1());
        bsfnParams.setValue("szDescription01002", internalVO.getSzDescription01002());
        bsfnParams.setValue("szDescription01003", internalVO.getSzDescription01003());
        bsfnParams.setValue("mnFarmNumber", internalVO.getMnFarmNumber());
        bsfnParams.setValue("mnAddressNumber1", internalVO.getMnAddressNumber1());
        bsfnParams.setValue("szask", internalVO.getSzask());
        bsfnParams.setValue("szattitude", internalVO.getSzattitude());
        bsfnParams.setValue("szUserId", internalVO.getSzUserId());
        bsfnParams.setValue("jdDateUpdated", internalVO.getJdDateUpdated());
        bsfnParams.setValue("mnTimeLastUpdated", internalVO.getMnTimeLastUpdated());
        bsfnParams.setValue("szProgramId", internalVO.getSzProgramId());
        bsfnParams.setValue("szWorkStationId", internalVO.getSzWorkStationId());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "F564210ACustomSalesUpdate", bsfnParams);
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
        internalVO.setSzErrorMessage((String)bsfnParams.getValue("szErrorMessage"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
