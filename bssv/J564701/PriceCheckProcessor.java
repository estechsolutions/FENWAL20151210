package kidde.e1.bssv.J564701;

import java.util.Date;

import kidde.e1.bssv.J564701.valueobject.InternalPriceCheck_D564074A;

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
public abstract class PriceCheckProcessor extends BusinessService {
    /**
     * TODO: Create Java Doc for: getItemPrice
     * Method getItemPrice is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList getItemPrice(IContext context, IConnection connection, InternalPriceCheck_D564074A internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "getItemPrice", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages.addMessages(callPriceCheck(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "getItemPrice");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the PriceCheck(N564704) business function which has the D564074A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callPriceCheck(IContext context, IConnection connection, InternalPriceCheck_D564074A internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnAddressNumber", internalVO.getMnAddressNumber());
        bsfnParams.setValue("mnAddressNumberShipTo", internalVO.getMnAddressNumberShipTo());
        bsfnParams.setValue("szIdentifier2ndItem", internalVO.getSzIdentifier2ndItem());
        bsfnParams.setValue("szCostCenter", internalVO.getSzCostCenter());
        bsfnParams.setValue("mnQuantityMinimum", internalVO.getMnQuantityMinimum());
        bsfnParams.setValue("szP4074Version", internalVO.getSzP4074Version());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "PriceCheck", bsfnParams);
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
        internalVO.setMnAddressNumber((MathNumeric)bsfnParams.getValue("mnAddressNumber"));
        internalVO.setMnAddressNumberShipTo((MathNumeric)bsfnParams.getValue("mnAddressNumberShipTo"));
        internalVO.setSzIdentifier2ndItem((String)bsfnParams.getValue("szIdentifier2ndItem"));
        internalVO.setSzCostCenter((String)bsfnParams.getValue("szCostCenter"));
        internalVO.setMnQuantityMinimum((MathNumeric)bsfnParams.getValue("mnQuantityMinimum"));
        internalVO.setJdPriceEffectiveDate((Date)bsfnParams.getValue("jdPriceEffectiveDate"));
        internalVO.setSzAdjustmentSchedule((String)bsfnParams.getValue("szAdjustmentSchedule"));
        internalVO.setSzUnitOfMeasurePricing((String)bsfnParams.getValue("szUnitOfMeasurePricing"));
        internalVO.setMnExchangeRate((MathNumeric)bsfnParams.getValue("mnExchangeRate"));
        internalVO.setCCurrencyMode(bsfnParams.getValue("cCurrencyMode").toString());
        internalVO.setMnAmtPricePerUnit2((MathNumeric)bsfnParams.getValue("mnAmtPricePerUnit2"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
