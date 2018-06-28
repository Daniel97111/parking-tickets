package com.github.daniel97111.Dto;

import com.github.daniel97111.model.Ticket;

import java.time.LocalDateTime;

public class ArrivalDto {
    private Long id;
    private LocalDateTime arrival = LocalDateTime.now();

    public ArrivalDto() {
    }

    public ArrivalDto(Ticket ticket) {
        this.id = ticket.getId();
        this.arrival = ticket.getArrival();
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
    }
}
