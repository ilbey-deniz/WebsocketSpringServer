package com.example.websocketspringserver.controller;

import com.example.websocketspringserver.dto.InnerDto;
import com.example.websocketspringserver.dto.TestDto;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class ChatController {
    @MessageMapping("/news")
    @SendTo("/app/news")
    public String broadcastNews(@Payload String message) throws InterruptedException {
        //log to console
        System.out.println(message);
        Thread.sleep(1000);
        return message;
    }
    @MessageMapping("/test")
    @SendTo({"/app/test"})
    public TestDto broadcastTest(@Payload TestDto testDto) throws InterruptedException {
        //log to console
        System.out.println(testDto.toString());
        Thread.sleep(1000);
        return testDto;
    }

}
