package gof.behavior.command.command;

import gof.behavior.command.model.Airplane;

public class AirplaneFlyCommand implements CommandBase {

    private Airplane airplane;

    public AirplaneFlyCommand(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public void execute() {
        if (!airplane.isFlying()) {
            airplane.fly();
        }
    }

    @Override
    public void undo() {
        if (airplane.isFlying()) {
            airplane.land();
        }
    }
}
