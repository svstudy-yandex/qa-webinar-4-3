package ru.yandex.hw3.service;

import ru.yandex.hw3.model.Task;

import java.util.List;

public class InMemoryHistoryManager implements HistoryManager {
    private static final int MAX_HISTORY_COUNT = 10;
    @Override
    public List<Task> getHistory() {
        //...
        return null;
    }

    @Override
    public void add(Task task) {

    }
}
