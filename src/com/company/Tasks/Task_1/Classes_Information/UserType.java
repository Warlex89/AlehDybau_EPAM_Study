package com.company.Tasks.Task_1.Classes_Information;

public enum UserType {
    ADMIN("admin"), USER("user");
    private String name;

    UserType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
