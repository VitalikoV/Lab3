package com.company.Task3;

public class Subject {
    private String name;
    private int maxMark;

    public Subject(String name, int maxMark) {
        this.name = name;
        this.maxMark = maxMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(int maxMark) {
        this.maxMark = maxMark;
    }
}
