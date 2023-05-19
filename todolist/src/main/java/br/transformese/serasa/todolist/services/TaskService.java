package br.transformese.serasa.todolist.services;

import br.transformese.serasa.todolist.models.Task;
import br.transformese.serasa.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createNewTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public Task findTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> findAllCompletedTask() {
        return taskRepository.findByCompletedTrue();
    }

    public List<Task> findAllIncompleteTask() {
        return taskRepository.findByCompletedFalse();
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }
}
