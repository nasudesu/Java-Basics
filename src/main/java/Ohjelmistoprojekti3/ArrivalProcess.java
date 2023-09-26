package Ohjelmistoprojekti3;

import eduni.distributions.Normal;
import java.util.Random;

public class ArrivalProcess {
    private String eventType;
    private Normal randomGenerator;
    private EventList eventList;
    private Clock clock;

    public ArrivalProcess(String eventType, double mean, double variance, EventList eventList, Clock clock) {
        this.eventType = eventType;
        this.randomGenerator = new Normal(mean, variance);
        this.eventList = eventList;
        this.clock = clock;
    }
    public void addArrival() {
        double ran_arrival = randomGenerator.sample();
        clock.advanceTime(ran_arrival);
        Event event = new Event(eventType, clock.getTime());
        eventList.addEvent(event);
    }
    public static void main(String[] args) {

        EventList eventList = new EventList();
        Clock clock = Clock.getInstance();
        ArrivalProcess arrivalProcess = new ArrivalProcess("Arrival", 5.0, 1.0, eventList, clock);

        for (int i = 0; i < 10; i++) {
            arrivalProcess.addArrival();
        }
        //Task4
        eventList.printEvents();
        //Task5
        eventList.addCustomers();
        eventList.printCustomers();
    }
}


