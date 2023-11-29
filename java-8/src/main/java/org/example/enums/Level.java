package org.example.enums;

public enum Level {
    EASY("Easy"),
    NORMAL("Normal"),
    HARD("Hard");

    private String value;

    Level(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
