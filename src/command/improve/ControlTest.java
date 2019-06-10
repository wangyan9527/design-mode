package command.improve;

public class ControlTest {

    public static void main(String[] args) {
        CommandModeControl control = new CommandModeControl();
        MarcoCommand onMarco, offMarco;
        Light bedroomLight = new Light("BedRoom");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();

        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        /**
         * 组合命令
         */
        Command[] onCommands = {bedroomLightOn, kitchenLightOn};
        Command[] offCommands = {bedroomLightOff, kitchenLightOff};
        onMarco = new MarcoCommand(onCommands);
        offMarco = new MarcoCommand(offCommands);


        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereOff = new StereoOffCommand(stereo);
        StereoAddVolCommand stereoAddVol = new StereoAddVolCommand(stereo);
        StereoSubVolCommand stereoSubCol = new StereoSubVolCommand(stereo);

        /**
         * 命令与控制器匹配
         */
        control.setCommand(0, bedroomLightOn, bedroomLightOff);
        control.setCommand(1, kitchenLightOn, kitchenLightOff);
        control.setCommand(2, stereoOn, stereOff);
        control.setCommand(3, stereoAddVol, stereoSubCol);
        control.setCommand(4, onMarco, offMarco);

        /**
         * 执行命令
         */
        System.out.println("-----命令-----");
        control.onButton(0);
//        control.offButton(0);
        control.undo(0);

        control.onButton(1);
        control.offButton(1);

        System.out.println("-----组合命令-----");
        control.onButton(4);
        control.undo(4);

    }
}
