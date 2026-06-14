package br.dev.andersongomes;

public class Tv implements Device {
    private boolean enabled;
    private int volume;
    private int channel;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "enabled=" + enabled +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
