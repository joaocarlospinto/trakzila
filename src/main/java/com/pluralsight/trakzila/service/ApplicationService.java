package com.pluralsight.trakzila.service;

import com.pluralsight.trakzila.entity.Application;

public interface ApplicationService {
    Iterable<Application> listApplications();
}
