package gof.behavior.state;

public class ContainsCoinState implements MachineState {

    CandyMachine machine;

    public ContainsCoinState(CandyMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted!");
    }

    @Override
    public void pressButton() {
        machine.setState(machine.dispensedState);
    }

    @Override
    public void dispense() {
        System.out.println("Press button to dispense");
    }

    @Override
    public String toString() {
        return "ContainsCoinState";
    }
}
