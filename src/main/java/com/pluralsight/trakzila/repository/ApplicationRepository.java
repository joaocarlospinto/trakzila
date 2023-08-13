package com.pluralsight.trakzila.repository;

import com.pluralsight.trakzila.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
