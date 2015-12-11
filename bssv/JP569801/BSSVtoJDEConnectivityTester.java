package kidde.e1.bssv.JP569801;

import java.util.Date;

import kidde.e1.bssv.JP569801.valueobject.TestBSSVRequest;
import kidde.e1.bssv.JP569801.valueobject.TestBSSVResponse;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BSSVtoJDEConnectivityTester extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public BSSVtoJDEConnectivityTester() {
    }

    /**
     * Published method for runConnectivityTest TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected runConnectivityTest
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public TestBSSVResponse runConnectivityTest(TestBSSVRequest vo) throws BusinessServiceException {
        return runConnectivityTest(null,null,vo);
    }

    /**
     * Protected method for BSSVtoJDEConnectivityTester PublishedBusinessService. runConnectivityTest will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected TestBSSVResponse runConnectivityTest(IContext context, IConnection connection, TestBSSVRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "runConnectivityTest", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            TestBSSVResponse internalVO = new TestBSSVResponse();
            internalVO.setUserID(vo.getUserID());
                
            //TODO: Call BusinessService passing context, connection and internal VO
            callGetAuditInfo(context, connection, internalVO);
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.

            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            TestBSSVResponse confirmVO = new TestBSSVResponse(internalVO);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "runConnectivityTest");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "runConnectivityTest");
        }
    }

    /**
     * Calls the GetAuditInfo(B9800100) business function which has the D9800100 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callGetAuditInfo(IContext context, IConnection connection, TestBSSVResponse internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szUserName", internalVO.getUserID());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "GetAuditInfo", bsfnParams);
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
        internalVO.setUserID((String)bsfnParams.getValue("szUserName"));
        internalVO.setDate((Date)bsfnParams.getValue("jdDate"));
        internalVO.setTime((MathNumeric)bsfnParams.getValue("mnTime"));
        internalVO.setWorkStationID((String)bsfnParams.getValue("szWorkstation_UserId"));
        internalVO.setMachineKey((String)bsfnParams.getValue("szMachineKey"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
