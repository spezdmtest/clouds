package com.griddynamics.cloudclientsample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    // обе переменные будут взяты из гита
    // будет взято из application.properties
    @Value("${message.example1}")
    private String messageExample1;

    // будет взято из test-client.properties
    @Value("${message.example2}")
    private String messageExample2;

    public String getMessageExample1() {
        return messageExample1;
    }

    public String getMessageExample2() {
        return messageExample2;
    }
}
