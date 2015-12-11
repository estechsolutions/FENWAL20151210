package kidde.e1.bssv.JPM04211.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SalesOrderDetailLine_Published extends ValueObject implements Serializable {
    /**
     * Media Object Array <br>
     */
    private MOItem_Publish[] moItems = null;

    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DOCO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer mnSalesOrderNumber = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String szSalesOrdertype = null;

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String szSalesOrderkeyCompany = null;

    /**
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private BigDecimal mnLinenumber = null;

    /**
     * TODO: Default public constructor for instantiating: SalesOrderDetailLine_Published
     */
    public SalesOrderDetailLine_Published() {
    }

    public void setMoItems(MOItem_Publish[] moItems) {
        this.moItems = moItems;
    }

    public MOItem_Publish[] getMoItems() {
        return moItems;
    }

    public void setMnSalesOrderNumber(Integer mnSalesOrderNumber) {
        this.mnSalesOrderNumber = mnSalesOrderNumber;
    }

    public Integer getMnSalesOrderNumber() {
        return mnSalesOrderNumber;
    }

    public void setSzSalesOrdertype(String szSalesOrdertype) {
        this.szSalesOrdertype = szSalesOrdertype;
    }

    public String getSzSalesOrdertype() {
        return szSalesOrdertype;
    }

    public void setSzSalesOrderkeyCompany(String szSalesOrderkeyCompany) {
        this.szSalesOrderkeyCompany = szSalesOrderkeyCompany;
    }

    public String getSzSalesOrderkeyCompany() {
        return szSalesOrderkeyCompany;
    }

    public void setMnLinenumber(BigDecimal mnLinenumber) {
        this.mnLinenumber = mnLinenumber;
    }

    public BigDecimal getMnLinenumber() {
        return mnLinenumber;
    }
}
