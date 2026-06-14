package br.dev.andersongomes;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.togglePower();

        System.out.println(remoteControl);

        Radio radio = new Radio();
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);
        advancedRemoteControl.togglePower();
        advancedRemoteControl.mute();

        System.out.println(advancedRemoteControl);
    }
}
