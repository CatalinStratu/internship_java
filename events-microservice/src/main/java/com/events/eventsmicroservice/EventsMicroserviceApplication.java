package com.events.eventsmicroservice;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@EnableMongoAuditing
@EnableMongock
@SpringBootApplication
@EnableEurekaClient
public class EventsMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventsMicroserviceApplication.class, args);
    }

}
