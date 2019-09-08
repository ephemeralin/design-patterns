package gof.creational.factory_method;

public class PepperoniPizzaFactory extends BasePizzaFactory {

    @Override
    protected void addIngredients(Pizza pizza) {
        pizza.ingredients = "pepperoni, chili, tomatoes";
    }

    @Override
    protected Pizza makeRawPizzaBase() {
        System.out.println("...made round row base for pepperoni pizza");
        return new PepperoniPizza();
    }
}
