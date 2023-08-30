package Ohjemistoprojekti2;

public class Event {
    private static int Event = 0;
    int Event_num;
    long start_time;
    long end_time;
    Event() {
        this.Event_num = Event++;
        this.start_time = System.currentTimeMillis();
    }
    public long end_time() {
        end_time = System.currentTimeMillis();
        return end_time - start_time;
    }

}
