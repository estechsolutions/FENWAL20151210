package kidde.e1.bssv.JP563291.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SegmentAnswers extends ValueObject implements Serializable {
    /**
     * Segment Value
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: SGVL <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String segmentValue = null;

    /**
     * TODO: Default public constructor for instantiating: SegmentAnswers
     */
    public SegmentAnswers() {
    }

    public void setSegmentValue(String segmentValue) {
        this.segmentValue = segmentValue;
    }

    public String getSegmentValue() {
        return segmentValue;
    }
}
