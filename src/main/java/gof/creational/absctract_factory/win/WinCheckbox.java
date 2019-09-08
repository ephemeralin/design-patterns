package gof.creational.absctract_factory.win;

import gof.creational.absctract_factory.Checkbox;

public class WinCheckbox implements Checkbox {

    public WinCheckbox() {
        System.out.println("Created a checkbox in Windows style.");
    }

    @Override
    public void render() {
        System.out.println("Rendered a checkbox in Windows style");
    }
}
