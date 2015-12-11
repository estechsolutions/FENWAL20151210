package kidde.e1.bssv.JP564704.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import kidde.e1.bssv.J564701.valueobject.InternalPriceCheck_D564074A;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSSVDataFormatterException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class PriceCheckRequest extends ValueObject implements Serializable {
    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer addressNumber = null;

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
    private Integer addressNumberShipTo = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String ndItemNumber = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String businessUnit = null;

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
    private BigDecimal quantityFrom = null;
    
    private String versionP4074 = null;

    /**
     * TODO: Default public constructor for instantiating: PriceCheckRequest
     */
    public PriceCheckRequest() {
    }

    public void setAddressNumber(Integer addressNumber) {
        this.addressNumber = addressNumber;
    }

    public Integer getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumberShipTo(Integer addressNumberShipTo) {
        this.addressNumberShipTo = addressNumberShipTo;
    }

    public Integer getAddressNumberShipTo() {
        return addressNumberShipTo;
    }

    public void setNdItemNumber(String ndItemNumber) {
        this.ndItemNumber = ndItemNumber;
    }

    public String getNdItemNumber() {
        return ndItemNumber;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setQuantityFrom(BigDecimal quantityFrom) {
        this.quantityFrom = quantityFrom;
    }

    public BigDecimal getQuantityFrom() {
        return quantityFrom;
    }
    
    public E1MessageList mapFromPublishedToInternal(IContext context, IConnection connection, InternalPriceCheck_D564074A internalVO){
        E1MessageList msg = new E1MessageList();
        
        if(this.getAddressNumber()!= null){
            internalVO.setMnAddressNumber(new MathNumeric(this.getAddressNumber()));
        }
        if (this.getAddressNumberShipTo() != null){
            internalVO.setMnAddressNumberShipTo(new MathNumeric(this.getAddressNumberShipTo()));
        }
        
        internalVO.setSzIdentifier2ndItem(this.getNdItemNumber());
        internalVO.setSzP4074Version(this.getVersionP4074());
        
        if (this.getQuantityFrom() != null){
            internalVO.setMnQuantityMinimum(new MathNumeric(this.getQuantityFrom()));
        }
        internalVO.setSzCostCenter((FormatterUtility(context, this.getBusinessUnit(), "MCU", msg, "BusinessUnit")));
        
        return msg;
        
    }
    
    public String FormatterUtility(IContext context, String fieldToFormat, String aliasName, 
                                   E1MessageList messages, String fieldName)
    {
      String formattedMCU = null;
      
      if (fieldToFormat != null && (fieldToFormat.length() > 0))
      {
        try 
        {        
          formattedMCU = context.getBSSVDataFormatter().format(fieldToFormat, aliasName);
        }  
        catch (BSSVDataFormatterException e) 
        {
          context.getBSSVLogger().app(context,"Error when formatting " + fieldName, null, null, e);
          //Create new E1 Message with error from exception
          messages.addMessage(new E1Message(context, "002FIS", fieldToFormat));
        }
      }     
      
      return (formattedMCU);    
    }

    public void setVersionP4074(String versionP4074) {
        this.versionP4074 = versionP4074;
    }

    public String getVersionP4074() {
        return versionP4074;
    }
}
