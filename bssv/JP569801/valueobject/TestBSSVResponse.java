package kidde.e1.bssv.JP569801.valueobject;

import java.io.Serializable;

import java.util.Calendar;

import java.util.Date;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class TestBSSVResponse extends MessageValueObject implements Serializable {
    /**
     * User ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: USER <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String userID = null;

    /**
     * Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTE <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar date = null;

    /**
     * Time
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TME0 <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer time = null;

    /**
     * Work Station ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: JOBN <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String workStationID = null;

    /**
     * Machine Key
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MKEY <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String machineKey = null;
    
    
    private String statusMessage = null;

    /**
     * TODO: Default public constructor for instantiating: TestBSSVResponse
     */
    public TestBSSVResponse() {
    }
    
    public TestBSSVResponse(TestBSSVResponse vo){
        this.setDate(vo.getDate());
        this.setMachineKey(vo.getMachineKey());
        this.setStatusMessage(vo.getStatusMessage());
        this.setTime(vo.getTime());
        this.setUserID(vo.getUserID());
        this.setWorkStationID(vo.getWorkStationID());
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
    
    public void setDate(Date date){
        this.date = Calendar.getInstance();
    }
    

    public Calendar getDate() {
        return date;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
    
    public void setTime(MathNumeric time){
        try{
            this.time = new Integer(time.intValue());
        }catch(Exception exp){
            this.statusMessage = exp.getMessage();
            this.time = new Integer(0);
        }
    }

    public Integer getTime() {
        return time;
    }

    public void setWorkStationID(String workStationID) {
        this.workStationID = workStationID;
    }

    public String getWorkStationID() {
        return workStationID;
    }

    public void setMachineKey(String machineKey) {
        this.machineKey = machineKey;
    }

    public String getMachineKey() {
        return machineKey;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }
}
