package com.example.chatbot;

public class ChatsModal {

    private String message;
    public String sender;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public ChatsModal(String message, String sender) {
        this.message = message;
        this.sender = sender;
    }
}
