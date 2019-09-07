package gof.creational.factory_method;

public class VeggiePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza");
    }
}
