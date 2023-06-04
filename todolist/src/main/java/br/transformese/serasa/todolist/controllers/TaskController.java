package br.transformese.serasa.todolist.controllers;

import br.transformese.serasa.todolist.models.PageWrapper;
import br.transformese.serasa.todolist.models.Task;
import br.transformese.serasa.todolist.services.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String getIndexPage(
        @RequestParam(required = false, defaultValue = "") String status,
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "5") int size,
        Model model
    ) {
        int validPage = Math.max(0, page - 1); // Ensure page is not less than zero
        Pageable pageable = PageRequest.of(validPage, size);
        Page<Task> tasks;

        if (!status.isEmpty()) {
            tasks = taskService.getTasksByStatus(status, pageable);
        } else {
            tasks = taskService.getAllTasks(pageable);
        }

        Task newTask = new Task();
        PageWrapper<Task> pageWrapper = new PageWrapper<>(tasks, "/tasks/");
        model.addAttribute("page", pageWrapper);
        model.addAttribute("newTask", newTask);
        model.addAttribute("status", status);

        return "index";
    }


    @GetMapping
    public String getAllTasks(@RequestParam(required = false) String status, Pageable pageable, Model model) {
        Page<Task> tasks;
            if (status != null && !status.isEmpty()) {
                tasks = taskService.getTasksByStatus(status, pageable);
            } else {
                tasks = taskService.getAllTasks(pageable);
    }

        Task newTask = new Task();
        PageWrapper<Task> pageWrapper = new PageWrapper<>(tasks, "/tasks/");
        model.addAttribute("page", pageWrapper);
        model.addAttribute("newTask", newTask);
        return "index";
    }

    /*private void getTasksByStatus(String status, Pageable pageable) {
       
    }*/

    @PostMapping
    public String createTask(@ModelAttribute("newTask") Task task) {
        taskService.createNewTask(task);
        return "redirect:/tasks/";
    }

    

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Task task = taskService.findTaskById(id);
        model.addAttribute("task", task);
        return "edit";
    }



    @PostMapping("/{id}")
    public String updateTask(@PathVariable("id") Long id, @ModelAttribute("task") Task updatedTask) {
        Task existingTask = taskService.findTaskById(id);
            if (existingTask == null) {
                throw new IllegalArgumentException("Task not found");
            }
                existingTask.setTask(updatedTask.getTask());
                existingTask.setCompleted(updatedTask.isCompleted());
                existingTask.setStatus(updatedTask.getStatus());
                existingTask.setDescription(updatedTask.getDescription());
                taskService.updateTask(id, existingTask); 
                return "redirect:/tasks/";
    }


    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks/";
    }
}





