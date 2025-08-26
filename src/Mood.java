import java.time.LocalDate;
import java.time.LocalTime;

public class Mood{
    private String name;
    private String notes;
    private LocalDate date = LocalDate.now();
    private LocalTime time = LocalTime.MIDNIGHT;

    public Mood(String name){
        this.name = name;
    }

    public Mood(String name, LocalDate date){
        this.name = name;
        this.date = date;
    }

    public Mood(String name, LocalDate date, LocalTime time){
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public Mood(String name, String notes){
        this.name = name;
        this.notes = notes;
    }

    public Mood(String name, LocalDate date, String notes){
        this.name = name;
        this.date = date;
        this.notes = notes;
    }

    public Mood(String name, LocalDate date, LocalTime time, String notes){
        this.name = name;
        this.date = date;
        this.time = time;
        this.notes = notes;
    }

    public String getName(){
        return name;
    }

    public String getNotes(){
        return notes;
    }

    public LocalDate getDate(){
        return date;
    }

    public LocalTime getTime(){
        return time;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public void setTime(LocalTime time){
        this.time = time;
    }

    public String toString() {
        return name + " - " + date + " " + time + "\n" +notes;
    }

    public boolean equals(String name,LocalDate date,LocalTime time,String notes){
        if(name == this.name && date == this.date &&
           time == this.time && notes == this.notes){
            return true;
           }
           return false;
    }

}