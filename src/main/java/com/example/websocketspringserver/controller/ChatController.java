package com.example.websocketspringserver.controller;

import com.example.websocketspringserver.dto.InnerDto;
import com.example.websocketspringserver.dto.TestDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class ChatController {
    @MessageMapping("/news")
    @SendTo("/topic/news")
    public String broadcastNews(@Payload String message) {
        return message;
    }
    @MessageMapping("/test")
    @SendTo("/topic/test")
    public TestDto broadcastTest(@Payload TestDto testDto) {
        return testDto;
    }

    @MessageMapping("/greetings")
    @SendToUser("/queue/greetings")
    public String reply(@Payload String message,
                        Principal user) {
        return  "Hello " + message;
    }


}
