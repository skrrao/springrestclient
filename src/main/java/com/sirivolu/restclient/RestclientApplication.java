package com.sirivolu.restclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class RestclientApplication {


    public static void main(String[] args) {
        SpringApplication.run(RestclientApplication.class, args);
    }

    @GetMapping("gethelloworld")
    public String getHelloWorld() {
        RestTemplate template = new RestTemplate();
        String myString=null;
        myString = template.getForObject("http://35.188.237.159:8080/helloworld", String.class);
        return myString;
    }

}

