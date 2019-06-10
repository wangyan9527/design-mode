package command.improve;

public class Stereo {

    private static int volume = 0;

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setCd() {
        System.out.println("Stereo SetCd");
    }

    public void setVol(int vol) {
        volume = vol;
        System.out.println("Stereo volume=" + volume);
    }

    public int getVol() {
        return volume;
    }

    public void start() {
        System.out.println("Stereo start");
    }

}
