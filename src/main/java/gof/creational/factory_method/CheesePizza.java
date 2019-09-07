package gof.creational.factory_method;

public class CheesePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza");
    }
}
