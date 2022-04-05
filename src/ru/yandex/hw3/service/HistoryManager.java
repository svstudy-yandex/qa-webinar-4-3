package ru.yandex.hw3.service;

import ru.yandex.hw3.model.Task;

import java.util.List;

public interface HistoryManager {
    List<Task> getHistory();
    void add(Task task);
}
