package kidde.e1.bssv.JP563291.valueobject;

import java.io.Serializable;

import kidde.e1.bssv.J56F3291.valueobject.InternalGetWhereFields_F3291;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSSVDataFormatterException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SegmentDataRequest extends ValueObject implements Serializable {
    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String item = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String costCenter = null;
    
    
    /**
     * Number - Parent Segment Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: PEL <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer segmentNumber = null;  
    
    
    /**
     * String - Parent Segment Answer
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  50 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private String segmentAnswer = null;
    
    /**
     * Unique Key ID 
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UKID <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer uniqueKeyID = null;    

    /**
     * TODO: Default public constructor for instantiating: SegmentDataRequest
     */
    public SegmentDataRequest() {
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getCostCenter() {
        return costCenter;
    }
    
    public void setSegmentNumber(Integer segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    public Integer getSegmentNumber() {
        return segmentNumber;
    }

    public void setSegmentAnswer(String segmentAnswer) {
        this.segmentAnswer = segmentAnswer;
    }

    public String getSegmentAnswer() {
        return segmentAnswer;
    }  
    
    public void setUniqueKeyID(Integer uniqueKeyID) {
        this.uniqueKeyID = uniqueKeyID;
    }

    public Integer getUniqueKeyID() {
        return uniqueKeyID;
    }    
    
    public E1MessageList mapFromPublishedToWhereF3291 (IContext context, IConnection connection, InternalGetWhereFields_F3291 queryWhereVO){
               E1MessageList messageList = new E1MessageList();

               queryWhereVO.setF3291_LITM(this.getItem());
               
               /* Format the E1 Business Unit MCU length 12 pad left with spaces */
               E1Message formatMsg = null;
               String formattedBusinessUnit = null;
               if (this.getCostCenter() != null){
                   try {
                       formattedBusinessUnit = context.getBSSVDataFormatter().format(this.getCostCenter(), "MCU");
                   }catch (BSSVDataFormatterException e) {
                       context.getBSSVLogger().app(context, "Error formatting the E1 Business Unit", null, this, e);
                       formatMsg = new E1Message(context, "002FIS", this.getCostCenter());
                       formatMsg.setMessagePrefix("SeqmentDataRequest.mapFromPublished");
                       messageList.addMessage(formatMsg);
                   }
               }
               
               queryWhereVO.setF3291_MCU(formattedBusinessUnit);
               return messageList;
           }

}
