package gof.behavior.state;

public class NoCandyState implements MachineState {

    CandyMachine machine;

    public NoCandyState(CandyMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("No candies available");
    }

    @Override
    public void pressButton() {
        System.out.println("No candies available");
    }

    @Override
    public void dispense() {
        System.out.println("No candies available");
    }

    @Override
    public String toString() {
        return "NoCandyState";
    }
}
