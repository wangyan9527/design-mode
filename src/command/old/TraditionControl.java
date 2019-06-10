package command.old;

/**
 * 这样设计对扩展开放，同时也对修改开放，在进行功能扩展时必须修改代码
 */
public class TraditionControl implements Control {

    Light light;
    Stereo stereo;

    public TraditionControl(Light light, Stereo stereo) {
        this.light = light;
        this.stereo = stereo;
    }

    @Override
    public void onButton(int slot) {
        switch (slot) {
            case 0:
                light.on();
                break;
            case 1:
                stereo.on();
                break;
            case 2:
                int vol = stereo.getVol();
                if (vol < 12) {
                    stereo.setVol(++vol);
                }
                break;
        }
    }

    @Override
    public void offButton(int slot) {
        switch (slot) {
            case 0:
                light.off();
                break;
            case 1:
                stereo.off();
                break;
            case 2:
                int vol = stereo.getVol();
                if (vol > 0) {
                    stereo.setVol(--vol);
                }
                break;
        }
    }
}
