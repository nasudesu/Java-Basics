package Ohjelmistoprojekti3;
import eduni.distributions.*;
public class Main {
    public static void main(String[] args) {

        Normal normal = new Normal(5.0,1.0);
        System.out.println(normal.sample());

        Clock clock = Clock.getInstance();
        clock.setTime(12.45);
        System.out.println(clock.getTime());
    }
}
