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

    @Autowired
    private TaskService taskService;

    

    @GetMapping("")
    public String getAllTasks(Model model) {
        List<Task> tasks = taskService.getAllTask();
        Task newTask = new Task();
        model.addAttribute("tasks", tasks);
        model.addAttribute("newTask", newTask);
        //model.addAttribute("newTask", new Task());
        return "index";
    }

    @GetMapping("/")
    public String index(@ModelAttribute("newTask") Task newTask) {
        return "index";
    }

    @PostMapping("")
    public String createTask(Task task, Model model) {
        taskService.createNewTask(task);
        model.addAttribute("newTask", task);
        return "redirect:/api/v1/tasks";
    }

    @GetMapping("/{id}/edit")
    public String editTask(@PathVariable Long id, Model model) {
        Task task = taskService.findTaskById(id);
        model.addAttribute("task", task);
        return "edit";
    }

    @PostMapping("/{id}")
    public String updateTask(@PathVariable Long id, @ModelAttribute("task") Task task) {
        taskService.updateTask(task);
        return "redirect:/api/v1/tasks";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/api/v1/tasks";
    }
}