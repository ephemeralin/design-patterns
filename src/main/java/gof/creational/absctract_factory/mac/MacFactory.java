package gof.creational.absctract_factory.mac;

import gof.creational.absctract_factory.Button;
import gof.creational.absctract_factory.Checkbox;
import gof.creational.absctract_factory.GUIFactory;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }

    @Override
    public String showName() {
        return "Mac OS GUI Factory";
    }
}
