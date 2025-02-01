package com.app.todoapp.controllers;

import com.app.todoapp.models.Task;
import com.app.todoapp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        System.out.println("Tasks List Debug: " + tasks);

        if (tasks.isEmpty()) {
            System.out.println("No tasks found!");
        } else {
            for (Task task : tasks) {
                System.out.println("Task ID: " + task.getId() + ", Title: " + task.getTitle());
            }
        }
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}