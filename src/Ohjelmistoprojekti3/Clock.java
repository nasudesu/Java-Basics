package Ohjelmistoprojekti3;
import eduni.distributions.*;

public class Clock {

    private double time;
    private static Clock INSTANCE = null;
    private Clock() {}
    public static Clock getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Clock();
        }
        return INSTANCE;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public double getTime() {
        return time;
    }
}
