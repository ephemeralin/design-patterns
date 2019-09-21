package gof.behavior.state;

public class CandyMachine {

    MachineState noCoinState;
    MachineState noCandyState;
    MachineState dispensedState;
    MachineState containsCoinState;
    MachineState state;
    int count;

    public CandyMachine(int numberOfCandies) {
        this.count = numberOfCandies;
        this.noCoinState = new NoCoinState(this);
        this.noCandyState = new NoCandyState(this);
        this.dispensedState = new DispensedState(this);
        this.containsCoinState = new ContainsCoinState(this);
        this.state = noCoinState;
    }

    public void refillCandy(int count) {
        this.count += count;
    }

    public void ejectCandy() {
        if (count != 0) {
            count--;
        }
    }

    public void insertCoin() {
        System.out.println("You inserted a coin.");
        state.insertCoin();
    }

    public void pressButton() {
        System.out.println("You have pressed the button.");
        state.pressButton();
        state.dispense();
    }

    @Override
    public String toString() {
        return "Current state of machine " + state + ". Candies available " + count;
    }

    public void setState(MachineState state) {
        this.state = state;
    }
}
