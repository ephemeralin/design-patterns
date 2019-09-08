package gof.creational.factory_method;

public class VeggiePizzaFactory extends BasePizzaFactory {

    @Override
    protected void addIngredients(Pizza pizza) {
        pizza.ingredients = "tomatoes, olives, salad, mushrooms";
    }

    @Override
    protected Pizza makeRawPizzaBase() {
        System.out.println("...made round row base for veggie pizza");
        return new VeggiePizza();
    }
}
