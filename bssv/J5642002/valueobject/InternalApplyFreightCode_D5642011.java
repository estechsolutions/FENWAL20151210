package kidde.e1.bssv.J5642002.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalApplyFreightCode_D5642011 extends ValueObject implements Serializable {
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
     * Document Company
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KCO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String szCompanyKey = null;

    /**
     * Apply Freight - Y/N
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: AFT <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: Y <br>
     * EnterpriseOne Edit Rule:VALUE <br>
     */
    private String cApplyFreightYN = null;

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

    public void setSzCompanyKey(String szCompanyKey) {
        this.szCompanyKey = szCompanyKey;
    }

    public String getSzCompanyKey() {
        return szCompanyKey;
    }

    public void setCApplyFreightYN(String cApplyFreightYN) {
        this.cApplyFreightYN = cApplyFreightYN;
    }

    public String getCApplyFreightYN() {
        return cApplyFreightYN;
    }

    public void setCErrorCode(String cErrorCode) {
        this.cErrorCode = cErrorCode;
    }

    public String getCErrorCode() {
        return cErrorCode;
    }
}
