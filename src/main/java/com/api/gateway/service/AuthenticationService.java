package com.api.gateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthenticationService {

    @Autowired
    RestTemplate restTemplate;

    static final String HTTP_USER_SERVICE = "user-service";

    public void Register(){

        ResponseEntity<String> response = restTemplate.postForEntity( HTTP_USER_SERVICE+ "user/", User.class);


    }



}
