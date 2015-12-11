package kidde.e1.bssv.J5642004;

import kidde.e1.bssv.J5642004.valueobject.InternalF560101AOperations_D5642004A;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class InternalF560101AOperations extends BusinessService {
    /**
     * TODO: Create Java Doc for: addCustomerShipTo
     * Method addCustomerShipTo is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList addCustomerShipTo(IContext context, IConnection connection, InternalF560101AOperations_D5642004A internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "addCustomerShipTo", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages.addMessages(callF560101AShipToOverrideUpdate(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "addCustomerShipTo");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the F560101AShipToOverrideUpdate(N5642004) business function which has the D5642004A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callF560101AShipToOverrideUpdate(IContext context, IConnection connection, InternalF560101AOperations_D5642004A internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("jdDateFrom", internalVO.getJdDateFrom());
        bsfnParams.setValue("jdDateThru", internalVO.getJdDateThru());
        bsfnParams.setValue("szDateType", internalVO.getSzDateType());
        bsfnParams.setValue("mnAddressNumber", internalVO.getMnAddressNumber());
        bsfnParams.setValue("szAccountNumber", internalVO.getSzAccountNumber());
        bsfnParams.setValue("szBAANShipToNumber", internalVO.getSzBAANShipToNumber());
        bsfnParams.setValue("szName", internalVO.getSzName());
        bsfnParams.setValue("szAddressLine1", internalVO.getSzAddressLine1());
        bsfnParams.setValue("szAddressLine2", internalVO.getSzAddressLine2());
        bsfnParams.setValue("szAddressLine3", internalVO.getSzAddressLine3());
        bsfnParams.setValue("szAddressLine4", internalVO.getSzAddressLine4());
        bsfnParams.setValue("szAddressLine5", internalVO.getSzAddressLine5());
        bsfnParams.setValue("szAddressLine6", internalVO.getSzAddressLine6());
        bsfnParams.setValue("szCity", internalVO.getSzCity());
        bsfnParams.setValue("szState", internalVO.getSzState());
        bsfnParams.setValue("szZipCodePostal", internalVO.getSzZipCodePostal());
        bsfnParams.setValue("szCountry", internalVO.getSzCountry());
        bsfnParams.setValue("cActiveInactiveFlag", internalVO.getCActiveInactiveFlag());
        bsfnParams.setValue("cDefaultYN", internalVO.getCDefaultYN());
        bsfnParams.setValue("cEverestEventPoint03", internalVO.getCEverestEventPoint03());
        bsfnParams.setValue("cEverestEventPoint04", internalVO.getCEverestEventPoint04());
        bsfnParams.setValue("mnUserReservedAmount", internalVO.getMnUserReservedAmount());
        bsfnParams.setValue("szUserReservedCode", internalVO.getSzUserReservedCode());
        bsfnParams.setValue("jdUserReservedDate", internalVO.getJdUserReservedDate());
        bsfnParams.setValue("jdUserReservedDate_2", internalVO.getJdUserReservedDate_2());
        bsfnParams.setValue("mnAssignUserReservedNumeri", internalVO.getMnAssignUserReservedNumeri());
        bsfnParams.setValue("szAssignUserReservedString", internalVO.getSzAssignUserReservedString());
        bsfnParams.setValue("mnAddressNumber1st", internalVO.getMnAddressNumber1st());
        bsfnParams.setValue("mnAddressNumber2nd", internalVO.getMnAddressNumber2nd());
        bsfnParams.setValue("mnDocumentOrderInvoiceE", internalVO.getMnDocumentOrderInvoiceE());
        bsfnParams.setValue("szOrderType", internalVO.getSzOrderType());
        bsfnParams.setValue("szCompanyKeyOrderNo", internalVO.getSzCompanyKeyOrderNo());
        bsfnParams.setValue("szCountyAddress", internalVO.getSzCountyAddress());
        bsfnParams.setValue("cTypeAddressNumber", internalVO.getCTypeAddressNumber());
        bsfnParams.setValue("mnUniqueKeyIDInternal", internalVO.getMnUniqueKeyIDInternal());
        bsfnParams.setValue("cErrorCode", internalVO.getCErrorCode());
        bsfnParams.setValue("cActionCode", internalVO.getCActionCode());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "F560101AShipToOverrideUpdate", bsfnParams);
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
        internalVO.setMnAddressNumberShipTo((MathNumeric)bsfnParams.getValue("mnAddressNumberShipTo"));
        internalVO.setMnUniqueKeyIDInternal((MathNumeric)bsfnParams.getValue("mnUniqueKeyIDInternal"));
        internalVO.setCErrorCode(bsfnParams.getValue("cErrorCode").toString());

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
