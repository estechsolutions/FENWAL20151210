package kidde.e1.bssv.JP564200.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class KiddeSalesOrderCommission extends ValueObject implements Serializable {
    /**
     * Alpha Spec. Data 10
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AA10 <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String relationCode = null;

    /**
     * Salesperson Commission 001
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SLCM <br>
     * EnterpriseOne field length:  7 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private BigDecimal relation = null;

    /**
     * TODO: Default public constructor for instantiating: SalesOrderCommission
     */
    public KiddeSalesOrderCommission() {
    }

    public void setRelationCode(String relationCode) {
        this.relationCode = relationCode;
    }

    public String getRelationCode() {
        return relationCode;
    }

    public void setRelation(BigDecimal relation) {
        this.relation = relation;
    }

    public BigDecimal getRelation() {
        return relation;
    }
}
