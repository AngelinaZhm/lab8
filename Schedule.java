import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Event> events;

    public Schedule() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Event> getEventsByDate(LocalDate date) {
        List<Event> eventsByDate = new ArrayList<>();
        for (Event event : events) {
            if (event.getDateTime().toLocalDate().equals(date)) {
                eventsByDate.add(event);
            }
        }
        return eventsByDate;
    }

    public void removePastEvents() {
        for (int i = 0; i < events.size(); i++) {
            Event event = events.get(i);
            if (event.getDateTime().isBefore(LocalDateTime.now())) {
                events.remove(i);
                i--;
            }
        }
    }

    public void printAllEvents() {
        if (events.isEmpty()) {
            System.out.println("Розклад порожній");
        } else {
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }
}
