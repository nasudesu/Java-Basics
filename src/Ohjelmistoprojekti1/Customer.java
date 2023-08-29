package Ohjelmistoprojekti1;

public class Customer {
    private static int global_id = 1;
    long start_time;
    long end_time;
    int id;

    Customer() {
        this.id = global_id++;
        this.start_time = System.currentTimeMillis();
    }
    public long getStart_time() {
        return this.start_time;
    }
    public long getEnd_time() {
        end_time = System.currentTimeMillis();
        return end_time;
    }
    public int getId() {
        return id;
    }
}