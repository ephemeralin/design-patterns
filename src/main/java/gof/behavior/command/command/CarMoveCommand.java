package gof.behavior.command.command;

import gof.behavior.command.model.Car;

public class CarMoveCommand implements CommandBase {

    private Car car;

    public CarMoveCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.move();
    }

    @Override
    public void undo() {
        if (car.isMoving()) {
            car.stop();
        }
    }
}
