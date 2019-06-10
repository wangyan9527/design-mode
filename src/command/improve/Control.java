package command.improve;

public interface Control {

    void onButton(int slot);

    void offButton(int slot);

    void undo(int slot);
}
