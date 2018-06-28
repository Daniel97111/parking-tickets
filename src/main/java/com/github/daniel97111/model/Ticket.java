package com.github.daniel97111.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime arrival;

    private LocalDateTime departure;

    @OneToOne
    private Car car;

    public Ticket() {
    }

    public Ticket(LocalDateTime arrival, LocalDateTime departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }
}
