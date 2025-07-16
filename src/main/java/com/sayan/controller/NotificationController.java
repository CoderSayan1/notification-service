package com.sayan.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    // Example url --> /app/sendMessage
    @MessageMapping("/sendMessage")
    @SendTo("/topic/notification")  // Where to send the message
    public  String sendMessage(String message) {
        System.out.println("Message -> " + message);
        return message;
    }
}
