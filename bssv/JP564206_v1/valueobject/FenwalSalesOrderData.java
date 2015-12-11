package kidde.e1.bssv.JP564206.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

public class FenwalSalesOrderData extends ValueObject implements Serializable {

    /**
     * HeaderText 
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     */
    private String headerText = null;
    
    /**
     * FooterText 
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     */
    private String footerText = null;
    
    
    /**
     * CompetitiveDiscountCode 
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     */
    private String competitiveDiscountCode = null;
    

    /**
     * SpecificationDiscountCode 
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     */
    private String specificationDiscountCode = null;

    /**
     * UserPIN 
     * <p>
     * corresponds to the F4201.tkby
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     */
    private String userPIN = null;
    

    /**
     * VerticalMarketCode 
     * <p>
     * corresponds to the F4201.zon
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     */
    private String verticalMarketCode = null;
    
    /**
     * ShipConstraint 
     * <p>
     * corresponds to the F4201.stop
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     */
    private String shipConstraint = null;
    
    /**
     * RouteCode 
     * <p>
     * corresponds to the F4201.rout
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     */
    private String routeCode = null;


    /**
     * EdwardsShipTo 
     * <p>
     * corresponds to the F560101A.an8
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     */
    private Integer edwardsShipTo = null;


    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public String getFooterText() {
        return footerText;
    }

    public void setCompetitiveDiscountCode(String competitiveDiscountCode) {
        this.competitiveDiscountCode = competitiveDiscountCode;
    }

    public String getCompetitiveDiscountCode() {
        return competitiveDiscountCode;
    }

    public void setSpecificationDiscountCode(String specificationDiscountCode) {
        this.specificationDiscountCode = specificationDiscountCode;
    }

    public String getSpecificationDiscountCode() {
        return specificationDiscountCode;
    }

    public void setUserPIN(String userPIN) {
        this.userPIN = userPIN;
    }

    public String getUserPIN() {
        return userPIN;
    }

    public void setVerticalMarketCode(String verticalMarketCode) {
        this.verticalMarketCode = verticalMarketCode;
    }

    public String getVerticalMarketCode() {
        return verticalMarketCode;
    }

    public void setShipConstraint(String shipConstraint) {
        this.shipConstraint = shipConstraint;
    }

    public String getShipConstraint() {
        return shipConstraint;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setEdwardsShipTo(Integer edwardsShipTo) {
        this.edwardsShipTo = edwardsShipTo;
    }

    public Integer getEdwardsShipTo() {
        return edwardsShipTo;
    }
}
