package kidde.e1.bssv.JP564704.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import kidde.e1.bssv.J564701.valueobject.InternalPriceCheck_D564074A;

import oracle.e1.bssvfoundation.base.MessageValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class PriceCheckResponse extends MessageValueObject implements Serializable {
    /**
     * Amount - Price per Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPRC <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private BigDecimal amountPriceperUnit = null;

    /**
     * TODO: Default public constructor for instantiating: PriceCheckResponse
     */
    public PriceCheckResponse() {
    }
    
    public PriceCheckResponse(InternalPriceCheck_D564074A internalVO){
        this.setAmountPriceperUnit(internalVO.getMnAmtPricePerUnit2().asBigDecimal());
    }

    public void setAmountPriceperUnit(BigDecimal amountPriceperUnit) {
        this.amountPriceperUnit = amountPriceperUnit;
    }

    public BigDecimal getAmountPriceperUnit() {
        return amountPriceperUnit;
    }
}
