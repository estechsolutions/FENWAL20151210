package kidde.e1.bssv.JPM0101.valueobject;

import java.io.Serializable;

import kidde.e1.bssv.JM0101.valueobject.Internal_ABGT_MediaObject;

import kidde.e1.bssv.JM0101.valueobject.MOItem_Internal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ABGTRequest extends ValueObject implements Serializable {
    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer customerAddressNumber = null;

    /**
     * TODO: Default public constructor for instantiating: ABGTRequest
     */
    public ABGTRequest() {
    }

    public void setCustomerAddressNumber(Integer customerAddressNumber) {
        this.customerAddressNumber = customerAddressNumber;
    }

    public Integer getCustomerAddressNumber() {
        return customerAddressNumber;
    }
    
    public E1MessageList mapToInternal(Internal_ABGT_MediaObject internalMO){
        E1MessageList messages = new E1MessageList();

        //Create the internal MOItem and populate with values
        MOItem_Internal[] moItems = new MOItem_Internal[1];
        MOItem_Internal internalMOItem = new MOItem_Internal();
        internalMOItem.setMoSeqNo(1);
        internalMOItem.setSzItemName("Text1");
        internalMOItem.setSzMoType("TEXT");
        moItems[0] = internalMOItem; 
        internalMO.setMoItems(moItems);
        
        internalMO.setMnAddressNumber(new MathNumeric(this.getCustomerAddressNumber()));
        
        return messages;
    }
}
