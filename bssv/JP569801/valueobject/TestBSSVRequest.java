package kidde.e1.bssv.JP569801.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class TestBSSVRequest extends ValueObject implements Serializable {
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
     * TODO: Default public constructor for instantiating: TestBSSVRequest
     */
    public TestBSSVRequest() {
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }
}
