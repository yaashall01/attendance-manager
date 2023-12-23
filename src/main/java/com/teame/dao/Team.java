package com.teame.dao;

public enum Team {
    JAVA("Java"),
    DOTNET("DotNet");

    private String name;

    Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
