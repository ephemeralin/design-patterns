package gof.structural.facade;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OrderServiceFacadeImplTest {

    @Test
    public void placeOrderTest() {
        OrderServiceFacade facade = new OrderServiceFacadeImpl();
        boolean orderFulfilled = facade.placeOrder(1);
        assertTrue(orderFulfilled);
    }
}