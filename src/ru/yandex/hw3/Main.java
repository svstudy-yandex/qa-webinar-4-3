package ru.yandex.hw3;

import ru.yandex.hw3.model.Epic;
import ru.yandex.hw3.model.Task;
import ru.yandex.hw3.service.Managers;
import ru.yandex.hw3.service.TaskManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Task task1 = new Task();
        Task task2 = new Task();
        Epic epic1 = new Epic();

        System.out.println(task1.getId());
        System.out.println(task2.getId());
        System.out.println(epic1.getId());
        System.out.println(Task.nextId);

         */

        TaskManager taskManager = Managers.getDefault();
        //..
        List<Task> history = taskManager.getHistory();

    }
}
