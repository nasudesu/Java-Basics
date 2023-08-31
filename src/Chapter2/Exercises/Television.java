package Chapter2.Exercises;



public class Television {
    int channel = 0;
    boolean isOn = false;
    public void pressOnOff() {
        isOn = true;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public int getChannel() {
        if (channel == 11) {
            channel = 1;
        }
        return channel;
    }
    public boolean isOn() {
        return isOn;
    }
}
