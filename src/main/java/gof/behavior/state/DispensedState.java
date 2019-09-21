package gof.behavior.state;

public class DispensedState implements MachineState {

    CandyMachine machine;

    public DispensedState(CandyMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Error. System is currently dispensing");
    }

    @Override
    public void pressButton() {
        System.out.println("Error. System is currently dispensing");
    }

    @Override
    public void dispense() {
        if (machine.count > 0) {
            machine.setState(machine.noCoinState);
            machine.count = machine.count - 1;
        } else {
            System.out.println("No candies available");
            machine.setState(machine.noCandyState);
        }
    }

    @Override
    public String toString() {
        return "DispensedState";
    }
}
