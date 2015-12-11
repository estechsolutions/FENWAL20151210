package kidde.e1.bssv.JM0101.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class Internal_ABGT_MediaObject extends ValueObject implements Serializable {
    /**
     * Media Object Array <br>
     */
    private MOItem_Internal[] moItems = null;

    /**
     * Download Attachments <br>
     */
    private boolean downloadMediaObject = true;

    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 01/1 <br>
     */
    private MathNumeric mnAddressNumber = null;

    /**
     * Builds and returns the Media Object Key with the media object attributes
     */
    public String getSzMoKey() {
        String key = String.valueOf(mnAddressNumber);
        if (key.startsWith("null|"))
        {
            key = key.substring(4, key.length());
        }
        if (key.endsWith("|null"))
        {
            key = key.substring(0, key.length() - 4);
        }
        while(key.indexOf("|null|") != -1)
        {
            key = key.replace("|null|", "||");
        }
        return key;
    }

    /**
     * Returns the Media Object name
     */
    public String getSzMoName() {
        return "ABGT";
    }

    public void setMoItems(MOItem_Internal[] moItems) {
        this.moItems = moItems;
    }

    public MOItem_Internal[] getMoItems() {
        return moItems;
    }

    public void setDownloadMediaObject(boolean downloadMediaObject) {
        this.downloadMediaObject = downloadMediaObject;
    }

    public boolean isDownloadMediaObject() {
        return downloadMediaObject;
    }

    public void setMnAddressNumber(MathNumeric mnAddressNumber) {
        this.mnAddressNumber = mnAddressNumber;
    }

    public MathNumeric getMnAddressNumber() {
        return mnAddressNumber;
    }
}
