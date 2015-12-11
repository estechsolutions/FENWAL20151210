package kidde.e1.bssv.JPM0101.valueobject;

import java.io.Serializable;

import kidde.e1.bssv.JM0101.valueobject.Internal_ABGT_MediaObject;

import kidde.e1.bssv.JM0101.valueobject.MOItem_Internal;

import oracle.e1.bssvfoundation.base.MessageValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class ABGTReply extends MessageValueObject implements Serializable {
    /**
     * Media Object Array <br>
     */
    private MOItem_Publish[] moItems = null;

    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer mnAddressNumber = null;

    /**
     * TODO: Default public constructor for instantiating: ABGTReply
     */
    public ABGTReply() {
    }
    
    public ABGTReply(Internal_ABGT_MediaObject internalMO){

        this.setMnAddressNumber(internalMO.getMnAddressNumber().intValue());

        MOItem_Publish[] moItems = new MOItem_Publish[internalMO.getMoItems().length];
        
        MOItem_Internal[] moItemArray = new MOItem_Internal[internalMO.getMoItems().length];
        moItemArray = internalMO.getMoItems();
        
        if(internalMO.getMoItems() != null)
        {
          if(internalMO.getMoItems().length > 0)
          {
            this.moItems = new MOItem_Publish[internalMO.getMoItems().length];
            for(int i=0; i<internalMO.getMoItems().length; i++)
            {
              this.moItems[i] = new MOItem_Publish();
              this.moItems[i].setMoSeqNo(moItemArray[i].getMoSeqNo());
              this.moItems[i].setSzItemName(moItemArray[i].getSzItemName());
              this.moItems[i].setSzMoType(moItemArray[i].getSzMoType());         
              this.moItems[i].setSzData(moItemArray[i].getSzData());
            }
          }
        }        
        
    }

    public void setMoItems(MOItem_Publish[] moItems) {
        this.moItems = moItems;
    }

    public MOItem_Publish[] getMoItems() {
        return moItems;
    }

    public void setMnAddressNumber(Integer mnAddressNumber) {
        this.mnAddressNumber = mnAddressNumber;
    }

    public Integer getMnAddressNumber() {
        return mnAddressNumber;
    }
}
