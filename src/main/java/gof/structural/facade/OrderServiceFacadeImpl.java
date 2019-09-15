package gof.structural.facade;

import gof.structural.facade.service.InventoryService;
import gof.structural.facade.service.PaymentService;
import gof.structural.facade.service.Product;
import gof.structural.facade.service.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

    @Override
    public boolean placeOrder(int productId) {
        boolean orderFulfilled = false;
        Product product = new Product();
        product.setId(productId);
        if (InventoryService.isAvailable(product)) {
            System.out.println("Product with ID: " + product.getId() + " is available.");
            boolean paymentConfirmed = PaymentService.makePayment();
            if (paymentConfirmed) {
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled = true;
            }
        }
        return orderFulfilled;
    }
}
