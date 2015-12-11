package kidde.e1.bssv.J564701.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalPriceCheck_D564074A extends ValueObject implements Serializable {
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
     * Quantity - From
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MNQ <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric mnQuantityMinimum = null;

    /**
     * Date - Price Effective Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PEFJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdPriceEffectiveDate = null;

    /**
     * Price and Adjustment Schedule
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ASN <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne User Defined Code: 40/AS <br>
     */
    private String szAdjustmentSchedule = null;

    /**
     * Unit of Measure - Pricing
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UOM4 <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/UM <br>
     */
    private String szUnitOfMeasurePricing = null;

    /**
     * Currency Conversion Rate - Spot Rate
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CRR <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 7 <br>
     */
    private MathNumeric mnExchangeRate = null;

    /**
     * Currency Mode-Foreign or Domestic Entry
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CRRM <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: F <br>
     * EnterpriseOne User Defined Code: H00/CY <br>
     */
    private String cCurrencyMode = null;

    /**
     * Amount - Price per Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPRC <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric mnAmtPricePerUnit2 = null;
    
    private String szP4074Version = null;

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

    public void setMnQuantityMinimum(MathNumeric mnQuantityMinimum) {
        this.mnQuantityMinimum = mnQuantityMinimum;
    }

    public MathNumeric getMnQuantityMinimum() {
        return mnQuantityMinimum;
    }

    public void setJdPriceEffectiveDate(Date jdPriceEffectiveDate) {
        this.jdPriceEffectiveDate = jdPriceEffectiveDate;
    }

    public Date getJdPriceEffectiveDate() {
        return jdPriceEffectiveDate;
    }

    public void setSzAdjustmentSchedule(String szAdjustmentSchedule) {
        this.szAdjustmentSchedule = szAdjustmentSchedule;
    }

    public String getSzAdjustmentSchedule() {
        return szAdjustmentSchedule;
    }

    public void setSzUnitOfMeasurePricing(String szUnitOfMeasurePricing) {
        this.szUnitOfMeasurePricing = szUnitOfMeasurePricing;
    }

    public String getSzUnitOfMeasurePricing() {
        return szUnitOfMeasurePricing;
    }

    public void setMnExchangeRate(MathNumeric mnExchangeRate) {
        this.mnExchangeRate = mnExchangeRate;
    }

    public MathNumeric getMnExchangeRate() {
        return mnExchangeRate;
    }

    public void setCCurrencyMode(String cCurrencyMode) {
        this.cCurrencyMode = cCurrencyMode;
    }

    public String getCCurrencyMode() {
        return cCurrencyMode;
    }

    public void setMnAmtPricePerUnit2(MathNumeric mnAmtPricePerUnit2) {
        this.mnAmtPricePerUnit2 = mnAmtPricePerUnit2;
    }

    public MathNumeric getMnAmtPricePerUnit2() {
        return mnAmtPricePerUnit2;
    }

    public void setSzP4074Version(String szP4074Version) {
        this.szP4074Version = szP4074Version;
    }

    public String getSzP4074Version() {
        return szP4074Version;
    }
}
