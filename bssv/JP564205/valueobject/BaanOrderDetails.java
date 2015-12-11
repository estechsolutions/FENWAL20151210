package kidde.e1.bssv.JP564205.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BaanOrderDetails extends ValueObject implements Serializable {
    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DOCO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer documentOrderNoInvoiceetc = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String orderStatus = null;
    
    /**
     * Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: QTY <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private BigDecimal quantity = null;

    private Integer linNumber = null;

    private String item = null;
    
    private BigDecimal quantityDelivered = null;
    

    /**
     * TODO: Default public constructor for instantiating: BaanOrderDetails
     */
    public BaanOrderDetails() {
    }

    public void setDocumentOrderNoInvoiceetc(Integer documentOrderNoInvoiceetc) {
        this.documentOrderNoInvoiceetc = documentOrderNoInvoiceetc;
    }

    public Integer getDocumentOrderNoInvoiceetc() {
        return documentOrderNoInvoiceetc;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setLinNumber(Integer linNumber) {
        this.linNumber = linNumber;
    }

    public Integer getLinNumber() {
        return linNumber;
    }

    public void setItem(String item) {
        this.item = item;
}

    public String getItem() {
        return item;
    }

    public void setQuantityDelivered(BigDecimal quantityDelivered) {
        this.quantityDelivered = quantityDelivered;
    }

    public BigDecimal getQuantityDelivered() {
        return quantityDelivered;
    }
}
