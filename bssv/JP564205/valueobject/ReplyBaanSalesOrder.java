package kidde.e1.bssv.JP564205.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import kidde.e1.bssv.J5642010.valueobject.BaanSalesOrder;

import kidde.e1.bssv.J5642010.valueobject.BaanSalesOrderDetails;

import oracle.e1.bssvfoundation.base.MessageValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class ReplyBaanSalesOrder extends MessageValueObject implements Serializable {
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
    private String baanSalesOrderNumber = null;
    
    private String errorCode = null;

    private BaanOrderDetails[] orderDetails  = null;

    /**
     * TODO: Default public constructor for instantiating: ReplyBaanSalesOrder
     */
    public ReplyBaanSalesOrder() {
    }
    
    public ReplyBaanSalesOrder(String errorCode){
        this.setErrorCode(errorCode);
    }
    
    public ReplyBaanSalesOrder(BaanSalesOrder so){
       
        BaanSalesOrderDetails[] soDetails = new BaanSalesOrderDetails[so.getDetails().length];
        soDetails = so.getDetails(); 
        orderDetails = new BaanOrderDetails[so.getDetails().length];
        for (int i=0; i<so.getDetails().length; i++){
            orderDetails[i] = new BaanOrderDetails();
            orderDetails[i].setQuantity(soDetails[i].getMnQuantity().bigDecimalValue());  
            orderDetails[i].setLinNumber(soDetails[i].getMnLinenumber().intValue());
            orderDetails[i].setOrderStatus(soDetails[i].getMnBaanStatus().getValue().toString());
            orderDetails[i].setItem(soDetails[i].getSzIdentifier2nditem());
        }
        this.setBaanSalesOrderNumber(soDetails[0].getBaanOrderNumber());
        
    }

    public void setBaanSalesOrderNumber(String baanSalesOrderNumber) {
        this.baanSalesOrderNumber = baanSalesOrderNumber;
    }

    public String getBaanSalesOrderNumber() {
        return baanSalesOrderNumber;
    }

    public void setOrderDetails(BaanOrderDetails[] orderDetails) {
        this.orderDetails = orderDetails;
    }

    public BaanOrderDetails[] getOrderDetails() {
        return orderDetails;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
