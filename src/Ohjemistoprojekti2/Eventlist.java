package Ohjemistoprojekti2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Eventlist {
    LinkedList<Event> events = new LinkedList<>();
    public void setEvent() {
        events.add(new Event());
        System.out.println("Added new event ID: "+events.getLast().Event_num+" Type: "+events.getLast().getEventType());
    }
    public void getEvents() {
        for (int i = 0; i < events.size(); i++) {
            System.out.println("Event ID: "+events.get(i).Event_num);
            System.out.println("Event Type: "+events.get(i).getEventType());
            System.out.println("Queue time: "+events.get(i).end_time()+" Sec");
        }
    }
    public void removeEvent() {
        Event event = events.poll();
        assert event != null;
        event.upDateEventType();
        System.out.println("Removed event ID: "+event.Event_num);
        System.out.println("Event type: "+event.getEventType());
    }
    public void checkIfempty() {
        if (events.isEmpty()) {
            System.out.println("Event list is empty");
        }
    }
}
