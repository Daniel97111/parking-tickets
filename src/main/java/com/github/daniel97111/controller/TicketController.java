package com.github.daniel97111.controller;


import com.github.daniel97111.Dto.ArrivalDto;
import com.github.daniel97111.Dto.DepartureDto;
import com.github.daniel97111.Dto.TicketDto;
import com.github.daniel97111.model.Ticket;
import com.github.daniel97111.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/{id}")
    public TicketDto findOneTicketById(@PathVariable Long id) {
        Ticket ticket = ticketService.findTicketByID(id);
        return new TicketDto(ticket);
    }

    @GetMapping
    public Set<Ticket> findAll() {
        return ticketService.showAllTickets();
    }

    @PostMapping("/add")
    public ArrivalDto createTicket(@RequestBody ArrivalDto newTicket) {
        Ticket ticket = ticketService.createNewTicket(newTicket);
        return new ArrivalDto(ticket);
    }

    @PostMapping("/exit")
    public DepartureDto checkExitTicket(@RequestBody DepartureDto exitTicket) {
        Ticket ticket = ticketService.departureTicket(exitTicket);
        return new DepartureDto(ticket);
    }


    @DeleteMapping("/{id}")
    public void deleteTicketById(@PathVariable Long id) {
        ticketService.deleteTicketById(id);
    }


}
