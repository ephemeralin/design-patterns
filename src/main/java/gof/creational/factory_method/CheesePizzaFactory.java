package gof.creational.factory_method;

public class CheesePizzaFactory extends BasePizzaFactory {

    @Override
    protected void addIngredients(Pizza pizza) {
        pizza.ingredients = "camembert cheese, mozzarella cheese, rockford cheese";
    }

    @Override
    protected Pizza makeRawPizzaBase() {
        System.out.println("...made round row base for cheese pizza");
        return new CheesePizza();
    }
}
