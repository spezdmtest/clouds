package com.griddynamics.cloudclientsample_v2.cloudclientsample_v2.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Value("news-client")
    private String appName;

    @Value("${message.example1}")
    private String messageExample1;

    @Value("${message.example2}")
    private String messageExample2;

    public String getMessageExample1() {
        return "From " + appName + " -> " + messageExample1;
    }

    public String getMessageExample2() {
        return "From " + appName + " -> " + messageExample2;

    }
}
