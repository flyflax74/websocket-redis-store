package com.example.websocketredis.dto;

import com.example.websocketredis.enumf.MessageType;
import lombok.Data;

@Data
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;

    private String timestamp;

    // constructors, getters and setters
}