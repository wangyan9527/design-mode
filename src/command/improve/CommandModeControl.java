package command.improve;

import java.util.Stack;

public class CommandModeControl implements Control {

    private Command[] onCommands;

    private Command[] offCommands;

    private Stack<Command> commandStack = new Stack<>();

    public CommandModeControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        Command noCommand = new NoCommand();

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot >= 0 && slot < onCommands.length) {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    @Override
    public void onButton(int slot) {
        onCommands[slot].execute();
        commandStack.add(onCommands[slot]);
    }

    @Override
    public void offButton(int slot) {
        offCommands[slot].execute();
        commandStack.add(offCommands[slot]);
    }

    @Override
    public void undo(int slot) {
        commandStack.pop().undo();
    }
}
