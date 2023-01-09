package com.griddynamics.cloudclientusers.controller;

import com.griddynamics.cloudclientusers.message.MessageService;
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
    private String getMessage1() {
        return messageService.getMessageExample1();
    }

    @GetMapping("/message2")
    private String getMessage2() {
        return messageService.getMessageExample2();
    }
}
