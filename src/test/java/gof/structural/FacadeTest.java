package gof.structural;

import gof.structural.facade.OrderServiceFacade;
import gof.structural.facade.OrderServiceFacadeImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FacadeTest {

    @Test
    public void placeOrderTest() {
        OrderServiceFacade facade = new OrderServiceFacadeImpl();
        boolean orderFulfilled = facade.placeOrder(1);
        assertTrue(orderFulfilled);
    }
}