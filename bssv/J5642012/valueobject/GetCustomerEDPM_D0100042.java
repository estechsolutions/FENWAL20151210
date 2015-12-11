package kidde.e1.bssv.J5642012.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetCustomerEDPM_D0100042 extends ValueObject implements Serializable {
    /**
     * Action Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ACTN <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cActionCode = null;

    /**
     * Suppress Error Message
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SUPPS <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cSuppressErrorMessage = null;

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szErrorMessageID = null;

    /**
     * Company
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String szCompany = null;

    /**
     * Batch Processing Mode
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EDPM <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: I <br>
     * EnterpriseOne User Defined Code: H40/EE <br>
     */
    private String cBatchProcessingMode = null;

    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 01/1 <br>
     */
    private MathNumeric mnCustomerNumber = null;

    public void setCActionCode(String cActionCode) {
        this.cActionCode = cActionCode;
    }

    public String getCActionCode() {
        return cActionCode;
    }

    public void setCSuppressErrorMessage(String cSuppressErrorMessage) {
        this.cSuppressErrorMessage = cSuppressErrorMessage;
    }

    public String getCSuppressErrorMessage() {
        return cSuppressErrorMessage;
    }

    public void setSzErrorMessageID(String szErrorMessageID) {
        this.szErrorMessageID = szErrorMessageID;
    }

    public String getSzErrorMessageID() {
        return szErrorMessageID;
    }

    public void setSzCompany(String szCompany) {
        this.szCompany = szCompany;
    }

    public String getSzCompany() {
        return szCompany;
    }

    public void setCBatchProcessingMode(String cBatchProcessingMode) {
        this.cBatchProcessingMode = cBatchProcessingMode;
    }

    public String getCBatchProcessingMode() {
        return cBatchProcessingMode;
    }

    public void setMnCustomerNumber(MathNumeric mnCustomerNumber) {
        this.mnCustomerNumber = mnCustomerNumber;
    }

    public MathNumeric getMnCustomerNumber() {
        return mnCustomerNumber;
    }
}
