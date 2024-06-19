package org.kviat.taskmanager.core;

import org.kviat.taskmanager.data.Task;

import java.util.ArrayList;
import java.util.List;


public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

}