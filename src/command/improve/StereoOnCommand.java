package command.improve;

/**
 * 音响的打开命令
 */
public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
