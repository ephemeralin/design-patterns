package gof.behavior.command.command;

import gof.behavior.command.model.Car;

public class CarStopCommand implements CommandBase {

    private Car car;

    public CarStopCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        if (car.isMoving()) {
            car.stop();
        }
    }

    @Override
    public void undo() {
        car.move();
    }
}
