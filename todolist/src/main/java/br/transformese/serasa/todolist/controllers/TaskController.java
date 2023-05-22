package br.transformese.serasa.todolist.controllers;

import br.transformese.serasa.todolist.models.Task;
import br.transformese.serasa.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("")
    public String getAllTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        Task newTask = new Task();
        model.addAttribute("tasks", tasks);
        model.addAttribute("newTask", newTask);
        return "index";
    }


    @PostMapping("")
    public String createTask(@ModelAttribute("newTask") Task task, Model model) {
        taskService.createNewTask(task);
        return "redirect:/api/v1/tasks";
    }

    
    @GetMapping("/{id}/edit")
    public String editTask(@PathVariable Long id, Model model) {
        Task task = taskService.findTaskById(id);
        if (task == null) {
            throw new IllegalArgumentException("Task not found");
        }
        model.addAttribute("task", task);
        return "edit";
    }

    @PostMapping("/{id}")
    public String updateTask(@PathVariable("id") Long id, @ModelAttribute("Task") Task updatedTask) {
    //Verifing the value of task.id
    System.out.println("Task ID: " + id);
    Task existingTask = taskService.findTaskById(id);
    if (existingTask == null) {
        throw new IllegalArgumentException("Task not found");
    }

    //existingTask.setId(updatedTask.getId());
    existingTask.setTask(updatedTask.getTask());
    existingTask.setDescription(updatedTask.getDescription());
    existingTask.setCompleted(updatedTask.isCompleted());
    taskService.updateTask(existingTask);
    return "redirect:/api/v1/tasks";
}

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/api/v1/tasks";
    }
}