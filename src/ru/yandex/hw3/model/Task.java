package ru.yandex.hw3.model;

public class Task {
    public static int nextId = 1;
    private int id;

    public Task() {
        id = nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
