package kidde.e1.bssv.JPM04211.valueobject;


import java.io.Serializable;

import java.math.BigDecimal;

import kidde.e1.bssv.JM04211.valueobject.MOItem_Internal;
import kidde.e1.bssv.JM04211.valueobject.SalesOrderDetailMO_GT4211;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.wsrp.commons.producer.util.Base64;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class SalesOrderDetailReply extends MessageValueObject implements Serializable {
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
    
    
    MOItem_Publish[] mediaObjects = null;

    /**
     * TODO: Default public constructor for instantiating: SalesOrderDetailReply
     */
    public SalesOrderDetailReply() {
    }
    
    public SalesOrderDetailReply(SalesOrderDetailMO_GT4211 vo){
        this.setDocumentOrderNoInvoiceetc(vo.getMnDocumentorderinvoicee().intValue());
        if (vo.getMnLinenumber() != null){
            this.setLineNumber(vo.getMnLinenumber().asBigDecimal());
        }
        this.setOrderType(vo.getSzOrdertype());
        
        MOItem_Publish[] moItems = new MOItem_Publish[vo.getMoItems().length];
        
        MOItem_Internal[] internalMO = new MOItem_Internal[vo.getMoItems().length];
        internalMO = vo.getMoItems();
        
        if(vo.getMoItems() != null)
        {
          if(vo.getMoItems().length > 0)
          {
            mediaObjects = new MOItem_Publish[vo.getMoItems().length];
            for(int i=0; i<vo.getMoItems().length; i++)
            {
              mediaObjects[i] = new MOItem_Publish();
              mediaObjects[i].setMoSeqNo(internalMO[i].getMoSeqNo());
              mediaObjects[i].setSzItemName(internalMO[i].getSzItemName());
              mediaObjects[i].setSzMoType(internalMO[i].getSzMoType());         
              mediaObjects[i].setSzData(internalMO[i].getSzData());
                        }
          }
        }        
        
        
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

    public void setLineNumber(BigDecimal lineNumber) {
        this.lineNumber = lineNumber;
    }

    public BigDecimal getLineNumber() {
        return lineNumber;
    }

    public void setMediaObjects(MOItem_Publish[] mediaObjects) {
        this.mediaObjects = mediaObjects;
    }

    public MOItem_Publish[] getMediaObjects() {
        return mediaObjects;
    }
}
