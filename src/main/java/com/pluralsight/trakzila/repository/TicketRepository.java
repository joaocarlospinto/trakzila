package com.pluralsight.trakzila.repository;

import com.pluralsight.trakzila.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Release, Long> {
}
