package com.pluralsight.trakzila.service;

import com.pluralsight.trakzila.entity.Release;

public interface TicketService {
    Iterable<Release> listTickets();
}
