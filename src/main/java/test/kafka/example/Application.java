package test.kafka.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
    public static void main(String[] args) {
    	logger.info("Starting spring boot....");
    	
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        logger.info("Let's inspect the beans provided by Spring Boot:");

    }

}
