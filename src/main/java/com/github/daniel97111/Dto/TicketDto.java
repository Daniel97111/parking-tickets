package com.github.daniel97111.Dto;

import com.github.daniel97111.model.Ticket;

import java.time.LocalDateTime;

public class TicketDto {

    private Long id;
    private LocalDateTime arrival;
    private LocalDateTime departure;

    public TicketDto() {
    }

    public TicketDto(Ticket ticket) {
        this.id = ticket.getId();
        this.arrival = ticket.getArrival();
        this.departure = ticket.getDeparture();
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
