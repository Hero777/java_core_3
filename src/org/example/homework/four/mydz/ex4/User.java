package org.example.homework.four.mydz.ex4;

public class User {
    private String name;
    private String password;
    private Message[] messages;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.messages = new Message[100];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Message[] getMessages() {
        return messages;
    }

    public void setMessages(Message[] messages) {
        this.messages = messages;
    }
}
