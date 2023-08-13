package com.pluralsight.trakzila;

import com.pluralsight.trakzila.entity.Application;
import com.pluralsight.trakzila.entity.Release;
import com.pluralsight.trakzila.entity.Ticket;
import com.pluralsight.trakzila.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrakzilaApplication {
	private static final Logger log = LoggerFactory.getLogger(TrakzilaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TrakzilaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			repository.save(new Application("BDT","joao.pinto","Best app."));
			repository.save(new Application("AAA","manuel.couves","Terrible app."));
			repository.save(new Application("XXX","fernanda.bacalhau","So-So app."));





			for (Application application : repository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
	}

}
