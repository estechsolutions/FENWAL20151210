package kidde.e1.bssv.JP564204.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import java.util.Date;

import kidde.e1.bssv.J5642004.valueobject.InternalF560101AOperations_D5642004A;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class EdwardsShipToRequest extends ValueObject implements Serializable {
    /**
     * Customer Sold To Addressbook Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     */
    private Integer customerSoldTo = null;

    /**
     * Name
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: NAME <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String name = null;


    /**
     * Address Line 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD1 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String addressLine1 = null;

    /**
     * Address Line 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD2 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String addressLine2 = null;

    /**
     * Address Line 3
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD3 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String addressLine3 = null;

    /**
     * Address Line 4
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD4 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String addressLine4 = null;

    /**
     * Address Line 5
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD5 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String addressLine5 = null;

    /**
     * Address Line 6
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD6 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String addressLine6 = null;

    /**
     * City
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTY1 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String city = null;

    /**
     * State
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADDS <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String state = null;

    /**
     * Postal Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADDZ <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String postalCode = null;

    /**
     * Country
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTR <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String country = null;

    /**
     * Address Activation Flag
     * <p>
     * OSEV01
     */
    private String addressActivationFlag = null;
    


    /**
     * TODO: Default public constructor for instantiating: EdwardsShipToRequest
     */
    public EdwardsShipToRequest() {
    }

    public void setCustomerSoldTo(Integer customerSoldTo) {
        this.customerSoldTo = customerSoldTo;
    }

    public Integer getCustomerSoldTo() {
        return customerSoldTo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine5(String addressLine5) {
        this.addressLine5 = addressLine5;
    }

    public String getAddressLine5() {
        return addressLine5;
    }

    public void setAddressLine6(String addressLine6) {
        this.addressLine6 = addressLine6;
    }

    public String getAddressLine6() {
        return addressLine6;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
    
    public E1MessageList mapShipRequestToInternal(InternalF560101AOperations_D5642004A internalVO){
       E1MessageList messages = new E1MessageList();
       internalVO.setCActionCode("A");
       internalVO.setMnAddressNumber(new MathNumeric(this.getCustomerSoldTo()));
       internalVO.setSzName(this.getName());
       internalVO.setSzAddressLine1(this.getAddressLine1());
       internalVO.setSzAddressLine2(this.getAddressLine2());
       internalVO.setSzAddressLine3(this.getAddressLine3());
       internalVO.setSzAddressLine4(this.getAddressLine4());
       internalVO.setSzAddressLine5(this.getAddressLine5());
       internalVO.setSzAddressLine6(this.getAddressLine6());
       Calendar calDate = Calendar.getInstance();
       calDate.set(Calendar.YEAR, 2050);
       calDate.set(Calendar.MONTH, 12);
       calDate.set(Calendar.DAY_OF_MONTH,30);
       calDate.set(Calendar.HOUR_OF_DAY,12);
       calDate.set(Calendar.MINUTE,0);
       calDate.set(Calendar.SECOND,0);
       Date jdDateThru = calDate.getTime();
       internalVO.setJdDateThru(jdDateThru);
       internalVO.setSzCity(this.getCity());
       internalVO.setSzState(this.getState());
       internalVO.setSzCountry(this.getCountry());
       internalVO.setSzZipCodePostal(this.getPostalCode());
       internalVO.setSzDateType("A");
       internalVO.setCActiveInactiveFlag(this.getAddressActivationFlag());
       
       return messages;
    }

    public void setAddressActivationFlag(String addressActivationFlag) {
        this.addressActivationFlag = addressActivationFlag;
    }

    public String getAddressActivationFlag() {
        return addressActivationFlag;
    }
}
