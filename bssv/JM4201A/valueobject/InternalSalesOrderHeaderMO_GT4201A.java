package kidde.e1.bssv.JM4201A.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalSalesOrderHeaderMO_GT4201A extends ValueObject implements Serializable {
    /**
     * Media Object Array <br>
     */
    private MOItem_Internal[] moItems = null;

    /**
     * Download Attachments <br>
     */
    private boolean downloadMediaObject = true;

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
    private MathNumeric mnDocumentorderinvoicee = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/DT <br>
     */
    private String szOrdertype = null;

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String szCompanykeyorderno = null;

    /**
     * Builds and returns the Media Object Key with the media object attributes
     */
    public String getSzMoKey() {
        String key =
            String.valueOf(mnDocumentorderinvoicee)+"|"+String.valueOf(szOrdertype)+"|"+String.valueOf(szCompanykeyorderno);
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
        return "GT4201A";
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

    public void setMnDocumentorderinvoicee(MathNumeric mnDocumentorderinvoicee) {
        this.mnDocumentorderinvoicee = mnDocumentorderinvoicee;
    }

    public MathNumeric getMnDocumentorderinvoicee() {
        return mnDocumentorderinvoicee;
    }

    public void setSzOrdertype(String szOrdertype) {
        this.szOrdertype = szOrdertype;
    }

    public String getSzOrdertype() {
        return szOrdertype;
    }

    public void setSzCompanykeyorderno(String szCompanykeyorderno) {
        this.szCompanykeyorderno = szCompanykeyorderno;
    }

    public String getSzCompanykeyorderno() {
        return szCompanykeyorderno;
    }
}
