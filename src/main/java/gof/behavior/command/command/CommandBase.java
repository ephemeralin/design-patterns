package gof.behavior.command.command;

/**
 * Command.
 */
public interface CommandBase {

    void execute();

    void undo();
}
