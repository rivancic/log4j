package com.rivancic.springgradlelog4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringGradleLog4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGradleLog4jApplication.class, args);
    }

    private static Logger logger = LoggerFactory.getLogger(SpringGradleLog4jApplication.class.getName());

    @PostConstruct
    public void postConstruct() {
        try {
            for(int i = 0; i < 200; i++) {
                logger.debug("This is the " + i + " time I say 'Hello World'.");

                    Thread.sleep(100);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
