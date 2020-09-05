package com.example.qa.bottles;

import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.logging.Logger;

/*
IN THE DIR OF THE application
mvn install
java -jar /home/qa/Documents/Java_Assessment/bottles/target/notes.jar
OR
mvn -Dmaven.test.skip=true spring-boot:run
 */
@SpringBootApplication
public class BottlesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BottlesApplication.class, args);
    }

}
