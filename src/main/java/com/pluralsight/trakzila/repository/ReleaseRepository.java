package com.pluralsight.trakzila.repository;

import com.pluralsight.trakzila.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
