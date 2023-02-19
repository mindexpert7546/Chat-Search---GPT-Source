package com.mdp.chatsearch_gptsource;

public class Message {

    public static String SEND_BY_ME = "me";
    public static String SEND_BY_BOT = "bot";

    String message;
    String sentByMe;

    // getter and setter are created for message and sentByMe
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentBy() {
        return sentByMe;
    }

    public void setSentBy(String sentBy) {
        this.sentByMe = sentBy;
    }

    public Message(String message, String sentBy) {
        this.message = message;
        this.sentByMe = sentBy;
    }
}
