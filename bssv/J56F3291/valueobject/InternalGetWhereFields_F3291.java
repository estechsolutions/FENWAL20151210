package kidde.e1.bssv.J56F3291.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetWhereFields_F3291 extends ValueObject implements Serializable {
    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F3291_LITM = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String F3291_MCU = null;

    public void setF3291_LITM(String F3291_LITM) {
        this.F3291_LITM = F3291_LITM;
    }

    public String getF3291_LITM() {
        return F3291_LITM;
    }

    public void setF3291_MCU(String F3291_MCU) {
        this.F3291_MCU = F3291_MCU;
    }

    public String getF3291_MCU() {
        return F3291_MCU;
    }
}
