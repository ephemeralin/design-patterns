package gof.creational.absctract_factory.mac;

import gof.creational.absctract_factory.Checkbox;

public class MacCheckbox implements Checkbox {

    public MacCheckbox() {
        System.out.println("Created a checkbox in macOS style.");
    }

    @Override
    public void render() {
        System.out.println("Render a checkbox in macOS style.");
    }
}
