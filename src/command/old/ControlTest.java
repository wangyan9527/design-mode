package command.old;

public class ControlTest {

    public static void main(String[] args) {
        Light light = new Light("bedroom");
        Stereo stereo = new Stereo();

        TraditionControl traditionControl = new TraditionControl(light, stereo);
        traditionControl.onButton(0);
        traditionControl.offButton(0);

        traditionControl.onButton(2);
        traditionControl.offButton(2);
    }

}
