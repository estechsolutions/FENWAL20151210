package kidde.e1.bssv.J5642009.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ComminssionUpdate_D5642009A extends ValueObject implements Serializable {
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
    private MathNumeric mnDocumentOrderInvoiceE = null;

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String szCompanyKeyOrderNo = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/DT <br>
     */
    private String szOrderType = null;

    /**
     * Alpha Spec. Data 10
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AA10 <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szCommissionCode = null;

    /**
     * Salesperson Commission 001
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SLCM <br>
     * EnterpriseOne field length:  7 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private MathNumeric mnCommissionPercentage = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cReplaceOrAdd = null;

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

    public void setMnDocumentOrderInvoiceE(MathNumeric mnDocumentOrderInvoiceE) {
        this.mnDocumentOrderInvoiceE = mnDocumentOrderInvoiceE;
    }

    public MathNumeric getMnDocumentOrderInvoiceE() {
        return mnDocumentOrderInvoiceE;
    }

    public void setSzCompanyKeyOrderNo(String szCompanyKeyOrderNo) {
        this.szCompanyKeyOrderNo = szCompanyKeyOrderNo;
    }

    public String getSzCompanyKeyOrderNo() {
        return szCompanyKeyOrderNo;
    }

    public void setSzOrderType(String szOrderType) {
        this.szOrderType = szOrderType;
    }

    public String getSzOrderType() {
        return szOrderType;
    }

    public void setSzCommissionCode(String szCommissionCode) {
        this.szCommissionCode = szCommissionCode;
    }

    public String getSzCommissionCode() {
        return szCommissionCode;
    }

    public void setMnCommissionPercentage(MathNumeric mnCommissionPercentage) {
        this.mnCommissionPercentage = mnCommissionPercentage;
    }

    public MathNumeric getMnCommissionPercentage() {
        return mnCommissionPercentage;
    }

    public void setCReplaceOrAdd(String cReplaceOrAdd) {
        this.cReplaceOrAdd = cReplaceOrAdd;
    }

    public String getCReplaceOrAdd() {
        return cReplaceOrAdd;
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
