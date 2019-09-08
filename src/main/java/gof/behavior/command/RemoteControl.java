package gof.behavior.command;

import gof.behavior.command.command.CommandBase;

public class RemoteControl {

    private CommandBase onCommand;
    private CommandBase offCommand;
    private CommandBase undoCommand;

    public RemoteControl(CommandBase onCommand, CommandBase offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void onButtonPressed() {
        onCommand.execute();
        undoCommand = onCommand;
    }

    public void offButtonPressed() {
        offCommand.execute();
        undoCommand = offCommand;
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }
}
