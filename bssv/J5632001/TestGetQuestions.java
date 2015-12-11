package kidde.e1.bssv.J5632001;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
//import kidde.e1.bssv.J5632001.InternalConfiguredItemsQuestions;

public class TestGetQuestions {
 
//TODO: add test methods for each test scenario
   /**
    * Main Method used for executing test methods as an application.
    **/
   public static void main(String[] args) throws BusinessServiceException {
        try {
            //Call required before running a test harness using application (main()).
            TestBusinessService.startTest();
            //TODO:  call test methods
                String file = "C:\\E910_1\\AMPY91\\java\\source\\kidde\\e1\\bssv\\J5632001\\valueobject\\D5632001A.xml";
            int bSSVWithXMLFile =
                TestBusinessService.callBSSVWithXMLFile("kidde.e1.bssv.J5632001.InternalConfiguredItemsQuestions", "getQuestionsAnswers", file, IConnection.AUTO);
            
            System.out.println("Completed");
        } finally {
            //Call required after test is complete.  Needed to clean up daemon threads.
            TestBusinessService.finishTest();
        }
   }

}
