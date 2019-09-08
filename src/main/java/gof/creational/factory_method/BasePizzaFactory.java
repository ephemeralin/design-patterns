package gof.creational.factory_method;

public abstract class BasePizzaFactory {

    protected abstract void addIngredients(Pizza pizza);

    protected abstract Pizza makeRawPizzaBase();

    protected void bakePizza(Pizza pizza) {
        System.out.println("...pizza baked at 400 for 20 minutes");
        pizza.baked = true;
    }

    public Pizza createPizza() {
        Pizza pizza = makeRawPizzaBase();
        addIngredients(pizza);
        bakePizza(pizza);
        return pizza;
    }
}
