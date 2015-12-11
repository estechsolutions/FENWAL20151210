package kidde.e1.bssv.J5642005.valueobject;

import java.io.Serializable;

import kidde.e1.bssv.JP564200.valueobject.ProcessSalesOrderKidde;

import kidde.e1.bssv.JP564206.valueobject.FenwalSalesOrderRequest;

import oracle.e1.bssv.J4200010.valueobject.InternalProcessSalesOrder;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class AdditionalKiddeSOData_D5642005A extends ValueObject implements Serializable {
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
     * Order Taken By
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TKBY <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szOrderTakenBy = null;

    /**
     * Zone Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ZON <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 40/ZN <br>
     */
    private String szZoneNumber = null;

    /**
     * Stop Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: STOP <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 42/SP <br>
     */
    private String szStopCode = null;

    /**
     * Route Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ROUT <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 42/RT <br>
     */
    private String szRouteCode = null;

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

    public void setSzOrderTakenBy(String szOrderTakenBy) {
        this.szOrderTakenBy = szOrderTakenBy;
    }

    public String getSzOrderTakenBy() {
        return szOrderTakenBy;
    }

    public void setSzZoneNumber(String szZoneNumber) {
        this.szZoneNumber = szZoneNumber;
    }

    public String getSzZoneNumber() {
        return szZoneNumber;
    }

    public void setSzStopCode(String szStopCode) {
        this.szStopCode = szStopCode;
    }

    public String getSzStopCode() {
        return szStopCode;
    }

    public void setSzRouteCode(String szRouteCode) {
        this.szRouteCode = szRouteCode;
    }

    public String getSzRouteCode() {
        return szRouteCode;
    }

    public void setCErrorCode(String cErrorCode) {
        this.cErrorCode = cErrorCode;
    }

    public String getCErrorCode() {
        return cErrorCode;
    }
    
    public E1MessageList mapToUpdateTableD5642005A(InternalProcessSalesOrder internalE1VO,ProcessSalesOrderKidde vo){       
        E1MessageList messages = new E1MessageList();       
        this.setMnDocumentOrderInvoiceE(internalE1VO.getMnOrderNo());
        this.setSzCompanyKeyOrderNo(internalE1VO.getSzOrderCo());
        this.setSzOrderTakenBy(vo.getKiddeSalesOrder().getUserPIN());
        this.setSzOrderType(internalE1VO.getSzOrderType());
        this.setSzRouteCode(vo.getKiddeSalesOrder().getRouteCode());
        this.setSzStopCode(vo.getKiddeSalesOrder().getShipConstraint());
        this.setSzZoneNumber(vo.getKiddeSalesOrder().getVerticalMarketCode());     
        
        return messages;
    }
    
    

    public E1MessageList mapToUpdateTableD5642005A(InternalProcessSalesOrder internalE1VO,FenwalSalesOrderRequest vo){       
        E1MessageList messages = new E1MessageList();       
        this.setMnDocumentOrderInvoiceE(internalE1VO.getMnOrderNo());
        this.setSzCompanyKeyOrderNo(internalE1VO.getSzOrderCo());
        this.setSzOrderTakenBy(vo.getFenwalSOData().getUserPIN());
        this.setSzOrderType(internalE1VO.getSzOrderType());
        this.setSzRouteCode(vo.getFenwalSOData().getRouteCode());
        this.setSzStopCode(vo.getFenwalSOData().getShipConstraint());
        this.setSzZoneNumber(vo.getFenwalSOData().getVerticalMarketCode());     
        
        return messages;
    }
    
}
