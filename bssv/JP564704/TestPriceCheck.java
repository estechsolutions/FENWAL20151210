package kidde.e1.bssv.JP564704;

import java.math.BigDecimal;

import kidde.e1.bssv.JP564704.valueobject.PriceCheckRequest;
import kidde.e1.bssv.JP564704.valueobject.PriceCheckResponse;

public class TestPriceCheck {
    public static void main(String[] args) {
        PriceCheckRequest req = new PriceCheckRequest();
        req.setAddressNumber(new Integer(70108336));
        req.setBusinessUnit("49900010");
        req.setNdItemNumber("E40026");
        req.setQuantityFrom(new BigDecimal(1));
        req.setVersionP4074("P499V003");
        
        
        PriceCheckResponse resp = new PriceCheckResponse();
        
        PriceCheckManager mgr = new PriceCheckManager();
        try{
            resp = mgr.getPriceCheck(req);
            System.out.println("Price is "+resp.getAmountPriceperUnit());
            System.out.println(resp.getE1MessageList().getMessagesAsString(0));
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
        
        
    }
}
