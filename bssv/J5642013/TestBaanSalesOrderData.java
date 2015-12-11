package kidde.e1.bssv.J5642013;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;

public class TestBaanSalesOrderData {
    public static void main(String[] args) {
        try{
                TestBusinessService.startTest();
                String file ="C:\\E910_1\\AMDV91\\java\\source\\kidde\\e1\\bssv\\J5642013\\valueobject\\BaanSalesOrderRequest2.xml";
                int i = TestBusinessService.callBSSVWithXMLFile("kidde.e1.bssv.J5642013.BaanSalesOrderData", "processBaanSalesOrderStatus", file, IConnection.AUTO);
                System.out.println("Test Completed Successfully");
            }finally{
                TestBusinessService.finishTest();
            }
        
        
    }
}
