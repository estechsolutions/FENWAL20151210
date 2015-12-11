package kidde.e1.bssv.JP563291;

import kidde.e1.bssv.JP563291.valueobject.SegmentDataReply;
import kidde.e1.bssv.JP563291.valueobject.SegmentDataRequest;

public class TestSelectQuestionsF3291 {
    public static void main(String[] args) {
        
        SegmentDataRequest req = new SegmentDataRequest();
        req.setItem("45-100070-001CF");
    //      req.setItem("CFG-CYL");
    //      req.setSegmentAnswer("FE13");
    //      req.setSegmentNumber(new Integer(10));
    //      req.setUniqueKeyID(new Integer(0));
    //    req.setCostCenter("10300010");
        
        
        SegmentDataReply reply = new SegmentDataReply();
        
        try{
            ConfiguratorSegmentDataManager mgr = new ConfiguratorSegmentDataManager();
            reply = mgr.getSegmentData(req);
            
            System.out.println("Success");
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
        
        
        
        
    }
}
