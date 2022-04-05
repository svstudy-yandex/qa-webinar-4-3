package ru.yandex.hw3.service;

import ru.yandex.hw3.model.Epic;
import ru.yandex.hw3.model.Task;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskManager implements TaskManager {
    //private ArrayList<Task> history;
    private final HistoryManager historyManager;

    public InMemoryTaskManager() {
        this.historyManager = Managers.getDefaultHistory();
    }

    public Epic getEpic(long id) {
        // ...
        return null;
    }

    public Epic getSubtask(long id) {
        // ...
        return null;
    }

    public Epic getTask(long id) {
        // ...
        return null;
    }

    //...

    @Override
    public List<Task> getHistory() {
        return historyManager.getHistory();
    }
}
