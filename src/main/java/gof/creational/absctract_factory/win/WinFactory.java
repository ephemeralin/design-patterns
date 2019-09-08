package gof.creational.absctract_factory.win;

import gof.creational.absctract_factory.Button;
import gof.creational.absctract_factory.Checkbox;
import gof.creational.absctract_factory.GUIFactory;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }

    @Override
    public String showName() {
        return "Windows GUI Factory";
    }
}
