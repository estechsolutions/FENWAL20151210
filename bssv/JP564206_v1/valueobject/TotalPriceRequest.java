package kidde.e1.bssv.JP564206.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class TotalPriceRequest extends ValueObject implements Serializable {
    /**
     * Transaction Action
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: TNAC <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String transactionAction = null;

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
    private Integer addressNumber = null;

    /**
     * TODO: Default public constructor for instantiating: TotalPriceRequest
     */
    public TotalPriceRequest() {
    }

    public void setTransactionAction(String transactionAction) {
        this.transactionAction = transactionAction;
    }

    public String getTransactionAction() {
        return transactionAction;
    }

    public void setAddressNumber(Integer addressNumber) {
        this.addressNumber = addressNumber;
    }

    public Integer getAddressNumber() {
        return addressNumber;
    }
}
