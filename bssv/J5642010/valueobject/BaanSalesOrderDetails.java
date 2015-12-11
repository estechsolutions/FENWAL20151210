package kidde.e1.bssv.J5642010.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BaanSalesOrderDetails extends ValueObject implements Serializable {
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
    private MathNumeric mnDocumentorderinvoicee = null;

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
    private String szOrdertype = null;

    /**
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private MathNumeric mnLinenumber = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szIdentifier2nditem = null;

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String szCompanykeyorderno = null;
    
    
    private MathNumeric mnQuantity = null;
    
    private MathNumeric mnBaanStatus = null;
    
    private MathNumeric mnDeliveredQuantity = null;
    
    private String baanOrderNumber = null;
    
    private MathNumeric mnBaanSequence =null;
    
    

    public void setMnDocumentorderinvoicee(MathNumeric mnDocumentorderinvoicee) {
        this.mnDocumentorderinvoicee = mnDocumentorderinvoicee;
    }

    public MathNumeric getMnDocumentorderinvoicee() {
        return mnDocumentorderinvoicee;
    }

    public void setSzOrdertype(String szOrdertype) {
        this.szOrdertype = szOrdertype;
    }

    public String getSzOrdertype() {
        return szOrdertype;
    }

    public void setMnLinenumber(MathNumeric mnLinenumber) {
        this.mnLinenumber = mnLinenumber;
    }

    public MathNumeric getMnLinenumber() {
        return mnLinenumber;
    }

    public void setSzIdentifier2nditem(String szIdentifier2nditem) {
        this.szIdentifier2nditem = szIdentifier2nditem;
    }

    public String getSzIdentifier2nditem() {
        return szIdentifier2nditem;
    }

    public void setSzCompanykeyorderno(String szCompanykeyorderno) {
        this.szCompanykeyorderno = szCompanykeyorderno;
    }

    public String getSzCompanykeyorderno() {
        return szCompanykeyorderno;
    }

    public void setMnQuantity(MathNumeric mnQuantity) {
        this.mnQuantity = mnQuantity;
    }

    public MathNumeric getMnQuantity() {
        return mnQuantity;
    }

    public void setMnBaanStatus(MathNumeric mnBaanStatus) {
        this.mnBaanStatus = mnBaanStatus;
    }

    public MathNumeric getMnBaanStatus() {
        return mnBaanStatus;
    }

    public void setMnDeliveredQuantity(MathNumeric mnDeliveredQuantity) {
        this.mnDeliveredQuantity = mnDeliveredQuantity;
    }

    public MathNumeric getMnDeliveredQuantity() {
        return mnDeliveredQuantity;
    }

    public void setBaanOrderNumber(String baanOrderNumber) {
        this.baanOrderNumber = baanOrderNumber;
    }

    public String getBaanOrderNumber() {
        return baanOrderNumber;
    }

    public void setMnBaanSequence(MathNumeric mnBaanSequence) {
        this.mnBaanSequence = mnBaanSequence;
    }

    public MathNumeric getMnBaanSequence() {
        return mnBaanSequence;
    }
}
