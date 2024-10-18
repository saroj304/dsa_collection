package com.dsa_practise.collections.schedular;

import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
@EnableScheduling
public class CronExpressionTest {
    @Scheduled(cron = "*/5 * * * * *")
    public void cronExpression() {
        try {
            System.out.println(System.currentTimeMillis() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        SpringApplication.run(CronExpressionTest.class, args);
    }
}
