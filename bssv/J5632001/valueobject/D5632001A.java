package kidde.e1.bssv.J5632001.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class D5632001A extends ValueObject implements Serializable {
    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String szCostCenter_MCU = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szIdentifier2ndItem_LITM = null;

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
    private MathNumeric mnParentSegmentNumber_PEL = null;

    /**
     * Segment Value
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: SGVL <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String szPreviousQuestionAnswer_SGVL = null;

    /**
     * Version Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DESC2000 <br>
     * EnterpriseOne field length:  2000 <br>
     */
    private String szSegmentValues_DESC2000 = null;

    /**
     * Value for Entry - Default
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DVAL <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String szValueDefault_DVAL = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cErrorFlag_EV01 = null;

    /**
     * Required or Optional
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATRQ <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: R <br>
     * EnterpriseOne User Defined Code: 32/AR <br>
     */
    private String cRequiredToBe = null;

    /**
     * Numeric (Y/N)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CNUM <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: N <br>
     * EnterpriseOne User Defined Code: 00/AA <br>
     */
    private String cNumericYN = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cTypeOfValue = null;

    public void setSzCostCenter_MCU(String szCostCenter_MCU) {
        this.szCostCenter_MCU = szCostCenter_MCU;
    }

    public String getSzCostCenter_MCU() {
        return szCostCenter_MCU;
    }

    public void setSzIdentifier2ndItem_LITM(String szIdentifier2ndItem_LITM) {
        this.szIdentifier2ndItem_LITM = szIdentifier2ndItem_LITM;
    }

    public String getSzIdentifier2ndItem_LITM() {
        return szIdentifier2ndItem_LITM;
    }

    public void setMnParentSegmentNumber_PEL(MathNumeric mnParentSegmentNumber_PEL) {
        this.mnParentSegmentNumber_PEL = mnParentSegmentNumber_PEL;
    }

    public MathNumeric getMnParentSegmentNumber_PEL() {
        return mnParentSegmentNumber_PEL;
    }

    public void setSzPreviousQuestionAnswer_SGVL(String szPreviousQuestionAnswer_SGVL) {
        this.szPreviousQuestionAnswer_SGVL = szPreviousQuestionAnswer_SGVL;
    }

    public String getSzPreviousQuestionAnswer_SGVL() {
        return szPreviousQuestionAnswer_SGVL;
    }

    public void setSzSegmentValues_DESC2000(String szSegmentValues_DESC2000) {
        this.szSegmentValues_DESC2000 = szSegmentValues_DESC2000;
    }

    public String getSzSegmentValues_DESC2000() {
        return szSegmentValues_DESC2000;
    }

    public void setSzValueDefault_DVAL(String szValueDefault_DVAL) {
        this.szValueDefault_DVAL = szValueDefault_DVAL;
    }

    public String getSzValueDefault_DVAL() {
        return szValueDefault_DVAL;
    }

    public void setCErrorFlag_EV01(String cErrorFlag_EV01) {
        this.cErrorFlag_EV01 = cErrorFlag_EV01;
    }

    public String getCErrorFlag_EV01() {
        return cErrorFlag_EV01;
    }

    public void setCRequiredToBe(String cRequiredToBe) {
        this.cRequiredToBe = cRequiredToBe;
    }

    public String getCRequiredToBe() {
        return cRequiredToBe;
    }

    public void setCNumericYN(String cNumericYN) {
        this.cNumericYN = cNumericYN;
    }

    public String getCNumericYN() {
        return cNumericYN;
    }

    public void setCTypeOfValue(String cTypeOfValue) {
        this.cTypeOfValue = cTypeOfValue;
    }

    public String getCTypeOfValue() {
        return cTypeOfValue;
    }
}
