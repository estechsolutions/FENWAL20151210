package kidde.e1.bssv.J5642012;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;

public class TestCustomerData {
    public static void main(String[] args) {
        try{
                TestBusinessService.startTest();
                String file ="C:\\E910_1\\AMDV91\\java\\source\\kidde\\e1\\bssv\\J5642012\\valueobject\\GetCustomerEDPM_D0100042.xml";
                int i = TestBusinessService.callBSSVWithXMLFile("kidde.e1.bssv.J5642012.CustomerData", "getCustomerEDPM", file, IConnection.AUTO);
                System.out.println("Test Completed Successfully");
            
            }finally{
                TestBusinessService.finishTest();
            }
        
        
        
        
    }
}
