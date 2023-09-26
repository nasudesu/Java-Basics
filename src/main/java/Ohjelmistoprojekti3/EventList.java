package Ohjelmistoprojekti3;
import java.util.ArrayList;
import java.util.List;

public class EventList {
    Customer customer;
    private ArrayList<Event> events = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    public void addEvent(Event event) {
        events.add(event);
    }
    public void printEvents() {
        for (Event event : events) {
            System.out.println("Event Type: " + event.getType() + ", Time: " + event.getTime());
        }
    }
    public void addCustomers(){
        for (Event event : events) {
            double spentTime = event.getTime();
            customers.add(new Customer(spentTime));
        }
    }
    public void printCustomers(){
        for (Customer customer : customers) {
            System.out.println("Customer: "+customer.getId()+" total time spent: "+customer.getArrivalTime());
        }
    }
}
