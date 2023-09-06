package Ohjelmistoprojekti3;
import eduni.distributions.*;

public class Clock1 {

    private double time;
    private static Clock1 INSTANCE = null;
    private Clock1() {}
    public static Clock1 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Clock1();
        }
        return INSTANCE;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public double getTime() {
        return time;
    }

    public class Main {
        public static void main(String[] args) {

            Normal normal = new Normal(5.0,1.0);
            System.out.println(normal.sample());

            Clock1 clock = Clock1.getInstance();
            clock.setTime(12.45);
            System.out.println(clock.getTime());
        }
    }
}
