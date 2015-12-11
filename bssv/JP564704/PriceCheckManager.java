package kidde.e1.bssv.JP564704;

import kidde.e1.bssv.J564701.PriceCheckProcessor;
import kidde.e1.bssv.J564701.valueobject.InternalPriceCheck_D564074A;
import kidde.e1.bssv.JP564704.valueobject.PriceCheckRequest;
import kidde.e1.bssv.JP564704.valueobject.PriceCheckResponse;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class PriceCheckManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public PriceCheckManager() {
    }

    /**
     * Published method for getPriceCheck TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected getPriceCheck
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public PriceCheckResponse getPriceCheck(PriceCheckRequest vo) throws BusinessServiceException {
        return getPriceCheck(null,null,vo);
    }

    /**
     * Protected method for PriceCheckManager PublishedBusinessService. getPriceCheck will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected PriceCheckResponse getPriceCheck(IContext context, IConnection connection, PriceCheckRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "getPriceCheck", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            InternalPriceCheck_D564074A internalVO = new InternalPriceCheck_D564074A();
            messages.addMessages(vo.mapFromPublishedToInternal(context, connection, internalVO));
            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages(PriceCheckProcessor.getItemPrice(context, connection, internalVO));
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
            context.getBSSVLogger().app(context, "Successfully Mapped Data and Called Internal Function J564701");
            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = "Error getting Customer Price ****  "+messages.getMessagesAsString();
                //Throw new BusinessServiceException
                context.getBSSVLogger().warn(context, error);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            PriceCheckResponse confirmVO = new PriceCheckResponse(internalVO);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "getPriceCheck");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "getPriceCheck");
        }
    }
}
