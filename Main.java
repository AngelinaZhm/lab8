
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        Event event1 = new Event("Випускний", LocalDateTime.of(2025,6,8,17,30),"Стрий, Вілла грей");
        Event event2 = new Event("Змагання", LocalDateTime.of(2024,9,23,9,0), "Ужгород, СК Зінедін");
        Event event3 = new Event("Екзамен", LocalDateTime.of(2025,1,17,14,30), "Львів, БЖД");

        schedule.addEvent(event1);
        schedule.addEvent(event2);
        schedule.addEvent(event3);

        System.out.println("Всі заходи: ");
        schedule.printAllEvents();

        LocalDate filterDate = LocalDate.of(2024,9,23);
        System.out.println("Заходи на " + filterDate + ": ");
        schedule.getEventsByDate(filterDate).forEach(System.out::println);

        schedule.removePastEvents();

        System.out.println("Оновлений список заходів:");
        schedule.printAllEvents();

    }
}