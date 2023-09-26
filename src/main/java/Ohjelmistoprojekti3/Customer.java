package Ohjelmistoprojekti3;

public class Customer {
    double arrivalTime;
    int id;
    private static int global_id = 1;
    Customer(double arrivalTime){
        this.id = global_id++;
        this.arrivalTime = arrivalTime;
    }
    public int getId() {
        return id;
    }
    public double getArrivalTime() {
        return arrivalTime;
    }
}
