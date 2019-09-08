package gof.creational;

import gof.creational.factory_method.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactoryMethodTest {

    @Test
    public void factoryMethodCheesePizzaTest() {
        BasePizzaFactory pizzaFactory = new CheesePizzaFactory();
        Pizza pizza = pizzaFactory.createPizza();
        System.out.println(pizza);
        assertThat(pizza.toString(),
                is("Baked Cheese pizza with camembert cheese, mozzarella cheese, rockford cheese"));
    }

    @Test
    public void factoryMethodPepperoniPizzaTest() {
        BasePizzaFactory pizzaFactory = new PepperoniPizzaFactory();
        Pizza pizza = pizzaFactory.createPizza();
        System.out.println(pizza);
        assertThat(pizza.toString(),
                is("Baked Pepperoni pizza with pepperoni, chili, tomatoes"));
    }

    @Test
    public void factoryMethodVeggiePizzaTest() {
        BasePizzaFactory pizzaFactory = new VeggiePizzaFactory();
        Pizza pizza = pizzaFactory.createPizza();
        System.out.println(pizza);
        assertThat(pizza.toString(),
                is("Baked Veggie pizza with tomatoes, olives, salad, mushrooms"));
    }
}
