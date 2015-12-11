package kidde.e1.bssv.J5642004.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalF560101AOperations_D5642004A extends ValueObject implements Serializable {
    /**
     * Date From
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTFR <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdDateFrom = null;

    /**
     * Date Thru
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTTO <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdDateThru = null;

    /**
     * Generic String 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: A301 <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String szDateType = null;

    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 01/1 <br>
     */
    private MathNumeric mnAddressNumber = null;

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
    private MathNumeric mnAddressNumberShipTo = null;

    /**
     * Container No
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CONTANO <br>
     * EnterpriseOne field length:  50 <br>
     */
    private String szAccountNumber = null;

    /**
     * Remark - Appraisal
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ARMK <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szBAANShipToNumber = null;

    /**
     * Name
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: NAME <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szName = null;

    /**
     * Address Line 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD1 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String szAddressLine1 = null;

    /**
     * Address Line 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD2 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String szAddressLine2 = null;

    /**
     * Address Line 3
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD3 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String szAddressLine3 = null;

    /**
     * Address Line 4
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD4 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String szAddressLine4 = null;

    /**
     * Address Line 5
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD5 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String szAddressLine5 = null;

    /**
     * Address Line 6
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD6 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String szAddressLine6 = null;

    /**
     * City
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTY1 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szCity = null;

    /**
     * State
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADDS <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 00/S <br>
     */
    private String szState = null;

    /**
     * Postal Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADDZ <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String szZipCodePostal = null;

    /**
     * Country
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTR <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 00/CN <br>
     */
    private String szCountry = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cActiveInactiveFlag = null;

    /**
     * J.D. EnterpriseOne Event Point 02
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV02 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cDefaultYN = null;

    /**
     * J.D. EnterpriseOne Point 03
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV03 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cEverestEventPoint03 = null;

    /**
     * EnterpriseOne Point 04
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV04 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cEverestEventPoint04 = null;

    /**
     * User Reserved Amount
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URAT <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric mnUserReservedAmount = null;

    /**
     * User Reserved Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URCD <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String szUserReservedCode = null;

    /**
     * User Reserved Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URDT <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdUserReservedDate = null;

    /**
     * User Reserved Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ARDU <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdUserReservedDate_2 = null;

    /**
     * User Reserved Numeric 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AURMN1 <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric mnAssignUserReservedNumeri = null;

    /**
     * User Reserved String 05
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AURST5 <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String szAssignUserReservedString = null;

    /**
     * Address Number - 1st
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN81 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnAddressNumber1st = null;

    /**
     * Address Number - 2nd
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN82 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnAddressNumber2nd = null;

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
     * County
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: COUN <br>
     * EnterpriseOne field length:  25 <br>
     * EnterpriseOne User Defined Code: 00/CT <br>
     */
    private String szCountyAddress = null;

    /**
     * Type - Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ANTY <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne User Defined Code: 40/AN <br>
     */
    private String cTypeAddressNumber = null;

    /**
     * Unique Key ID (Internal)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UKID <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnUniqueKeyIDInternal = null;

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
     * Action Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: ACTN <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cActionCode = null;

    public void setJdDateFrom(Date jdDateFrom) {
        this.jdDateFrom = jdDateFrom;
    }

    public Date getJdDateFrom() {
        return jdDateFrom;
    }

    public void setJdDateThru(Date jdDateThru) {
        this.jdDateThru = jdDateThru;
    }

    public Date getJdDateThru() {
        return jdDateThru;
    }

    public void setSzDateType(String szDateType) {
        this.szDateType = szDateType;
    }

    public String getSzDateType() {
        return szDateType;
    }

    public void setMnAddressNumber(MathNumeric mnAddressNumber) {
        this.mnAddressNumber = mnAddressNumber;
    }

    public MathNumeric getMnAddressNumber() {
        return mnAddressNumber;
    }

    public void setMnAddressNumberShipTo(MathNumeric mnAddressNumberShipTo) {
        this.mnAddressNumberShipTo = mnAddressNumberShipTo;
    }

    public MathNumeric getMnAddressNumberShipTo() {
        return mnAddressNumberShipTo;
    }

    public void setSzAccountNumber(String szAccountNumber) {
        this.szAccountNumber = szAccountNumber;
    }

    public String getSzAccountNumber() {
        return szAccountNumber;
    }

    public void setSzBAANShipToNumber(String szBAANShipToNumber) {
        this.szBAANShipToNumber = szBAANShipToNumber;
    }

    public String getSzBAANShipToNumber() {
        return szBAANShipToNumber;
    }

    public void setSzName(String szName) {
        this.szName = szName;
    }

    public String getSzName() {
        return szName;
    }

    public void setSzAddressLine1(String szAddressLine1) {
        this.szAddressLine1 = szAddressLine1;
    }

    public String getSzAddressLine1() {
        return szAddressLine1;
    }

    public void setSzAddressLine2(String szAddressLine2) {
        this.szAddressLine2 = szAddressLine2;
    }

    public String getSzAddressLine2() {
        return szAddressLine2;
    }

    public void setSzAddressLine3(String szAddressLine3) {
        this.szAddressLine3 = szAddressLine3;
    }

    public String getSzAddressLine3() {
        return szAddressLine3;
    }

    public void setSzAddressLine4(String szAddressLine4) {
        this.szAddressLine4 = szAddressLine4;
    }

    public String getSzAddressLine4() {
        return szAddressLine4;
    }

    public void setSzAddressLine5(String szAddressLine5) {
        this.szAddressLine5 = szAddressLine5;
    }

    public String getSzAddressLine5() {
        return szAddressLine5;
    }

    public void setSzAddressLine6(String szAddressLine6) {
        this.szAddressLine6 = szAddressLine6;
    }

    public String getSzAddressLine6() {
        return szAddressLine6;
    }

    public void setSzCity(String szCity) {
        this.szCity = szCity;
    }

    public String getSzCity() {
        return szCity;
    }

    public void setSzState(String szState) {
        this.szState = szState;
    }

    public String getSzState() {
        return szState;
    }

    public void setSzZipCodePostal(String szZipCodePostal) {
        this.szZipCodePostal = szZipCodePostal;
    }

    public String getSzZipCodePostal() {
        return szZipCodePostal;
    }

    public void setSzCountry(String szCountry) {
        this.szCountry = szCountry;
    }

    public String getSzCountry() {
        return szCountry;
    }

    public void setCActiveInactiveFlag(String cActiveInactiveFlag) {
        this.cActiveInactiveFlag = cActiveInactiveFlag;
    }

    public String getCActiveInactiveFlag() {
        return cActiveInactiveFlag;
    }

    public void setCDefaultYN(String cDefaultYN) {
        this.cDefaultYN = cDefaultYN;
    }

    public String getCDefaultYN() {
        return cDefaultYN;
    }

    public void setCEverestEventPoint03(String cEverestEventPoint03) {
        this.cEverestEventPoint03 = cEverestEventPoint03;
    }

    public String getCEverestEventPoint03() {
        return cEverestEventPoint03;
    }

    public void setCEverestEventPoint04(String cEverestEventPoint04) {
        this.cEverestEventPoint04 = cEverestEventPoint04;
    }

    public String getCEverestEventPoint04() {
        return cEverestEventPoint04;
    }

    public void setMnUserReservedAmount(MathNumeric mnUserReservedAmount) {
        this.mnUserReservedAmount = mnUserReservedAmount;
    }

    public MathNumeric getMnUserReservedAmount() {
        return mnUserReservedAmount;
    }

    public void setSzUserReservedCode(String szUserReservedCode) {
        this.szUserReservedCode = szUserReservedCode;
    }

    public String getSzUserReservedCode() {
        return szUserReservedCode;
    }

    public void setJdUserReservedDate(Date jdUserReservedDate) {
        this.jdUserReservedDate = jdUserReservedDate;
    }

    public Date getJdUserReservedDate() {
        return jdUserReservedDate;
    }

    public void setJdUserReservedDate_2(Date jdUserReservedDate_2) {
        this.jdUserReservedDate_2 = jdUserReservedDate_2;
    }

    public Date getJdUserReservedDate_2() {
        return jdUserReservedDate_2;
    }

    public void setMnAssignUserReservedNumeri(MathNumeric mnAssignUserReservedNumeri) {
        this.mnAssignUserReservedNumeri = mnAssignUserReservedNumeri;
    }

    public MathNumeric getMnAssignUserReservedNumeri() {
        return mnAssignUserReservedNumeri;
    }

    public void setSzAssignUserReservedString(String szAssignUserReservedString) {
        this.szAssignUserReservedString = szAssignUserReservedString;
    }

    public String getSzAssignUserReservedString() {
        return szAssignUserReservedString;
    }

    public void setMnAddressNumber1st(MathNumeric mnAddressNumber1st) {
        this.mnAddressNumber1st = mnAddressNumber1st;
    }

    public MathNumeric getMnAddressNumber1st() {
        return mnAddressNumber1st;
    }

    public void setMnAddressNumber2nd(MathNumeric mnAddressNumber2nd) {
        this.mnAddressNumber2nd = mnAddressNumber2nd;
    }

    public MathNumeric getMnAddressNumber2nd() {
        return mnAddressNumber2nd;
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

    public void setSzCompanyKeyOrderNo(String szCompanyKeyOrderNo) {
        this.szCompanyKeyOrderNo = szCompanyKeyOrderNo;
    }

    public String getSzCompanyKeyOrderNo() {
        return szCompanyKeyOrderNo;
    }

    public void setSzCountyAddress(String szCountyAddress) {
        this.szCountyAddress = szCountyAddress;
    }

    public String getSzCountyAddress() {
        return szCountyAddress;
    }

    public void setCTypeAddressNumber(String cTypeAddressNumber) {
        this.cTypeAddressNumber = cTypeAddressNumber;
    }

    public String getCTypeAddressNumber() {
        return cTypeAddressNumber;
    }

    public void setMnUniqueKeyIDInternal(MathNumeric mnUniqueKeyIDInternal) {
        this.mnUniqueKeyIDInternal = mnUniqueKeyIDInternal;
    }

    public MathNumeric getMnUniqueKeyIDInternal() {
        return mnUniqueKeyIDInternal;
    }

    public void setCErrorCode(String cErrorCode) {
        this.cErrorCode = cErrorCode;
    }

    public String getCErrorCode() {
        return cErrorCode;
    }

    public void setCActionCode(String cActionCode) {
        this.cActionCode = cActionCode;
    }

    public String getCActionCode() {
        return cActionCode;
    }
}
