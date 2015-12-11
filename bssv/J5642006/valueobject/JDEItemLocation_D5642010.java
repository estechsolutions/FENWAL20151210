package kidde.e1.bssv.J5642006.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class JDEItemLocation_D5642010 extends ValueObject implements Serializable {
    /**
     * Item Number - Short
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ITM <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnIdentifierShortItem = null;

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
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szIdentifier2ndItem = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String szCostCenter = null;

    /**
     * Location
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LOCN <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String szLocation = null;

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
     * EnterpriseOne Alias: ERRDSCA <br>
     * EnterpriseOne field length:  60 <br>
     */
    private String szErrorDescription = null;

    public void setMnIdentifierShortItem(MathNumeric mnIdentifierShortItem) {
        this.mnIdentifierShortItem = mnIdentifierShortItem;
    }

    public MathNumeric getMnIdentifierShortItem() {
        return mnIdentifierShortItem;
    }

    public void setSzIdentifier3rdItem(String szIdentifier3rdItem) {
        this.szIdentifier3rdItem = szIdentifier3rdItem;
    }

    public String getSzIdentifier3rdItem() {
        return szIdentifier3rdItem;
    }

    public void setSzIdentifier2ndItem(String szIdentifier2ndItem) {
        this.szIdentifier2ndItem = szIdentifier2ndItem;
    }

    public String getSzIdentifier2ndItem() {
        return szIdentifier2ndItem;
    }

    public void setSzCostCenter(String szCostCenter) {
        this.szCostCenter = szCostCenter;
    }

    public String getSzCostCenter() {
        return szCostCenter;
    }

    public void setSzLocation(String szLocation) {
        this.szLocation = szLocation;
    }

    public String getSzLocation() {
        return szLocation;
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
