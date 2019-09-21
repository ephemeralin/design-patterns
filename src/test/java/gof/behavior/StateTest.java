package gof.behavior;

import gof.behavior.state.CandyMachine;
import org.junit.Test;

public class StateTest {

    @Test
    public void insertCoinAndPressButtonTest() {
        System.out.println("-----Test 1: Testing machine by inserting coin and pressing button-----");
        CandyMachine machine = new CandyMachine(3);
        System.out.println(machine);
        machine.insertCoin();
        System.out.println(machine);
        machine.pressButton();
        System.out.println(machine);
    }

    @Test
    public void pressButtonWithoutCointestTest() {
        System.out.println("-----Test 2: Testing machine by pressing button without inserting coin-----");
        CandyMachine machine2 = new CandyMachine(3);
        System.out.println(machine2);
        machine2.pressButton();
        System.out.println(machine2);
    }

    @Test
    public void runOutOfCandiesTest() {
        System.out.println("-----Test 3: Testing machine running out of candies-----");
        CandyMachine machine3 = new CandyMachine(3);
        System.out.println(machine3);
        machine3.insertCoin();
        machine3.pressButton();
        machine3.insertCoin();
        machine3.pressButton();
        machine3.insertCoin();
        machine3.pressButton();
        machine3.insertCoin();
        machine3.pressButton();
        System.out.println(machine3);
    }
}