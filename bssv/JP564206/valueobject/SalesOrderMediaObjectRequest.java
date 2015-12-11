package kidde.e1.bssv.JP564206.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import kidde.e1.bssv.JM04211.valueobject.MOItem_Internal;
import kidde.e1.bssv.JM04211.valueobject.SalesOrderDetailMO_GT4211;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SalesOrderMediaObjectRequest extends ValueObject implements Serializable {
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
    private Integer documentOrderNoInvoiceetc = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String orderType = null;

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String orderCompanyOrderNumber = null;

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
    private BigDecimal lineNumber = null;
    
    private SalesOrderDetailsMO mediaObject = null;

    /**
     * TODO: Default public constructor for instantiating: SalesOrderMediaObjectRequest
     */
    public SalesOrderMediaObjectRequest() {
    }

    public void setDocumentOrderNoInvoiceetc(Integer documentOrderNoInvoiceetc) {
        this.documentOrderNoInvoiceetc = documentOrderNoInvoiceetc;
    }

    public Integer getDocumentOrderNoInvoiceetc() {
        return documentOrderNoInvoiceetc;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderCompanyOrderNumber(String orderCompanyOrderNumber) {
        this.orderCompanyOrderNumber = orderCompanyOrderNumber;
    }

    public String getOrderCompanyOrderNumber() {
        return orderCompanyOrderNumber;
    }

    public void setLineNumber(BigDecimal lineNumber) {
        this.lineNumber = lineNumber;
    }

    public BigDecimal getLineNumber() {
        return lineNumber;
    }
    
    public void setMediaObject(SalesOrderDetailsMO mediaObject) {
        this.mediaObject = mediaObject;
    }

    public SalesOrderDetailsMO getMediaObject() {
        return mediaObject;
    }    
    
    public E1MessageList mapFromPublished(IContext context, SalesOrderDetailMO_GT4211 vo){
        E1MessageList messages = new E1MessageList();
        //set all internal VO attributes based on external VO passed in
        MOItem_Publish[] pub = this.getMediaObject().getMoItems();
        MOItem_Internal[] internal  = new MOItem_Internal[pub.length];
        for(int i=0;i<pub.length;i++) {
            MOItem_Internal mo_int =  new MOItem_Internal();
            mo_int.setSzItemName(pub[i].getSzItemName());  
            mo_int.setSzMoType(pub[i].getSzMoType()); 
            mo_int.setSzData(pub[i].getSzData());  
            internal[i] = mo_int;
        }
        vo.setMoItems(internal);
        return messages;
    }


}
