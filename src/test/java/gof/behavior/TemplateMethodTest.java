package gof.behavior;

import gof.behavior.template_method.InHouseAssortedPizzaMaker;
import gof.behavior.template_method.PizzaMaker;
import org.junit.Test;

public class TemplateMethodTest {

    @Test
    public void testMakePizza() {
        System.out.println("-----Making In-House Assorted Pizza-----");
        PizzaMaker inHouseAssortedPizzaMaker = new InHouseAssortedPizzaMaker();
        inHouseAssortedPizzaMaker.makePizza();
    }
}