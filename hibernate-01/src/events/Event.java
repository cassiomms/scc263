package events;

import java.util.*;

public class Event {
    private Long id;
    private String title;
    private Date date;

    // Hibernate obriga tal m�todo com construtor vazio
    // Ele utiliza Reflection API para criar objetos, por
    // isso necessita desse construtor
    public Event() {} 
    public Long getId() { return id; }
    private void setId(Long id) { this.id = id; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}
