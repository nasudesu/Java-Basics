package Ohjelmistoprojekti2;

public class Event {
    private Eventtype eventType;
    private static int Event = 1;
    int Event_num;
    long start_time;
    long end_time;
    Event() {
        this.Event_num = Event++;
        this.start_time = System.currentTimeMillis();
        this.eventType = Eventtype.ARRIVAL;
    }
    public long end_time() {
        end_time = System.currentTimeMillis();
        return (end_time - start_time) / 1000;
    }
    public void upDateEventType() {
        this.eventType = Eventtype.EXITING;
    }
    public Eventtype getEventType() {
        return eventType;
    }
}
