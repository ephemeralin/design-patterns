package gof.creational;

import gof.creational.absctract_factory.Application;
import gof.creational.absctract_factory.GUIFactory;
import gof.creational.absctract_factory.mac.MacFactory;
import gof.creational.absctract_factory.win.WinFactory;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void macApplicationTest() {
        GUIFactory factory = new MacFactory();
        Application application = new Application(factory);
        application.createUI();
        application.render();
    }

    @Test
    public void winApplicationTest() {
        GUIFactory factory = new WinFactory();
        Application application = new Application(factory);
        application.createUI();
        application.render();
    }

}