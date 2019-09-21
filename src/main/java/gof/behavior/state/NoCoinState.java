package gof.behavior.state;

public class NoCoinState implements MachineState {

    CandyMachine machine;

    public NoCoinState(CandyMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        machine.setState(machine.containsCoinState);
    }

    @Override
    public void pressButton() {
        System.out.println("No coin inserted!");
    }

    @Override
    public void dispense() {
        System.out.println("No coin inserted!");
    }

    @Override
    public String toString() {
        return "NoCoinState";
    }
}
