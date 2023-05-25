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
  
import java.util.List;
  
@Controller
@RequestMapping("/api/v1/tasks")
public class TaskController {
  
    @Autowired
    private TaskService taskService;

    @GetMapping("")
    /*public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTask());
    }*/
    public String getAllTasks(Pageable pageable, Model model) {
        Page<Task> tasks = taskService.getAllTasks(pageable);
        Task newTask = new Task();
        model.addAttribute("tasks", tasks);
        model.addAttribute("newTask", newTask);
        return "index";
    }
    @GetMapping("/completed")
    public ResponseEntity<List<Task>> getAllCompletedTasks() {
        return ResponseEntity.ok(taskService.findAllCompletedTask());
    }
    @GetMapping("/incomplete")
    public ResponseEntity<List<Task>> getAllIncompleteTasks() {
        return ResponseEntity.ok(taskService.findAllInCompleteTask());
    }
    @PostMapping("/")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        return ResponseEntity.ok(taskService.createNewTask(task));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id);
        return ResponseEntity.ok(taskService.updateTask(task));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteTask(@PathVariable Long id) {
    taskService.deleteTask(id);
    return ResponseEntity.ok(true);
    }   
}
