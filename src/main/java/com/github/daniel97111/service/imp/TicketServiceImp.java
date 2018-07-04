package com.github.daniel97111.service.imp;


import com.github.daniel97111.Dto.ArrivalDto;
import com.github.daniel97111.Dto.DepartureDto;
import com.github.daniel97111.model.Ticket;
import com.github.daniel97111.repository.TicketRepository;
import com.github.daniel97111.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class TicketServiceImp implements TicketService {

    private TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImp(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket findTicketByID(Long id) {
        return ticketRepository.getOne(id);
    }

    @Override
    public Set<Ticket> showAllTickets() {
        return new HashSet<>(ticketRepository.findAll());
    }

    @Override
    public Ticket createNewTicket(ArrivalDto arrivalDto) {
        Ticket ticket = new Ticket();
        ticket.setArrival(arrivalDto.getArrival());
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket departureTicket(DepartureDto departureDto) {
        Ticket ticket = new Ticket();
        ticket.setId(departureDto.getId());
        ticket.setDeparture(departureDto.getDeparture());
        return ticketRepository.save(ticket);
    }


    @Override
    public void deleteTicketById(Long id) {
        ticketRepository.deleteById(id);
    }
}
