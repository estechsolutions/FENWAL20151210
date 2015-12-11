package kidde.e1.bssv.JP564206;

import com.sun.xml.ws.util.ByteArrayDataSource;

import java.io.ByteArrayOutputStream;
import java.io.File;

import java.io.FileInputStream;

import java.math.BigDecimal;

import javax.activation.DataHandler;

import kidde.e1.bssv.JM04211.valueobject.SalesOrderDetailMO_GT4211;
import kidde.e1.bssv.JP564206.valueobject.FenwalSalesOrderResponse;
import kidde.e1.bssv.JP564206.valueobject.FenwalSalesOrderRequest;
import kidde.e1.bssv.JP564206.valueobject.MOItem_Publish;
import kidde.e1.bssv.JP564206.valueobject.SalesOrderDetailsMO;
import kidde.e1.bssv.JP564206.valueobject.SalesOrderMediaObjectRequest;
import kidde.e1.bssv.JP564206.valueobject.SalesOrderMediaObjectResponse;
import kidde.e1.bssv.JP564206.valueobject.TotalPriceRequest;
import kidde.e1.bssv.JP564206.valueobject.TotalPriceResponse;

public class TestFenwal_SalesOrderManager {
    public static void main(String[] args) {
        
        
        SalesOrderMediaObjectRequest mediaReq = new SalesOrderMediaObjectRequest();
        
        SalesOrderDetailsMO moPub = new SalesOrderDetailsMO();
        MOItem_Publish moItem = new MOItem_Publish();
        MOItem_Publish[] arrayMO = new MOItem_Publish[1];
        
        moItem.setMoSeqNo(1);
        moItem.setSzItemName("TEXT");
        moItem.setSzMoType("TEXT");
    
        
        
        try{
  /*          File pdfFile = new File("c:/temp/TestDsl.pdf");
            byte[] data = new byte[(int) pdfFile.length()];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            FileInputStream fileInputStream = new FileInputStream(pdfFile);
            int count = 0;
            while (fileInputStream.read(data) != -1) {
                    byteArrayOutputStream.write(data, 0, count);
            }
            fileInputStream.close();
            byteArrayOutputStream.close();
            // FileDataSource fDataSource = new FileDataSource(file);
            DataHandler handler = new DataHandler(new ByteArrayDataSource(data,
                            "application/pdf"));
    */     
            
        // - this works    DataHandler testHandler = new DataHandler("This is a test from Eric", "application/rtf");
        DataHandler testHandler = new DataHandler("This is a test from Eric adding a record", "application/text");
            moItem.setSzData(testHandler);
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
        
        moPub.setMnLinenumber(new BigDecimal(1.000));
        moPub.setMnSalesOrderNumber(new Integer(258361));  
        moPub.setSzSalesOrderkeyCompany("00100");
        moPub.setSzSalesOrdertype("SO");
        arrayMO[0] = moItem;
        moPub.setMoItems(arrayMO);
        
        
        
        mediaReq.setDocumentOrderNoInvoiceetc(new Integer(258361));
        mediaReq.setLineNumber(new BigDecimal(1.000));
        mediaReq.setOrderCompanyOrderNumber("00100");
        mediaReq.setOrderType("SO");
        mediaReq.setMediaObject(moPub);
        
        SalesOrderMediaObjectResponse mediaResp = new SalesOrderMediaObjectResponse();
        
        Fenwal_SalesOrderManager mgr = new Fenwal_SalesOrderManager();
        
        try{
 
            mediaResp = mgr.UpdateSalesOrderMediaObject(mediaReq);
            System.out.println("Media Object is "+mediaResp.getErrorDescription());
            
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
        
        
    }
}
