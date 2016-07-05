package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootappApplication.class, args);
    }

    @RestController
    static class Bootjava8Controller {

        @RequestMapping("/")
        public ResponseEntity<String> bootjava8() {
            return ResponseEntity.ok("I'm running on OPENSHIFT");
        }

    }

}
