package gof.behavior;

import gof.behavior.command.RemoteControl;
import gof.behavior.command.command.*;
import gof.behavior.command.model.Airplane;
import gof.behavior.command.model.Car;
import org.junit.Test;

public class CommandTest {

    @Test
    public void CarRemoteControlTest() {
        Car car = new Car();
        CommandBase carMoveCommand = new CarMoveCommand(car);
        CommandBase carStopCommand = new CarStopCommand(car);
        RemoteControl remoteControl = new RemoteControl(carMoveCommand, carStopCommand);

        remoteControl.onButtonPressed();
        car.showCurrentSpeed();
        remoteControl.offButtonPressed();
        car.showCurrentSpeed();
        remoteControl.undoButtonPressed();
        car.showCurrentSpeed();
        remoteControl.onButtonPressed();
        car.showCurrentSpeed();
        remoteControl.onButtonPressed();
        car.showCurrentSpeed();
    }

    @Test
    public void AirplaneRemoteControlTest() {
        Airplane airplane = new Airplane();
        CommandBase airplaneFlyCommand = new AirplaneFlyCommand(airplane);
        CommandBase landCommand = new AirplaneLandCommand(airplane);
        RemoteControl remoteControl = new RemoteControl(airplaneFlyCommand, landCommand);

        remoteControl.onButtonPressed();
        remoteControl.offButtonPressed();
    }
}