package kidde.e1.bssv.JP564206;

import java.math.BigDecimal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import kidde.e1.bssv.JP564206.valueobject.FenwalLineMediaText;
import kidde.e1.bssv.JP564206.valueobject.FenwalSalesOrderData;
import kidde.e1.bssv.JP564206.valueobject.FenwalSalesOrderRequest;
import kidde.e1.bssv.JP564206.valueobject.FenwalSalesOrderResponse;

import oracle.e1.bssv.JP420000.valueobject.Pricing;
import oracle.e1.bssv.JP420000.valueobject.ProcessSOCustomer;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetail;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetailBilling;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetailProcessing;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetailProduct;
import oracle.e1.bssv.JP420000.valueobject.ProcessSOHeader;
import oracle.e1.bssv.JP420000.valueobject.ProcessSOHeaderProcessing;
import oracle.e1.bssv.JP420000.valueobject.ProcessSalesOrder;
import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssv.util.J4100010.valueobject.ItemGroupCustomer;

public class CreateThreeLineOrder {
    public static void main(String[] args) {
 
        String businessUnit = "49900010";
        String dateOrdered ="12/2/2015";
        
        
        String actionType ="1";
        String e1Version ="P499V003";
        String customerPO ="BT20151210";
        
        String itemProduct ="B15025";
        Integer itemId = new Integer(81145362);

        String itemProduct2 ="B00018.1";
        Integer itemId2 = new Integer(81150882); 
 
        String itemProduct3 ="B00020.1";
        Integer itemId3 = new Integer(81150883); 


        
        Integer soldAN8 = new Integer(70048075);
        Integer shipAN8 = new Integer(70048075);
        
        
        try{        
                
                
            DateFormat sdfmt = new SimpleDateFormat("MM/dd/yy");
            Calendar dOrdered = Calendar.getInstance();
            Date fromd = sdfmt.parse(dateOrdered);
            dOrdered.setTime(fromd);
            
            FenwalSalesOrderRequest soData = new FenwalSalesOrderRequest();
            ProcessSalesOrder e1SO = new ProcessSalesOrder();
            ProcessSOHeader e1Header = new ProcessSOHeader();
            e1Header.setBusinessUnit(businessUnit);
            e1Header.setDateOrdered(dOrdered);
            e1Header.setCustomerPO(customerPO);


            ArrayList aDetails = new ArrayList();
            
// Create the first item            
            ProcessSODetail oneDetail = new ProcessSODetail();            
            oneDetail.setBusinessUnit(businessUnit);
            oneDetail.setDatePromisedShip(dOrdered);
            oneDetail.setDateScheduledPick(dOrdered);
            oneDetail.setDateRequested(dOrdered);
            
            
            ProcessSODetailProduct productDetail = new ProcessSODetailProduct();
            ItemGroupCustomer item = new ItemGroupCustomer();
            //item.setItemProduct(itemProduct);
            item.setItemId(itemId);
            item.setItemUOMPrimary("EA");
            productDetail.setItem(item);
            oneDetail.setProduct(productDetail);
            oneDetail.setQuantityOrdered(new BigDecimal(1.0));
            ProcessSODetailBilling billing = new ProcessSODetailBilling();
            Pricing pricing = new Pricing();
            pricing.setPriceUnitDomestic(new BigDecimal(55.98));
            billing.setPricing(pricing);
            oneDetail.setBilling(billing);
            ProcessSODetailProcessing processing = new ProcessSODetailProcessing();
            processing.setActionType(actionType);
            oneDetail.setProcessing(processing);
            ProcessSOHeaderProcessing processingHeader = new ProcessSOHeaderProcessing();
            processingHeader.setActionType(actionType);
            processingHeader.setProcessingVersion(e1Version);
            e1Header.setProcessing(processingHeader);
            ProcessSOCustomer shipTO = new ProcessSOCustomer();
            Entity shipToCust = new Entity();
            shipToCust.setEntityId(shipAN8);
            shipTO.setCustomer(shipToCust);
            e1Header.setShipTo(shipTO);
            ProcessSOCustomer soldTO = new ProcessSOCustomer();
            Entity soldToCust = new Entity();
            soldToCust.setEntityId(soldAN8);
            soldTO.setCustomer(soldToCust);
            e1Header.setSoldTo(soldTO);


// Create the second item            
            ProcessSODetail twoDetail = new ProcessSODetail();            
            twoDetail.setBusinessUnit(businessUnit);
            twoDetail.setDatePromisedShip(dOrdered);
            twoDetail.setDateScheduledPick(dOrdered);
            twoDetail.setDateRequested(dOrdered);
            
            
            ProcessSODetailProduct productDetail2 = new ProcessSODetailProduct();
            ItemGroupCustomer item2 = new ItemGroupCustomer();
            //item.setItemProduct(itemProduct);
            item2.setItemId(itemId2);
            item2.setItemUOMPrimary("EA");
            productDetail2.setItem(item2);
            twoDetail.setProduct(productDetail2);
            twoDetail.setQuantityOrdered(new BigDecimal(1.0));
            ProcessSODetailBilling billing2 = new ProcessSODetailBilling();
            Pricing pricing2 = new Pricing();
            pricing2.setPriceUnitDomestic(new BigDecimal(55.98));
            billing2.setPricing(pricing2);
            twoDetail.setBilling(billing2);
            ProcessSODetailProcessing processing2 = new ProcessSODetailProcessing();
            processing2.setActionType(actionType);
            twoDetail.setProcessing(processing2);


// Create the third item            
            ProcessSODetail thirdDetail = new ProcessSODetail();            
            thirdDetail.setBusinessUnit(businessUnit);
            thirdDetail.setDatePromisedShip(dOrdered);
            thirdDetail.setDateScheduledPick(dOrdered);
            thirdDetail.setDateRequested(dOrdered);
            
            
            ProcessSODetailProduct productDetail3 = new ProcessSODetailProduct();
            ItemGroupCustomer item3 = new ItemGroupCustomer();
            //item.setItemProduct(itemProduct);
            item3.setItemId(itemId3);
            item3.setItemUOMPrimary("EA");
            productDetail3.setItem(item3);
            thirdDetail.setProduct(productDetail3);
            thirdDetail.setQuantityOrdered(new BigDecimal(1.0));
            ProcessSODetailBilling billing3 = new ProcessSODetailBilling();
            Pricing pricing3 = new Pricing();
            pricing3.setPriceUnitDomestic(new BigDecimal(55.98));
            billing3.setPricing(pricing3);
            thirdDetail.setBilling(billing3);
            ProcessSODetailProcessing processing3 = new ProcessSODetailProcessing();
            processing3.setActionType(actionType);
            thirdDetail.setProcessing(processing3);



            aDetails.add(oneDetail);
            aDetails.add(twoDetail);
            aDetails.add(thirdDetail);
            ProcessSODetail[] detail = new ProcessSODetail[3];
            aDetails.toArray(detail);


            e1Header.setDetail(detail);
            e1SO.setHeader(e1Header);
            
            
            FenwalSalesOrderData fenwalSOData = new FenwalSalesOrderData();
            
            
            ArrayList moArray = new ArrayList();
            FenwalLineMediaText[] mediaText = new FenwalLineMediaText[2];
            
            FenwalLineMediaText moText = new FenwalLineMediaText();
            moText.setItemId(itemId);
            moText.setItemProduct(itemProduct);
            moText.setMediaTextMessage("Eric is testing the line media object from jdeveloper");
 
            FenwalLineMediaText moText2 = new FenwalLineMediaText();
            moText2.setItemId(itemId3);
            moText2.setItemProduct(itemProduct3);
            moText2.setMediaTextMessage("Eric is testing the second value media object from jdeveloper");            
            
            moArray.add(moText);
            moArray.add(moText2);
            moArray.toArray(mediaText);
            
            fenwalSOData.setMediaTextMessage(mediaText);
            fenwalSOData.setHeaderText("Eric is Testing from Client");
            fenwalSOData.setEdwardsShipTo(new Integer(70048075));
            fenwalSOData.setUserPIN("12345");
            fenwalSOData.setAppliedFreightCode("Y");
            
            soData.setFenwalSOData(fenwalSOData);
            soData.setJDESalesOrderData(e1SO);
            
            
            
            FenwalSalesOrderResponse resp = new FenwalSalesOrderResponse();
            
            Fenwal_SalesOrderManager mgr = new Fenwal_SalesOrderManager();
            
            resp = mgr.CreateSalesOrder(soData);
            
            

            System.out.println("Successfully called service");               
                
            System.out.println("Document Number "+resp.getDocumentOrderNoInvoiceetc());    
                
                
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
        
        
        
        
        
        }
 
 
 
 
 
 
}
