package kidde.e1.bssv.JPM0101;

import java.io.ByteArrayOutputStream;

import kidde.e1.bssv.JPM0101.valueobject.ABGTReply;
import kidde.e1.bssv.JPM0101.valueobject.ABGTRequest;
import kidde.e1.bssv.JPM0101.AddressBookMOManager;
import kidde.e1.bssv.JPM0101.valueobject.MOItem_Publish;

public class TestABGTSelect {
    public static void main(String[] args) {
        ABGTRequest req = new ABGTRequest();
        req.setCustomerAddressNumber(new Integer(70005105));
        
        ABGTReply reply = new ABGTReply();
        
        try{
         AddressBookMOManager mgr = new AddressBookMOManager();
         reply = mgr.getCustomerMO(req);
         System.out.println(reply.getMnAddressNumber());


            if (reply.getMoItems() != null){
                MOItem_Publish[] replyMO = new MOItem_Publish[reply.getMoItems().length];
                replyMO = reply.getMoItems();
                for(int i=0; i<reply.getMoItems().length; i++){
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    replyMO[i].getSzData().writeTo(bos);
                    System.out.println(bos.toString());                
                }
            }              
            
            
            
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
        
        
    }
}
