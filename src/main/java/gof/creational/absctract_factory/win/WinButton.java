package gof.creational.absctract_factory.win;

import gof.creational.absctract_factory.Button;

public class WinButton implements Button {

    public WinButton() {
        System.out.println("Created a button in Windows style.");
    }

    @Override
    public void render() {
        System.out.println("Rendered a button in Windows style.");
    }
}
