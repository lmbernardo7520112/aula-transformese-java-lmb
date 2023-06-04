package br.transformese.serasa.todolist.services;

import br.transformese.serasa.todolist.models.Task;
import br.transformese.serasa.todolist.repositories.TaskRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

    public Page<Task> getAllTasks(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }

    

    public Task findTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }


    public Task updateTask(Long id, Task task) {
        return taskRepository.save(task);
    }

    public Page<Task> getTasksByStatus(String status, Pageable pageable) {
        //return (Page<Task>) taskRepository.findByStatus(status);
        // Retrieve tasks by status from the repository
    List<Task> tasks = taskRepository.findByStatus(status);
    
    // Create a Page object using the retrieved tasks and pageable information
    int start = (int) pageable.getOffset();
    int end = Math.min((start + pageable.getPageSize()), tasks.size());
    Page<Task> page = new PageImpl<>(tasks.subList(start, end), pageable, tasks.size());

    return page;
    }

    
}

