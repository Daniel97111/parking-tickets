package com.github.daniel97111.service;


import com.github.daniel97111.Dto.ArrivalDto;
import com.github.daniel97111.Dto.DepartureDto;
import com.github.daniel97111.Dto.TicketDto;
import com.github.daniel97111.model.Ticket;

import java.util.Set;

public interface TicketService {

    Ticket findTicketByID(Long id);

    Set<Ticket> showAllTickets();

    Ticket createNewTicket(ArrivalDto arrivalDto);

    Ticket departureTicket(DepartureDto departureDto);

    void deleteTicketById(Long id);
}
