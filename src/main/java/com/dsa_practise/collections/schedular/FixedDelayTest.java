package com.dsa_practise.collections.schedular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class FixedDelayTest {

    @Scheduled(fixedDelay = 5000) // Fixed delay of 5 seconds
    public void fixedDelayTest() {
        try {
            Thread.sleep(2000); // Simulates task execution time of 2 seconds
            System.out.println(System.currentTimeMillis() / 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Set interrupt flag again
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(FixedDelayTest.class, args); // Starts the Spring context and scheduler
    }
}
