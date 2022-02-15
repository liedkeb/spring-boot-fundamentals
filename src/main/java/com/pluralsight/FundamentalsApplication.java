package com.pluralsight;

import com.pluralsight.entity.Application;
import com.pluralsight.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.pluralsight")
public class FundamentalsApplication {
    private static final Logger log = LoggerFactory.getLogger(FundamentalsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FundamentalsApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ApplicationRepository repository) {
        return (args -> {
            repository.save(new Application("Trackzilla", "b.liedke", "test"));
            repository.save(new Application("test1", "desc1", "test"));
            repository.save(new Application("test2", "desc2", "test"));

            for (Application application : repository.findAll()) {
                log.info("The application is: " + application.toString());
            }
        });
    }

}
