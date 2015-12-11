package kidde.e1.bssv.J5642011.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BaanSalesOrderStatus_D5642045 extends ValueObject implements Serializable {
    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String szCompanyKeyOrderNo = null;

    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DOCO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnDocumentOrderInvoiceE = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/DT <br>
     */
    private String szOrderType = null;

    /**
     * Baan Positoin Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: 56$PONO <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnBaanPositionNumber = null;

    /**
     * Baan Sequence Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: 56$SQNB <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnBaanSequenceNumber = null;

    /**
     * 3rd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szIdentifier3rdItem = null;

    /**
     * Baan Order Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: 56$ORNO <br>
     * EnterpriseOne field length:  8 <br>
     */
    private String szBaanOrderNumber = null;

    /**
     * Baan Delivery Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: 56$DLDT <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdBaanDateDeliveryJulian = null;

    /**
     * Baan Line Status
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: 56$LSTA <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szBaanLineStatus = null;

    /**
     * Baan Order Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: 56$OQUA <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric mnBaanOrderQty = null;

    /**
     * Baan Delivered Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: 56$DQUA <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric mnBaanDeliveredQty = null;

    /**
     * Error Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cErrorCode = null;

    /**
     * Error Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRDGOP <br>
     * EnterpriseOne field length:  100 <br>
     */
    private String szErrorDescription = null;

    public void setSzCompanyKeyOrderNo(String szCompanyKeyOrderNo) {
        this.szCompanyKeyOrderNo = szCompanyKeyOrderNo;
    }

    public String getSzCompanyKeyOrderNo() {
        return szCompanyKeyOrderNo;
    }

    public void setMnDocumentOrderInvoiceE(MathNumeric mnDocumentOrderInvoiceE) {
        this.mnDocumentOrderInvoiceE = mnDocumentOrderInvoiceE;
    }

    public MathNumeric getMnDocumentOrderInvoiceE() {
        return mnDocumentOrderInvoiceE;
    }

    public void setSzOrderType(String szOrderType) {
        this.szOrderType = szOrderType;
    }

    public String getSzOrderType() {
        return szOrderType;
    }

    public void setMnBaanPositionNumber(MathNumeric mnBaanPositionNumber) {
        this.mnBaanPositionNumber = mnBaanPositionNumber;
    }

    public MathNumeric getMnBaanPositionNumber() {
        return mnBaanPositionNumber;
    }

    public void setMnBaanSequenceNumber(MathNumeric mnBaanSequenceNumber) {
        this.mnBaanSequenceNumber = mnBaanSequenceNumber;
    }

    public MathNumeric getMnBaanSequenceNumber() {
        return mnBaanSequenceNumber;
    }

    public void setSzIdentifier3rdItem(String szIdentifier3rdItem) {
        this.szIdentifier3rdItem = szIdentifier3rdItem;
    }

    public String getSzIdentifier3rdItem() {
        return szIdentifier3rdItem;
    }

    public void setSzBaanOrderNumber(String szBaanOrderNumber) {
        this.szBaanOrderNumber = szBaanOrderNumber;
    }

    public String getSzBaanOrderNumber() {
        return szBaanOrderNumber;
    }

    public void setJdBaanDateDeliveryJulian(Date jdBaanDateDeliveryJulian) {
        this.jdBaanDateDeliveryJulian = jdBaanDateDeliveryJulian;
    }

    public Date getJdBaanDateDeliveryJulian() {
        return jdBaanDateDeliveryJulian;
    }

    public void setSzBaanLineStatus(String szBaanLineStatus) {
        this.szBaanLineStatus = szBaanLineStatus;
    }

    public String getSzBaanLineStatus() {
        return szBaanLineStatus;
    }

    public void setMnBaanOrderQty(MathNumeric mnBaanOrderQty) {
        this.mnBaanOrderQty = mnBaanOrderQty;
    }

    public MathNumeric getMnBaanOrderQty() {
        return mnBaanOrderQty;
    }

    public void setMnBaanDeliveredQty(MathNumeric mnBaanDeliveredQty) {
        this.mnBaanDeliveredQty = mnBaanDeliveredQty;
    }

    public MathNumeric getMnBaanDeliveredQty() {
        return mnBaanDeliveredQty;
    }

    public void setCErrorCode(String cErrorCode) {
        this.cErrorCode = cErrorCode;
    }

    public String getCErrorCode() {
        return cErrorCode;
    }

    public void setSzErrorDescription(String szErrorDescription) {
        this.szErrorDescription = szErrorDescription;
    }

    public String getSzErrorDescription() {
        return szErrorDescription;
    }
}
