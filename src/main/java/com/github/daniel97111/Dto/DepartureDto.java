package com.github.daniel97111.Dto;

import com.github.daniel97111.model.Ticket;

import java.time.LocalDateTime;

public class DepartureDto {

    private Long id;
    private LocalDateTime departure = LocalDateTime.now();

    public DepartureDto() {
    }


    public DepartureDto(Ticket ticket) {
        this.id = ticket.getId();
        this.departure = ticket.getDeparture();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }


}
