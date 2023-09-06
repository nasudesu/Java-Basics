package Ohjelmistoprojekti3;

public class Event {
    private String type;
    private double time;
    public Event(String type, double time) {
        this.type = type;
        this.time = time;
    }
    public String getType() {
        return type;
    }
    public double getTime() {
        return time;
    }
}
