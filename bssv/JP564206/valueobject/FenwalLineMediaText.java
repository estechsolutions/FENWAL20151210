package kidde.e1.bssv.JP564206.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

public class FenwalLineMediaText extends ValueObject implements Serializable {
    
    private Integer itemId = null;
    
    private String itemProduct = null;
    
    private String mediaTextMessage = null;


    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemProduct(String itemProduct) {
        this.itemProduct = itemProduct;
    }

    public String getItemProduct() {
        return itemProduct;
    }

    public void setMediaTextMessage(String mediaTextMessage) {
        this.mediaTextMessage = mediaTextMessage;
    }

    public String getMediaTextMessage() {
        return mediaTextMessage;
    }
}
