package gof.behavior;

import gof.behavior.observer.Customer;
import gof.behavior.observer.Shop;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObserverTest {

    @Test
    public void SubscribeUnsubscribeTest() {
        Shop shop = new Shop();
        Customer firstCustomer = new Customer();
        Customer secondCustomer = new Customer();
        Customer thirdCustomer = new Customer();

        shop.subscribe(firstCustomer);
        shop.subscribe(secondCustomer);
        shop.notifySubscribers("iPhone 11 has been released! You can buy it");

        assertTrue(firstCustomer.isNeedVisitShop());
        assertTrue(secondCustomer.isNeedVisitShop());
        assertFalse(thirdCustomer.isNeedVisitShop());
        assertEquals(shop.getSubscribers().size(), 2);

        shop.unsubscribe(secondCustomer);
        assertEquals(shop.getSubscribers().size(), 1);
    }

}