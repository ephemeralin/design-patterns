package gof.structural.facade;

public class OrderFulfillmentController {

    private OrderServiceFacade facade;
    private boolean orderFulfilled = false;

    public OrderFulfillmentController(OrderServiceFacade facade) {
        this.facade = facade;
    }

    public void orderProduct(int productId) {
        orderFulfilled = facade.placeOrder(productId);
        System.out.println("OrderFulfillmentController: Order fulfillment completed. ");
    }
}
