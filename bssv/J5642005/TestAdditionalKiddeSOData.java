package kidde.e1.bssv.J5642005;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;

public class TestAdditionalKiddeSOData {
    public static void main(String[] args) {
        try{
        TestBusinessService.startTest();
        String file = "C:\\E910_1\\AMDV91\\java\\source\\kidde\\e1\\bssv\\J5642005\\valueobject\\AdditionalKiddeSOData_D5642005A.xml";
        int i = TestBusinessService.callBSSVWithXMLFile("kidde.e1.bssv.J5642005.AdditionalKiddeSOData","UpdateKiddeSOData", file, IConnection.AUTO);
        System.out.println("Completed");
        
        }finally{
        TestBusinessService.finishTest();
        }

    }
}
