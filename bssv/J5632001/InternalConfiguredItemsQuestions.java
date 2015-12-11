package kidde.e1.bssv.J5632001;

import kidde.e1.bssv.J5632001.valueobject.D5632001A;

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
public abstract class InternalConfiguredItemsQuestions extends BusinessService {
    /**
     * TODO: Create Java Doc for: getQuestionsAnswers
     * Method getQuestionsAnswers is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList getQuestionsAnswers(IContext context, IConnection connection, D5632001A internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "getQuestionsAnswers", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
            messages.addMessages(callReturnConfiguredItemValues(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "getQuestionsAnswers");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the ReturnConfiguredItemValues(N5632001) business function which has the D5632001A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callReturnConfiguredItemValues(IContext context, IConnection connection, D5632001A internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szCostCenter_MCU", internalVO.getSzCostCenter_MCU());
        bsfnParams.setValue("szIdentifier2ndItem_LITM", internalVO.getSzIdentifier2ndItem_LITM());
        bsfnParams.setValue("mnParentSegmentNumber_PEL", internalVO.getMnParentSegmentNumber_PEL());
        bsfnParams.setValue("szPreviousQuestionAnswer_SGVL", internalVO.getSzPreviousQuestionAnswer_SGVL());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "ReturnConfiguredItemValues", bsfnParams);
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
        internalVO.setSzSegmentValues_DESC2000((String)bsfnParams.getValue("szSegmentValues_DESC2000"));
        internalVO.setSzValueDefault_DVAL((String)bsfnParams.getValue("szValueDefault_DVAL"));
        internalVO.setCErrorFlag_EV01(bsfnParams.getValue("cErrorFlag_EV01").toString());
        internalVO.setCRequiredToBe(bsfnParams.getValue("cRequiredToBe").toString());
        internalVO.setCNumericYN(bsfnParams.getValue("cNumericYN").toString());
        internalVO.setCTypeOfValue(bsfnParams.getValue("cTypeOfValue").toString());

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
