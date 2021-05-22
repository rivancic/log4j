package com.rivancic.springgradlelog4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringGradleLog4jApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringGradleLog4jApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(SpringGradleLog4jApplication.class, args);
    }

    /**
     * Test logging functionality. Should fill in rotation log file with multiple lines debug logging lines.
     */
    @PostConstruct
    public void logDebugLines() {
        try {
            for (int i = 0; i < 200; i++) {
                LOGGER.debug("This is the {} time I say 'Hello World'.", i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
