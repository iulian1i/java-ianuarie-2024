package curs.curs23;

public class Agenda<Event> {

    public Event tip;

    public void notat(Event event) {
        System.out.println(event);
    }

    /**
     * Getter
     */
    public Event getEvent() {
        return tip;
    }

    /**
     * Setter
     */
    public void setTip(Event event) {
        this.tip = event;
    }

}
