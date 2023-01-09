package com.griddynamics.cloudclientsample.controller;

import com.griddynamics.cloudclientsample.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final MessageService messageService;

    @Autowired
    public MainController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/message1")
    public String getMessage1() {
        return messageService.getMessageExample1();
    }

    @GetMapping("/message2")
    public String getMessage2() {
        return messageService.getMessageExample2();
    }
}
