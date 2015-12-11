package kidde.e1.bssv.J5632002.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InsertConfigurationAnswers_D5632002B extends ValueObject implements Serializable {
    /**
     * Unique Key ID (Internal)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: UKID <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnUniqueKeyIDInternal = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szIdentifier2ndItem = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String szCostCenter = null;

    /**
     * Number - Parent Segment Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: PEL <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnParentSegmentNumber = null;

    /**
     * Segment Value
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: SGVL <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String szSegmentValue = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
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

    public void setMnUniqueKeyIDInternal(MathNumeric mnUniqueKeyIDInternal) {
        this.mnUniqueKeyIDInternal = mnUniqueKeyIDInternal;
    }

    public MathNumeric getMnUniqueKeyIDInternal() {
        return mnUniqueKeyIDInternal;
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

    public void setMnParentSegmentNumber(MathNumeric mnParentSegmentNumber) {
        this.mnParentSegmentNumber = mnParentSegmentNumber;
    }

    public MathNumeric getMnParentSegmentNumber() {
        return mnParentSegmentNumber;
    }

    public void setSzSegmentValue(String szSegmentValue) {
        this.szSegmentValue = szSegmentValue;
    }

    public String getSzSegmentValue() {
        return szSegmentValue;
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
