package kidde.e1.bssv.JP564204;

import kidde.e1.bssv.JP564204.valueobject.EdwardsShipToReply;
import kidde.e1.bssv.JP564204.valueobject.EdwardsShipToRequest;

public class TestF560101AOperations {
    public static void main(String[] args) {
        EdwardsShipToRequest req = new EdwardsShipToRequest();
        req.setAddressLine1("601 ZACHARY ROAD");
      //  req.setAddressLine2("");
      //  req.setAddressLine3("");
      //  req.setAddressLine4("");
      //  req.setAddressLine5("");
      //  req.setAddressLine6("");
        req.setCity("MANCHESTER");
        req.setCountry("US");
        req.setCustomerSoldTo(new Integer(80000000));
       // req.setCustomerSoldTo(new Integer(7605));
        req.setName("ALARMAX DISTRIBUTORS INC");
        req.setPostalCode("3109");
        req.setState("NH");
        //req.setAddressActivationFlag("I");
        
        EdwardsShipToReply reply = new EdwardsShipToReply();
        F560101AOperations mgr = new F560101AOperations();
        
        try{
            reply = mgr.addCustomerShipTo(req);
            System.out.println(reply.getAddressNumberShipTo().toString());
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }


    }
}
