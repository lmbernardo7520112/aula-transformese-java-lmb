package br.transformese.serasa.todolist.controllers;

import br.transformese.serasa.todolist.models.Task;
import br.transformese.serasa.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    public String getIndexPage(Model model, Pageable pageable) {
        Page<Task> tasks = taskService.getAllTasks(pageable);
        Task newTask = new Task();
        model.addAttribute("tasks", tasks);
        model.addAttribute("newTask", newTask);
        return "index";
    }

    @GetMapping
    public ResponseEntity<Page<Task>> getAllTasks(Pageable pageable) {
        Page<Task> tasks = taskService.getAllTasks(pageable);
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/completed")
    public ResponseEntity<Page<Task>> getAllCompletedTasks(Pageable pageable) {
        Page<Task> tasks = taskService.getAllCompletedTasks(pageable);
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/incomplete")
    public ResponseEntity<Page<Task>> getAllIncompleteTasks(Pageable pageable) {
        Page<Task> tasks = taskService.getAllIncompleteTasks(pageable);
        return ResponseEntity.ok(tasks);
    }

    @PostMapping("/")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task newTask = taskService.createNewTask(task);
        return ResponseEntity.ok(newTask);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
        Task updatedTask = taskService.updateTask(id, task);
        return ResponseEntity.ok(updatedTask);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.ok(true);
    }
}

