package kidde.e1.bssv.JP564204;

import kidde.e1.bssv.J5642004.InternalF560101AOperations;
import kidde.e1.bssv.J5642004.valueobject.InternalF560101AOperations_D5642004A;
import kidde.e1.bssv.J5642007.InActivateShipToF560101A;
import kidde.e1.bssv.J5642007.valueobject.Internal_InActivateShipTO_D5642004B;
import kidde.e1.bssv.JP564204.valueobject.EdwardsShipToReply;
import kidde.e1.bssv.JP564204.valueobject.EdwardsShipToRequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class F560101AOperations extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public F560101AOperations() {
    }

    /**
     * Published method for addCustomerShipTo TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected addCustomerShipTo
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public EdwardsShipToReply addCustomerShipTo(EdwardsShipToRequest vo) throws BusinessServiceException {
        return addCustomerShipTo(null,null,vo);
    }

    /**
     * Protected method for F560101AOperations PublishedBusinessService. addCustomerShipTo will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected EdwardsShipToReply addCustomerShipTo(IContext context, IConnection connection, EdwardsShipToRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "addCustomerShipTo", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            InternalF560101AOperations_D5642004A f560101AData = new InternalF560101AOperations_D5642004A();
            Internal_InActivateShipTO_D5642004B shipToFlag = new Internal_InActivateShipTO_D5642004B();
            
            if (vo.getAddressActivationFlag() != null && vo.getAddressActivationFlag().compareToIgnoreCase("I")==0){
                if (vo.getCustomerSoldTo() != null){
                    shipToFlag.setMnAddressNumberShipTo(new MathNumeric(vo.getCustomerSoldTo().intValue()));
                    messages.addMessages(InActivateShipToF560101A.inactivateShipToFlag(context, connection, shipToFlag));
                    f560101AData.setMnAddressNumberShipTo(new MathNumeric(vo.getCustomerSoldTo().intValue()));
                    
                    if (messages.hasErrors()) {
                        //Get the string representation of all the messages.
                        String error = messages.getMessagesAsString();
                        //Throw new BusinessServiceException
                        throw new BusinessServiceException(error, context);
                    }
                
                }else{
                    String error = "Customer Number is null, not able to inactivate";
                    //Throw new BusinessServiceException
                    throw new BusinessServiceException(error, context); 
                }
                
            }else{
            
            
                
                //TODO: Call BusinessService passing context, connection and internal VO
                messages.addMessages(vo.mapShipRequestToInternal(f560101AData));
                
                //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
                messages.addMessages(InternalF560101AOperations.addCustomerShipTo(context, connection, f560101AData));
                    
                //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
                //If messages contains errors, throw the exception
    
                if (messages.hasErrors()) {
                    //Get the string representation of all the messages.
                    String error = messages.getMessagesAsString();
                    //Throw new BusinessServiceException
                    throw new BusinessServiceException(error, context);
                }
    
               

            }
            
            //Exception was not thrown, so create the confirm VO from internal VO
            EdwardsShipToReply confirmVO = new EdwardsShipToReply(f560101AData);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "addCustomerShipTo");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "addCustomerShipTo");
        }
    }
}
