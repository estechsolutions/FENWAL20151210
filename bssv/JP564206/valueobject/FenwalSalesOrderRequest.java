package kidde.e1.bssv.JP564206.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.JP420000.valueobject.ProcessSalesOrder;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class FenwalSalesOrderRequest extends ValueObject implements Serializable {

    ProcessSalesOrder JDESalesOrderData = new ProcessSalesOrder();
    
    FenwalSalesOrderData FenwalSOData = new FenwalSalesOrderData();


    public void setJDESalesOrderData(ProcessSalesOrder JDESalesOrderData) {
        this.JDESalesOrderData = JDESalesOrderData;
    }

    public ProcessSalesOrder getJDESalesOrderData() {
        return JDESalesOrderData;
    }

    public void setFenwalSOData(FenwalSalesOrderData FenwalSOData) {
        this.FenwalSOData = FenwalSOData;
    }

    public FenwalSalesOrderData getFenwalSOData() {
        return FenwalSOData;
    }
}
