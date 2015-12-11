package kidde.e1.bssv.JP564200;

import java.math.BigDecimal;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;

import java.util.Date;

import kidde.e1.bssv.JP564200.valueobject.ConfirmSalesOrderKidde;
import kidde.e1.bssv.JP564200.valueobject.KiddeSalesOrderCommission;
import kidde.e1.bssv.JP564200.valueobject.KiddeSalesOrderData;
import kidde.e1.bssv.JP564200.valueobject.ProcessSalesOrderKidde;

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

public class TestKiddeSalesOrder {
    public static void main(String[] args) {
        String businessUnit = "49900010";
        //String businessUnit = "10000030";
        String dateOrdered ="10/03/2015";
        //String itemProduct = "SIGA-PS";
        String itemProduct ="B15025";
        String actionType ="1";
       // String e1Version ="P100V036";
        String e1Version = "P499V003";
        String customerPO ="eric1022";
        Integer itemId = new Integer(81145362);
        Integer soldAN8 = new Integer(70048075);
        Integer shipAN8 = new Integer(70048075);
        
        try{
                
            DateFormat sdfmt = new SimpleDateFormat("MM/dd/yy");
            Calendar dOrdered = Calendar.getInstance();
            Date fromd = sdfmt.parse(dateOrdered);
            dOrdered.setTime(fromd);
            
            ProcessSalesOrderKidde soData = new ProcessSalesOrderKidde();
            ProcessSalesOrder e1SO = new ProcessSalesOrder();
            ProcessSOHeader e1Header = new ProcessSOHeader();
            e1Header.setBusinessUnit(businessUnit);
            e1Header.setDateOrdered(dOrdered);
            e1Header.setCustomerPO(customerPO);
            ProcessSODetail oneDetail = new ProcessSODetail();
            ArrayList aDetails = new ArrayList();            
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


            aDetails.add(oneDetail);
            ProcessSODetail[] detail = new ProcessSODetail[1];
            aDetails.toArray(detail);


            e1Header.setDetail(detail);
            e1SO.setHeader(e1Header);
            KiddeSalesOrderData kiddeSOData = new KiddeSalesOrderData();
            KiddeSalesOrderCommission oneCommission = new KiddeSalesOrderCommission();
            KiddeSalesOrderCommission[] relationData = new KiddeSalesOrderCommission[1];
            oneCommission.setRelation(new BigDecimal(25));
            oneCommission.setRelationCode("505-60");
            ArrayList aCommission = new ArrayList();
            aCommission.add(oneCommission);
            aCommission.toArray(relationData);
           
            
            kiddeSOData.setRelationData(relationData);
            kiddeSOData.setRouteCode("3");
            kiddeSOData.setHeaderText("Eric is Testing from Client");
            soData.setKiddeSalesOrder(kiddeSOData);
            soData.setE1SalesOrder(e1SO);
            
            ConfirmSalesOrderKidde confirm = new ConfirmSalesOrderKidde();
            Kidde_SalesOrderManager mgr = new Kidde_SalesOrderManager();
            
            confirm = mgr.processSalesOrder(soData);
            System.out.println("Successfully called service");
            
        }catch(Exception exp){
            System.out.println("Error  "+exp.getMessage());
        }
        
        
        
        
        
    }
}
