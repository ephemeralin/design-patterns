package gof.behavior.template_method;

public class InHouseAssortedPizzaMaker extends PizzaMaker {
    @Override
    void prepareIngredients() {
        System.out.println("Preparing sweet corns,chicken sausage, green chillies, and onions.");
    }

    @Override
    void addToppings() {
        System.out.println("Adding cheddar cheese and  bechamel sauce along with ingredients to crust.");
    }

    @Override
    boolean customerWantsPackedPizza() {
        return false;
    }
}
