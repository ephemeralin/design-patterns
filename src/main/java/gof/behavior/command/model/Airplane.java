package gof.behavior.command.model;

/**
 * Receiver.
 */
public class Airplane {

    private boolean flying;

    public void fly() {
        flying = true;
        System.out.println("Airplane is flying");
    }

    public void land() {
        flying = false;
        System.out.println("Airplane has landed");
    }

    public boolean isFlying() {
        return flying;
    }
}
