package kidde.e1.bssv.JP564206.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class TotalPriceResponse extends MessageValueObject implements Serializable {
    /**
     * Quantity Shipped
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SOQS <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private BigDecimal quantityShipped = null;

    /**
     * Item Number - Short
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: ITM <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer itemNumberShort = null;

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
     * Error Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String errorCode = null;

    /**
     * Error Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRDGOP <br>
     * EnterpriseOne field length:  100 <br>
     */
    private String errorDescription = null;
    

    /**
     * TODO: Default public constructor for instantiating: TotalPriceReply
     */
    public TotalPriceResponse() {
        this.setErrorCode("0");
        this.setErrorDescription("Successful Test");
    }

    public void setQuantityShipped(BigDecimal quantityShipped) {
        this.quantityShipped = quantityShipped;
    }

    public BigDecimal getQuantityShipped() {
        return quantityShipped;
    }

    public void setItemNumberShort(Integer itemNumberShort) {
        this.itemNumberShort = itemNumberShort;
    }

    public Integer getItemNumberShort() {
        return itemNumberShort;
    }

    public void setAmountPriceperUnit(BigDecimal amountPriceperUnit) {
        this.amountPriceperUnit = amountPriceperUnit;
    }

    public BigDecimal getAmountPriceperUnit() {
        return amountPriceperUnit;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
}
