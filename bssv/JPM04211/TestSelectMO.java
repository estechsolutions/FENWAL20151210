package kidde.e1.bssv.JPM04211;

import java.io.ByteArrayOutputStream;

import java.math.BigDecimal;

import kidde.e1.bssv.JPM04211.valueobject.GetSalesOrderDetailRequest;
import kidde.e1.bssv.JPM04211.valueobject.MOItem_Publish;
import kidde.e1.bssv.JPM04211.valueobject.SalesOrderDetailReply;

public class TestSelectMO {
    public static void main(String[] args) {
        GetSalesOrderDetailRequest req = new GetSalesOrderDetailRequest();
        
        //258361|SO|00100|1.000
        //500674|SO|00103
        
        req.setOrderNumber(new Integer(500674));
        req.setOrderType("SO");
        req.setOrderCompany("00103");
        req.setLineNumber(new BigDecimal(1.000));
        
        
        SalesOrderDetailReply reply = new SalesOrderDetailReply();
        SalesOrderDetailMediaObjectManager mgr = new SalesOrderDetailMediaObjectManager();
        try{
           reply = mgr.selectSalesOrderLineMO(req);
            
            if (reply.getMediaObjects() != null){
                MOItem_Publish[] replyMO = new MOItem_Publish[reply.getMediaObjects().length];
                replyMO = reply.getMediaObjects();
                for(int i=0; i<reply.getMediaObjects().length; i++){
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
