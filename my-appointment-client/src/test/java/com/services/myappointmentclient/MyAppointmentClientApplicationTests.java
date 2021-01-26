package com.services.myappointmentclient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@SpringBootTest
class MyAppointmentClientApplicationTests {

    @Test
    void getMappingTest() {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println(restTemplate);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8080/greeting", String.class);
        System.out.println(responseEntity);

    }
    @Test
    void postMappingTest(){
        RestTemplate restTemplate = new RestTemplate();
        System.out.println(restTemplate);
        HttpEntity<String> request = new HttpEntity<String>("Mick");
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://localhost:8080/add", request,String.class);
        System.out.println(responseEntity);
    }


}
