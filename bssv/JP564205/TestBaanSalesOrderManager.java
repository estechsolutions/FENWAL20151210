package kidde.e1.bssv.JP564205;

import kidde.e1.bssv.JP564205.valueobject.ReplyBaanSalesOrder;
import kidde.e1.bssv.JP564205.valueobject.RequestBaanSalesOrder;

public class TestBaanSalesOrderManager {
    public static void main(String[] args) {
        RequestBaanSalesOrder req = new RequestBaanSalesOrder();
        req.setBaanSalesOrderNumber("040054491");
        req.setSalesOrderNumber(new Integer(1674));
        req.setSalesOrderCompany("00100");
        req.setSalesOrderType("SG");

        
        ReplyBaanSalesOrder reply = new ReplyBaanSalesOrder();
        try{
            BaanSalesOrderManager mgr = new BaanSalesOrderManager();
            reply = mgr.getBaanSalesOrder(req);
            System.out.println("Success");
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
                                                            
        
        
    }
}
