package gof.creational.absctract_factory.mac;

import gof.creational.absctract_factory.Button;

public class MacButton implements Button {

    public MacButton() {
        System.out.println("Created a button in macOS style.");
    }

    @Override
    public void render() {
        System.out.println("Render a button in macOS style.");
    }
}
