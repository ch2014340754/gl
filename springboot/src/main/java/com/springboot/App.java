package com.springboot;

import com.fasterxml.jackson.core.format.DataFormatDetector;
import javafx.application.Application;
import org.apache.tomcat.jni.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@EnableAutoConfiguration
@RestController
public class App {
    public static void main(String[] args) {
        String  name = null;
        for (int i = 0; i < 100; i++) {
            if (name != null) {
            }
        }
    }

}
