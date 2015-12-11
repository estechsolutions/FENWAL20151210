package kidde.e1.bssv.JP569801;

import kidde.e1.bssv.JP569801.valueobject.TestBSSVRequest;
import kidde.e1.bssv.JP569801.valueobject.TestBSSVResponse;

public class TestDriver {
    public static void main(String[] args) {
        TestBSSVRequest req = new TestBSSVRequest();
        req.setUserID("BSERVIC1");
        TestBSSVResponse resp = new TestBSSVResponse();
        
        try{
            BSSVtoJDEConnectivityTester tst = new BSSVtoJDEConnectivityTester();
            resp = tst.runConnectivityTest(req);
            System.out.println(resp.getUserID());
            System.out.println(resp.getStatusMessage());
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
    }
}
