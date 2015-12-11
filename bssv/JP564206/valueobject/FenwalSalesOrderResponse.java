package kidde.e1.bssv.JP564206.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import oracle.e1.bssv.J4200010.valueobject.InternalProcessSalesOrder;
import oracle.e1.bssvfoundation.base.MessageValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class FenwalSalesOrderResponse extends MessageValueObject implements Serializable {
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
    private BigDecimal documentOrderNoInvoiceetc = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String orderType = null;

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String orderCompanyOrderNumber = null;

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
    private BigDecimal addressNumber = null;

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
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String businessUnit = null;

    /**
     * Date - Requested
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DRQJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar dateRequested = null;

    /**
     * Date - Order/Transaction
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TRDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar dateOrderTransaction = null;
    
    
    /**
     *  Hold Code form the F4201.HOLD
     */
    private String holdCode = null;
    
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
     * TODO: Default public constructor for instantiating: FenwalSalesOrderReponse
     */
    public FenwalSalesOrderResponse() {
    }

    public FenwalSalesOrderResponse(InternalProcessSalesOrder internalE1VO){
        this.setDocumentOrderNoInvoiceetc(internalE1VO.getMnOrderNo().bigDecimalValue());
        this.setOrderCompanyOrderNumber(internalE1VO.getSzOrderCo());
        this.setBusinessUnit(internalE1VO.getSzBusinessUnit());
        this.setHoldCode(internalE1VO.getSzHoldOrdersCode());
        
    }

    public void setDocumentOrderNoInvoiceetc(BigDecimal documentOrderNoInvoiceetc) {
        this.documentOrderNoInvoiceetc = documentOrderNoInvoiceetc;
    }

    public BigDecimal getDocumentOrderNoInvoiceetc() {
        return documentOrderNoInvoiceetc;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderCompanyOrderNumber(String orderCompanyOrderNumber) {
        this.orderCompanyOrderNumber = orderCompanyOrderNumber;
    }

    public String getOrderCompanyOrderNumber() {
        return orderCompanyOrderNumber;
    }

    public void setAddressNumber(BigDecimal addressNumber) {
        this.addressNumber = addressNumber;
    }

    public BigDecimal getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumberShipTo(BigDecimal addressNumberShipTo) {
        this.addressNumberShipTo = addressNumberShipTo;
    }

    public BigDecimal getAddressNumberShipTo() {
        return addressNumberShipTo;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setDateRequested(Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }

    public Calendar getDateRequested() {
        return dateRequested;
    }

    public void setDateOrderTransaction(Calendar dateOrderTransaction) {
        this.dateOrderTransaction = dateOrderTransaction;
    }

    public Calendar getDateOrderTransaction() {
        return dateOrderTransaction;
    }

    public void setHoldCode(String holdCode) {
        this.holdCode = holdCode;
    }

    public String getHoldCode() {
        return holdCode;
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
