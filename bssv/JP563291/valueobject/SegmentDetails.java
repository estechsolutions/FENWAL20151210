package kidde.e1.bssv.JP563291.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SegmentDetails extends MessageValueObject implements Serializable {


    private SegmentAnswers[] answers = null;

    /**
     * Parent (short) Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KIT <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer itemNumberShortKit = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String identifier2ndItem = null;

    /**
     * 3rd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String identifier3rdItem = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String costCenter = null;

    /**
     * Number - Parent Segment Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: PEL <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer parentSegmentNumber = null;

    /**
     * Effective - From Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EFFF <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar effectiveFromDate = null;

    /**
     * Effective - Thru Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EFFT <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar effectiveThruDate = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String descriptionLine1 = null;

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String dataItem = null;

    /**
     * Required or Optional
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATRQ <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: R <br>
     */
    private String requiredToBe = null;

    /**
     * Product Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SY <br>
     * EnterpriseOne field length:  4 <br>
     */
    private String productCode = null;

    /**
     * User Defined Codes
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RT <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String userDefinedCodes = null;

    /**
     * Value for Entry - Default
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DVAL <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String valueForEntryDefault = null;

    /**
     * Allowed Value - Lower
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LVAL <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String lowerAllowedValueDd = null;

    /**
     * Allowed Value - Upper
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UVAL <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String allowedValueUpper = null;

    /**
     * Numeric (Y/N)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CNUM <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: N <br>
     */
    private String numericYN = null;

    /**
     * Data Item Size
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAS <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer dataItemSize = null;

    /**
     * Display Decimals
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CDEC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String dataDisplayDecimals = null;

    /**
     * Configurator Save Segment
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATSA <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     */
    private String saveSegment = null;

    /**
     * Spaces Before Segment Information
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SPBN <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer spacesBeforeSegmentInfor = null;

    /**
     * Configurator Print Segment Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATSN <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     */
    private String printSegmentNumber = null;

    /**
     * Configurator Print Segment Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATSD <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     */
    private String printSegmentDescription = null;

    /**
     * Configurator Print Segment Value
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATSV <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     */
    private String printSegmentValue = null;

    /**
     * Configurator Print Segmt Value Descript
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATVD <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     */
    private String printSegmentValueDesc = null;

    /**
     * Spaces After Segment Information
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SPAN <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer spacesAfterSegmentInform = null;

    /**
     * Return and Start New Line
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RTNL <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     */
    private String returnandStartNewLine = null;

    /**
     * Derived Calculation Round
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RNDC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String derivedCalculationRound = null;

    /**
     * Update Category Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPCC <br>
     * EnterpriseOne field length:  4 <br>
     */
    private String updateCategoryCode = null;

    /**
     * User Reserved Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URCD <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String userReservedCode = null;

    /**
     * User Reserved Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URDT <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar userReservedDate = null;

    /**
     * User Reserved Amount
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URAT <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private BigDecimal userReservedAmount = null;

    /**
     * User Reserved Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URAB <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer userReservedNumber = null;

    /**
     * User Reserved Reference
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URRF <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String userReservedReference = null;

    /**
     * User ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: USER <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String userId = null;

    /**
     * Program ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PID <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String programId = null;

    /**
     * Work Station ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: JOBN <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String workStationId = null;

    /**
     * Date - Updated
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPMJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar dateUpdated = null;

    /**
     * Time of Day
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TDAY <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer timeOfDay = null;

    /**
     * Display Calculated Segment
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSPCALC <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     */
    private String displayCalculatedSegment = null;

    /**
     * TODO: Default public constructor for instantiating: SegmentDetails
     */
    public SegmentDetails() {
    }

    public void setItemNumberShortKit(Integer itemNumberShortKit) {
        this.itemNumberShortKit = itemNumberShortKit;
    }

    public Integer getItemNumberShortKit() {
        return itemNumberShortKit;
    }

    public void setIdentifier2ndItem(String identifier2ndItem) {
        this.identifier2ndItem = identifier2ndItem;
    }

    public String getIdentifier2ndItem() {
        return identifier2ndItem;
    }

    public void setIdentifier3rdItem(String identifier3rdItem) {
        this.identifier3rdItem = identifier3rdItem;
    }

    public String getIdentifier3rdItem() {
        return identifier3rdItem;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setParentSegmentNumber(Integer parentSegmentNumber) {
        this.parentSegmentNumber = parentSegmentNumber;
    }

    public Integer getParentSegmentNumber() {
        return parentSegmentNumber;
    }

    public void setEffectiveFromDate(Calendar effectiveFromDate) {
        this.effectiveFromDate = effectiveFromDate;
    }

    public Calendar getEffectiveFromDate() {
        return effectiveFromDate;
    }

    public void setEffectiveThruDate(Calendar effectiveThruDate) {
        this.effectiveThruDate = effectiveThruDate;
    }

    public Calendar getEffectiveThruDate() {
        return effectiveThruDate;
    }

    public void setDescriptionLine1(String descriptionLine1) {
        this.descriptionLine1 = descriptionLine1;
    }

    public String getDescriptionLine1() {
        return descriptionLine1;
    }

    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    public String getDataItem() {
        return dataItem;
    }

    public void setRequiredToBe(String requiredToBe) {
        this.requiredToBe = requiredToBe;
    }

    public String getRequiredToBe() {
        return requiredToBe;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setUserDefinedCodes(String userDefinedCodes) {
        this.userDefinedCodes = userDefinedCodes;
    }

    public String getUserDefinedCodes() {
        return userDefinedCodes;
    }

    public void setValueForEntryDefault(String valueForEntryDefault) {
        this.valueForEntryDefault = valueForEntryDefault;
    }

    public String getValueForEntryDefault() {
        return valueForEntryDefault;
    }

    public void setLowerAllowedValueDd(String lowerAllowedValueDd) {
        this.lowerAllowedValueDd = lowerAllowedValueDd;
    }

    public String getLowerAllowedValueDd() {
        return lowerAllowedValueDd;
    }

    public void setAllowedValueUpper(String allowedValueUpper) {
        this.allowedValueUpper = allowedValueUpper;
    }

    public String getAllowedValueUpper() {
        return allowedValueUpper;
    }

    public void setNumericYN(String numericYN) {
        this.numericYN = numericYN;
    }

    public String getNumericYN() {
        return numericYN;
    }

    public void setDataItemSize(Integer dataItemSize) {
        this.dataItemSize = dataItemSize;
    }

    public Integer getDataItemSize() {
        return dataItemSize;
    }

    public void setDataDisplayDecimals(String dataDisplayDecimals) {
        this.dataDisplayDecimals = dataDisplayDecimals;
    }

    public String getDataDisplayDecimals() {
        return dataDisplayDecimals;
    }

    public void setSaveSegment(String saveSegment) {
        this.saveSegment = saveSegment;
    }

    public String getSaveSegment() {
        return saveSegment;
    }

    public void setSpacesBeforeSegmentInfor(Integer spacesBeforeSegmentInfor) {
        this.spacesBeforeSegmentInfor = spacesBeforeSegmentInfor;
    }

    public Integer getSpacesBeforeSegmentInfor() {
        return spacesBeforeSegmentInfor;
    }

    public void setPrintSegmentNumber(String printSegmentNumber) {
        this.printSegmentNumber = printSegmentNumber;
    }

    public String getPrintSegmentNumber() {
        return printSegmentNumber;
    }

    public void setPrintSegmentDescription(String printSegmentDescription) {
        this.printSegmentDescription = printSegmentDescription;
    }

    public String getPrintSegmentDescription() {
        return printSegmentDescription;
    }

    public void setPrintSegmentValue(String printSegmentValue) {
        this.printSegmentValue = printSegmentValue;
    }

    public String getPrintSegmentValue() {
        return printSegmentValue;
    }

    public void setPrintSegmentValueDesc(String printSegmentValueDesc) {
        this.printSegmentValueDesc = printSegmentValueDesc;
    }

    public String getPrintSegmentValueDesc() {
        return printSegmentValueDesc;
    }

    public void setSpacesAfterSegmentInform(Integer spacesAfterSegmentInform) {
        this.spacesAfterSegmentInform = spacesAfterSegmentInform;
    }

    public Integer getSpacesAfterSegmentInform() {
        return spacesAfterSegmentInform;
    }

    public void setReturnandStartNewLine(String returnandStartNewLine) {
        this.returnandStartNewLine = returnandStartNewLine;
    }

    public String getReturnandStartNewLine() {
        return returnandStartNewLine;
    }

    public void setDerivedCalculationRound(String derivedCalculationRound) {
        this.derivedCalculationRound = derivedCalculationRound;
    }

    public String getDerivedCalculationRound() {
        return derivedCalculationRound;
    }

    public void setUpdateCategoryCode(String updateCategoryCode) {
        this.updateCategoryCode = updateCategoryCode;
    }

    public String getUpdateCategoryCode() {
        return updateCategoryCode;
    }

    public void setUserReservedCode(String userReservedCode) {
        this.userReservedCode = userReservedCode;
    }

    public String getUserReservedCode() {
        return userReservedCode;
    }

    public void setUserReservedDate(Calendar userReservedDate) {
        this.userReservedDate = userReservedDate;
    }

    public Calendar getUserReservedDate() {
        return userReservedDate;
    }

    public void setUserReservedAmount(BigDecimal userReservedAmount) {
        this.userReservedAmount = userReservedAmount;
    }

    public BigDecimal getUserReservedAmount() {
        return userReservedAmount;
    }

    public void setUserReservedNumber(Integer userReservedNumber) {
        this.userReservedNumber = userReservedNumber;
    }

    public Integer getUserReservedNumber() {
        return userReservedNumber;
    }

    public void setUserReservedReference(String userReservedReference) {
        this.userReservedReference = userReservedReference;
    }

    public String getUserReservedReference() {
        return userReservedReference;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setWorkStationId(String workStationId) {
        this.workStationId = workStationId;
    }

    public String getWorkStationId() {
        return workStationId;
    }

    public void setDateUpdated(Calendar dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Calendar getDateUpdated() {
        return dateUpdated;
    }

    public void setTimeOfDay(Integer timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public Integer getTimeOfDay() {
        return timeOfDay;
    }

    public void setDisplayCalculatedSegment(String displayCalculatedSegment) {
        this.displayCalculatedSegment = displayCalculatedSegment;
    }

    public String getDisplayCalculatedSegment() {
        return displayCalculatedSegment;
    }

    public void setAnswers(SegmentAnswers[] answers) {
        this.answers = answers;
    }

    public SegmentAnswers[] getAnswers() {
        return answers;
    }
}
