package kidde.e1.bssv.JP563291;

import kidde.e1.bssv.J5632001.InternalConfiguredItemsQuestions;
import kidde.e1.bssv.J5632001.valueobject.D5632001A;
import kidde.e1.bssv.J5632002.InternalConfigurationAnswers;
import kidde.e1.bssv.J5632002.valueobject.InsertConfigurationAnswers_D5632002B;
import kidde.e1.bssv.J56F3291.InternalGetSegmentData;
import kidde.e1.bssv.J56F3291.valueobject.InternalSelectSegment_F3291;
import kidde.e1.bssv.J56X0022.InternalUniqueNumber;
import kidde.e1.bssv.J56X0022.valueobject.InternalGetUKI_DX00022A;
import kidde.e1.bssv.JP563291.valueobject.SegmentDataReply;
import kidde.e1.bssv.JP563291.valueobject.SegmentDataRequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class ConfiguratorSegmentDataManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public ConfiguratorSegmentDataManager() {
    }

    /**
     * Published method for getSegmentData TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected getSegmentData
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public SegmentDataReply getSegmentData(SegmentDataRequest vo) throws BusinessServiceException {
        return getSegmentData(null,null,vo);
    }

    /**
     * Protected method for ConfiguratorSegmentDataManager PublishedBusinessService. getSegmentData will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected SegmentDataReply getSegmentData(IContext context, IConnection connection, SegmentDataRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "getSegmentData", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            if (vo.getUniqueKeyID() == null){
                vo.setUniqueKeyID(new Integer(0));
            }
            //Create a unique id for the transaction this will be stored in the table F5632001 in order to keep track of the answers
            Integer transactionID = new Integer(0);
            
            
            if ( vo.getUniqueKeyID().intValue() < 1){
                InternalGetUKI_DX00022A ukIData = new InternalGetUKI_DX00022A();
                ukIData.setSzObjectName("F5632001");
                messages.addMessages(InternalUniqueNumber.getUKID(context, connection, ukIData));
                transactionID = ukIData.getMnUniqueKeyID().intValue(); 
            }else{
                transactionID = vo.getUniqueKeyID();
            }
            
            //TODO: Create a new internal value object.
            InternalSelectSegment_F3291 internalSegment = new InternalSelectSegment_F3291();
            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages(vo.mapFromPublishedToWhereF3291(context, connection, internalSegment.getQueryWhereFields()));

            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
            messages.addMessages(InternalGetSegmentData.selectSegmentData(context, connection, internalSegment));
            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            SegmentDataReply confirmVO = null;

            D5632001A segmentAnswer = new D5632001A();
            segmentAnswer.setSzCostCenter_MCU(vo.getCostCenter());
            segmentAnswer.setSzIdentifier2ndItem_LITM(vo.getItem());
            if (vo.getSegmentNumber() !=null){
                segmentAnswer.setMnParentSegmentNumber_PEL(new MathNumeric(vo.getSegmentNumber()));
                segmentAnswer.setSzPreviousQuestionAnswer_SGVL(vo.getSegmentAnswer());
                messages.addMessages(InternalConfiguredItemsQuestions.getQuestionsAnswers(context, connection, segmentAnswer));
                confirmVO = new SegmentDataReply(context, connection, internalSegment, segmentAnswer.getSzSegmentValues_DESC2000(), vo.getSegmentNumber(), transactionID, vo.getSegmentAnswer());
            }else{
                //This is the first call so it is necessary to get all answers
                confirmVO = new SegmentDataReply(context, connection, internalSegment,transactionID);
            }
                    

            

            //Exception was not thrown, so create the confirm VO from internal VO
             
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "getSegmentData");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "getSegmentData");
        }
    }
}
