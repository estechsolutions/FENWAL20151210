package kidde.e1.bssv.JP564204.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import kidde.e1.bssv.J5642004.valueobject.InternalF560101AOperations_D5642004A;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class EdwardsShipToReply extends MessageValueObject implements Serializable {
    /**
     * Address Number - Ship To
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SHAN <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private BigDecimal addressNumberShipTo = null;

    /**
     * TODO: Default public constructor for instantiating: EdwardsShipToReply
     */
    public EdwardsShipToReply() {
    }
    
    public EdwardsShipToReply(InternalF560101AOperations_D5642004A internalVO){
        this.setAddressNumberShipTo(internalVO.getMnAddressNumberShipTo().bigDecimalValue());
    }

    public void setAddressNumberShipTo(BigDecimal addressNumberShipTo) {
        this.addressNumberShipTo = addressNumberShipTo;
    }

    public BigDecimal getAddressNumberShipTo() {
        return addressNumberShipTo;
    }
}
