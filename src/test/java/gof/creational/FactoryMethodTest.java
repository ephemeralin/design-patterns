package gof.creational;

import gof.creational.factory_method.BasePizzaFactory;
import gof.creational.factory_method.Pizza;
import gof.creational.factory_method.PizzaFactory;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void factoryMethodTest() {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}
