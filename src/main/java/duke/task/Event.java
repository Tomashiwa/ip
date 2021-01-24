package duke.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    /** Date and time when the Event task starts */
    private LocalDateTime start;
    /** Date and time when the Event task ends */
    private LocalDateTime end;

    /**
     * Constructor for an Event task
     * @param desc Description of the task
     * @param start Date and time when the task starts
     * @param end Date and time when the task ends
     */
    public Event(String desc, LocalDateTime start, LocalDateTime end) {
        super(desc, false);
        this.start = start;
        this.end = end;
    }

    /**
     * Alternate constructor for an Event task whereby you can indicate the completion status of the task
     * @param desc Description of the task
     * @param start Date and time when the task starts
     * @param end Date and time when the task ends
     * @param isDone Completion status of the task
     */
    public Event(String desc, LocalDateTime start, LocalDateTime end, boolean isDone) {
        super(desc, isDone);
        this.start = start;
        this.end = end;
    }

    /**
     * Returns the description of the Event
     * @return Description of the Event
     */
    @Override
    public String getDesc() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM, EEE ha");
        return this.desc + " (Start: " + this.start.format(formatter) + " | End: " + this.end.format(formatter) + ")";
    }

    /**
     * Returns a letter symbol for the Event
     * @return Letter symbol for the Event
     */
    @Override
    public String getTypeSymbol() {
        return "E";
    }

    /**
     * Returns the Event's details in a format to be saved into the hard disk
     * @return Event's detail in a savable format
     */
    @Override
    public String toSaveInfoString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy ha");
        return this.getTypeSymbol() + " | " + (this.isDone ? "1" : "0") + " | " + this.desc + " | " +
                this.start.format(formatter) + " | " + this.end.format(formatter);
    }
}
