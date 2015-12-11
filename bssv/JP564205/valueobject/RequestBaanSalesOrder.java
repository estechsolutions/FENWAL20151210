package kidde.e1.bssv.JP564205.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class RequestBaanSalesOrder extends ValueObject implements Serializable {
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
    
    private Integer salesOrderNumber = null;
    
    private String salesOrderCompany = null;
    
    private String salesOrderType = null;
    
    
    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String orderStatus = null;

    /**
     * TODO: Default public constructor for instantiating: RequestBaanSalesOrder
     */
    public RequestBaanSalesOrder() {
    }


    public void setBaanSalesOrderNumber(String baanSalesOrderNumber) {
        this.baanSalesOrderNumber = baanSalesOrderNumber;
    }

    public String getBaanSalesOrderNumber() {
        return baanSalesOrderNumber;
    }

    public void setSalesOrderNumber(Integer salesOrderNumber) {
        this.salesOrderNumber = salesOrderNumber;
    }

    public Integer getSalesOrderNumber() {
        return salesOrderNumber;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setSalesOrderCompany(String salesOrderCompany) {
        this.salesOrderCompany = salesOrderCompany;
    }

    public String getSalesOrderCompany() {
        return salesOrderCompany;
    }

    public void setSalesOrderType(String salesOrderType) {
        this.salesOrderType = salesOrderType;
    }

    public String getSalesOrderType() {
        return salesOrderType;
    }
}
