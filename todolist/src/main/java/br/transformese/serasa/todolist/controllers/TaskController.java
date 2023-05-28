package br.transformese.serasa.todolist.controllers;

import br.transformese.serasa.todolist.models.PageWrapper;
import br.transformese.serasa.todolist.models.Task;
import br.transformese.serasa.todolist.services.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
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
    public String getIndexPage(Model model, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size) {
        int validPage = Math.max(0, page - 1); // Ensure page is not less than zero
        Pageable pageable = PageRequest.of(validPage, size);
        Page<Task> tasks = taskService.getAllTasks(pageable);
        Task newTask = new Task();
        PageWrapper<Task> pageWrapper = new PageWrapper<>(tasks, "/tasks/");
        model.addAttribute("page", pageWrapper);
        model.addAttribute("newTask", newTask);
        return "index";
    }

    @GetMapping
    public ResponseEntity<Page<Task>> getAllTasks(Pageable pageable) {
        Page<Task> tasks = taskService.getAllTasks(pageable);
        return ResponseEntity.ok(tasks);
    }

    @PostMapping
    public String createTask(@ModelAttribute("newTask") Task task) {
        taskService.createNewTask(task);
        return "redirect:/tasks/";
    }

    /*@PutMapping("/{id}/edit")
    public String updateTask(@PathVariable Long id, @RequestBody Task task) {
       taskService.updateTask(id, task);
        return "edit";
    }*/

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Task task = taskService.findTaskById(id);
        model.addAttribute("task", task);
        return "edit";
    }

    
    /*@PutMapping("/{id}/edit")
    public String updateTask(@PathVariable Long id, @ModelAttribute("task") Task task) {
        taskService.updateTask(id, task);
        return "redirect:/tasks/";
    }*/

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





