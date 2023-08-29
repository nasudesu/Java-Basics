package Ohjelmistoprojekti1;

public class Customer {
    private static int global_id = 1;
    long start_time;
    long end_time;
    int id;

    Customer(long start_time, long end_time) {
        this.id = global_id++;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public long getStart_time() {
        return this.start_time;
    }
    public long getEnd_time() {
        return end_time;
    }
    public void setEnd_time(long end_time) {
        this.end_time = end_time;
    }
    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }
    public int getId() {
        return id;
    }
}
