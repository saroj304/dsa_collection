package com.dsa_practise.collections.schedular;
import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
public class FixedRateTest {
    @Scheduled(fixedRate = 5000)

    public void fixedRateTest() {
        try {
            Thread.sleep(2000);
            System.out.println(System.currentTimeMillis() / 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(FixedRateTest.class, args);
    }
}
