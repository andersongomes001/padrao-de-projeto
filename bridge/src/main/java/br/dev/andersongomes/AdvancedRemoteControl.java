package br.dev.andersongomes;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

    @Override
    public String toString() {
        return "AdvancedRemoteControl{" +
                "device=" + device +
                '}';
    }
}
