package org.example.homework.four.mydz.ex4;

public class Message {
    private String text;
    private Type type;
    private String name;

    public Message(String text, Type type, String name) {
        this.text = text;
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Message{"
                + "text='" + text + '\''
                + ", type=" + type
                + ", name='" + name + '\''
                + '}';
    }
}
