package gof.behavior.command.command;

import gof.behavior.command.model.Airplane;

public class AirplaneLandCommand implements CommandBase {

    private Airplane airplane;

    public AirplaneLandCommand(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public void execute() {
        if (airplane.isFlying()) {
            airplane.land();
        }
    }

    @Override
    public void undo() {
        if (!airplane.isFlying()) {
            airplane.fly();
        }
    }
}
