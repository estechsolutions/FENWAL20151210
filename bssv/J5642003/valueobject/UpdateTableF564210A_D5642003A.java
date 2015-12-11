package kidde.e1.bssv.J5642003.valueobject;

import java.io.Serializable;

import java.util.Date;

import kidde.e1.bssv.JP564200.valueobject.ProcessSalesOrderKidde;

import kidde.e1.bssv.JP564206.valueobject.FenwalSalesOrderRequest;

import oracle.e1.bssv.J4200010.valueobject.InternalProcessSalesOrder;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class UpdateTableF564210A_D5642003A extends ValueObject implements Serializable {
    /**
     * Transaction Action
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: TNAC <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/TA <br>
     */
    private String szTransactionAction = null;

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String szCompanyKeyOrderNo = null;

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
     * Name - Remark
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RMK <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szNameRemark = null;

    /**
     * Name - Remark
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RMK2 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szNameRemarksLine2 = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szDescription001 = null;

    /**
     * Date - Expired
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EXDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdDateExpiredJulian1 = null;

    /**
     * Date - Effective
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EFTJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdDateEffectiveJulian1 = null;

    /**
     * Description 02
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL02 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szDescription01002 = null;

    /**
     * Description 03
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL03 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szDescription01003 = null;

    /**
     * Farm Address Book Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8FARM <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 01/1 <br>
     */
    private MathNumeric mnFarmNumber = null;

    /**
     * Address Number1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8GCA1 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 01/1 <br>
     */
    private MathNumeric mnAddressNumber1 = null;

    /**
     * Call Plan Ask
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CPASK <br>
     * EnterpriseOne field length:  1000 <br>
     */
    private String szask = null;

    /**
     * Call Plan Attitude
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CPATTD <br>
     * EnterpriseOne field length:  1000 <br>
     */
    private String szattitude = null;

    /**
     * User ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: USER <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szUserId = null;

    /**
     * Date - Updated
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPMJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdDateUpdated = null;

    /**
     * Time - Last Updated
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPMT <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnTimeLastUpdated = null;

    /**
     * Program ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PID <br>
     * EnterpriseOne field length:  10 <br>
     * EnterpriseOne Edit Rule:CHKOBJ <br>
     */
    private String szProgramId = null;

    /**
     * Work Station ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: JOBN <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szWorkStationId = null;

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
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szErrorMessage = null;

    /**
     * TODO: Default public constructor for instantiating: UpdateTableF564210A_D5642003A
     */    
    
    public UpdateTableF564210A_D5642003A(){
    }
    
    public E1MessageList mapToUpdateTableF654210A_D5642003A(InternalProcessSalesOrder internalE1VO,ProcessSalesOrderKidde vo){
        E1MessageList messages = new E1MessageList();
        this.setSzTransactionAction("A");
        this.setMnDocumentOrderInvoiceE(internalE1VO.getMnOrderNo());
        this.setSzCompanyKeyOrderNo(internalE1VO.getSzOrderCo());
        this.setSzOrderType(internalE1VO.getSzOrderType());
        if (vo.getKiddeSalesOrder().getEdwardsShipTo()!=null){
            this.setMnAddressNumber(new MathNumeric(vo.getKiddeSalesOrder().getEdwardsShipTo()));
        }else{
            this.setMnAddressNumber(new MathNumeric(0));
        }
        this.setSzNameRemarksLine2(vo.getKiddeSalesOrder().getSpecificationDiscountCode());
        this.setSzNameRemark(vo.getKiddeSalesOrder().getCompetitiveDiscountCode());
        this.setSzDescription001(vo.getKiddeSalesOrder().getPromotionCode());
        this.setSzask(vo.getKiddeSalesOrder().getHeaderText());
        this.setSzattitude(vo.getKiddeSalesOrder().getFooterText());
        
        
        return messages;
    }
    



    public E1MessageList mapToUpdateTableF654210A_D5642003A(InternalProcessSalesOrder internalE1VO,FenwalSalesOrderRequest vo){
        E1MessageList messages = new E1MessageList();
        this.setSzTransactionAction("A");
        this.setMnDocumentOrderInvoiceE(internalE1VO.getMnOrderNo());
        this.setSzCompanyKeyOrderNo(internalE1VO.getSzOrderCo());
        this.setSzOrderType(internalE1VO.getSzOrderType());
        if (vo.getFenwalSOData().getEdwardsShipTo()!=null){
            this.setMnAddressNumber(new MathNumeric(vo.getFenwalSOData().getEdwardsShipTo()));
        }else{
            this.setMnAddressNumber(new MathNumeric(0));
        }
        this.setSzNameRemarksLine2(vo.getFenwalSOData().getSpecificationDiscountCode());
        this.setSzNameRemark(vo.getFenwalSOData().getCompetitiveDiscountCode());
        int maxLen = 998;
        int len = vo.getFenwalSOData().getHeaderText().length();
        try{
            if (len < maxLen){
                this.setSzask(vo.getFenwalSOData().getHeaderText().substring(0,len-1));
            }else{
                this.setSzask(vo.getFenwalSOData().getHeaderText().substring(0,998));
            }
        }catch(Exception exp){
            System.out.println(exp.getLocalizedMessage());
        }
        this.setSzattitude(vo.getFenwalSOData().getFooterText());
        
        
        return messages;
    }
    






    public void setSzTransactionAction(String szTransactionAction) {
        this.szTransactionAction = szTransactionAction;
    }

    public String getSzTransactionAction() {
        return szTransactionAction;
    }

    public void setSzCompanyKeyOrderNo(String szCompanyKeyOrderNo) {
        this.szCompanyKeyOrderNo = szCompanyKeyOrderNo;
    }

    public String getSzCompanyKeyOrderNo() {
        return szCompanyKeyOrderNo;
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

    public void setMnAddressNumber(MathNumeric mnAddressNumber) {
        this.mnAddressNumber = mnAddressNumber;
    }

    public MathNumeric getMnAddressNumber() {
        return mnAddressNumber;
    }

    public void setSzNameRemark(String szNameRemark) {
        this.szNameRemark = szNameRemark;
    }

    public String getSzNameRemark() {
        return szNameRemark;
    }

    public void setSzNameRemarksLine2(String szNameRemarksLine2) {
        this.szNameRemarksLine2 = szNameRemarksLine2;
    }

    public String getSzNameRemarksLine2() {
        return szNameRemarksLine2;
    }

    public void setSzDescription001(String szDescription001) {
        this.szDescription001 = szDescription001;
    }

    public String getSzDescription001() {
        return szDescription001;
    }

    public void setJdDateExpiredJulian1(Date jdDateExpiredJulian1) {
        this.jdDateExpiredJulian1 = jdDateExpiredJulian1;
    }

    public Date getJdDateExpiredJulian1() {
        return jdDateExpiredJulian1;
    }

    public void setJdDateEffectiveJulian1(Date jdDateEffectiveJulian1) {
        this.jdDateEffectiveJulian1 = jdDateEffectiveJulian1;
    }

    public Date getJdDateEffectiveJulian1() {
        return jdDateEffectiveJulian1;
    }

    public void setSzDescription01002(String szDescription01002) {
        this.szDescription01002 = szDescription01002;
    }

    public String getSzDescription01002() {
        return szDescription01002;
    }

    public void setSzDescription01003(String szDescription01003) {
        this.szDescription01003 = szDescription01003;
    }

    public String getSzDescription01003() {
        return szDescription01003;
    }

    public void setMnFarmNumber(MathNumeric mnFarmNumber) {
        this.mnFarmNumber = mnFarmNumber;
    }

    public MathNumeric getMnFarmNumber() {
        return mnFarmNumber;
    }

    public void setMnAddressNumber1(MathNumeric mnAddressNumber1) {
        this.mnAddressNumber1 = mnAddressNumber1;
    }

    public MathNumeric getMnAddressNumber1() {
        return mnAddressNumber1;
    }

    public void setSzask(String szask) {
        this.szask = szask;
    }

    public String getSzask() {
        return szask;
    }

    public void setSzattitude(String szattitude) {
        this.szattitude = szattitude;
    }

    public String getSzattitude() {
        return szattitude;
    }

    public void setSzUserId(String szUserId) {
        this.szUserId = szUserId;
    }

    public String getSzUserId() {
        return szUserId;
    }

    public void setJdDateUpdated(Date jdDateUpdated) {
        this.jdDateUpdated = jdDateUpdated;
    }

    public Date getJdDateUpdated() {
        return jdDateUpdated;
    }

    public void setMnTimeLastUpdated(MathNumeric mnTimeLastUpdated) {
        this.mnTimeLastUpdated = mnTimeLastUpdated;
    }

    public MathNumeric getMnTimeLastUpdated() {
        return mnTimeLastUpdated;
    }

    public void setSzProgramId(String szProgramId) {
        this.szProgramId = szProgramId;
    }

    public String getSzProgramId() {
        return szProgramId;
    }

    public void setSzWorkStationId(String szWorkStationId) {
        this.szWorkStationId = szWorkStationId;
    }

    public String getSzWorkStationId() {
        return szWorkStationId;
    }

    public void setCErrorCode(String cErrorCode) {
        this.cErrorCode = cErrorCode;
    }

    public String getCErrorCode() {
        return cErrorCode;
    }

    public void setSzErrorMessage(String szErrorMessage) {
        this.szErrorMessage = szErrorMessage;
    }

    public String getSzErrorMessage() {
        return szErrorMessage;
    }
}
