package kidde.e1.bssv.JP564200.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.JP420000.valueobject.ProcessSalesOrder;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ProcessSalesOrderKidde extends ValueObject implements Serializable {

    KiddeSalesOrderData KiddeSalesOrder = new KiddeSalesOrderData();

    ProcessSalesOrder E1SalesOrder = new ProcessSalesOrder();

    /**
     * TODO: Default public constructor for instantiating: ProcessSalesOrderKidde
     */
    public ProcessSalesOrderKidde() {
    }


    public void setKiddeSalesOrder(KiddeSalesOrderData KiddeSalesOrder) {
        this.KiddeSalesOrder = KiddeSalesOrder;
    }

    public KiddeSalesOrderData getKiddeSalesOrder() {
        return KiddeSalesOrder;
    }

    public void setE1SalesOrder(ProcessSalesOrder E1SalesOrder) {
        this.E1SalesOrder = E1SalesOrder;
    }

    public ProcessSalesOrder getE1SalesOrder() {
        return E1SalesOrder;
    }
}
