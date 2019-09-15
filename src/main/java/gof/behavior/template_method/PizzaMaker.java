package gof.behavior.template_method;

public abstract class PizzaMaker {

    public void makePizza() {
        preparePizzaDough();
        preBakeCrust();
        prepareIngredients();
        addToppings();
        bakePizza();
        if (customerWantsPackedPizza()) {
            packPizza();
        }
    }

    final void preBakeCrust() {
        System.out.println("Pre baking crust at 325 F for 3 minutes.");
    }

    final void preparePizzaDough() {
        System.out.println("Preparing pizza dough with plain flour, dried yeast, caster sugar, salt, olive oil, and warm water.");
    }

    abstract void prepareIngredients();

    abstract void addToppings();

    //hook method
    void bakePizza() {
        System.out.println("Baking pizza at 400 F for 12 minutes.");
    }

    //hook method
    void packPizza() {
        System.out.println("Packing pizza in pizza delivery box.");
    }

    //hook method
    boolean customerWantsPackedPizza() {
        return true;
    }
}
