package com.pluralsight.trakzila.service;

import com.pluralsight.trakzila.entity.Release;
import com.pluralsight.trakzila.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Iterable<Release> listTickets() {
        return ticketRepository.findAll();
    }

}
