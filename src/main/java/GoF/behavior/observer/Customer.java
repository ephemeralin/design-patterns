package GoF.behavior.observer;


public class Customer implements Subscriber {

    private boolean needVisitShop;

    public Customer() {
        this.needVisitShop = false;
    }

    @Override
    public void update(Object data) {
        String message = (String) data;
        if (message.contains("iPhone 11")) {
            needVisitShop = true;
        }
    }

    public void visitShop() {
        needVisitShop = false;
    }

    public boolean isNeedVisitShop() {
        return needVisitShop;
    }
}
