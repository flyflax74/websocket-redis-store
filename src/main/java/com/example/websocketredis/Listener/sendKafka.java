package com.example.websocketredis.Listener;

import com.example.websocketredis.dto.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
@Component
public class sendKafka {
    @Autowired
    SimpMessagingTemplate template;
    @KafkaListener(
            topics = "likelion",
            groupId = "groupId"
    )
    public void listen(ChatMessage message) {
        System.out.println("sending via kafka listener..");
        template.convertAndSend("/topic", message);
    }

}
