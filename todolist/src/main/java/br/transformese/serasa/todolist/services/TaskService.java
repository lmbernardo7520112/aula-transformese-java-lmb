package br.transformese.serasa.todolist.services;

import br.transformese.serasa.todolist.models.Task;
import br.transformese.serasa.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

    /*public Page<Task> getAllCompletedTasks(Pageable pageable) {
        return taskRepository.findByCompletedTrue(pageable);
    }

    public Page<Task> getAllIncompleteTasks(Pageable pageable) {
        return taskRepository.findByCompletedFalse(pageable);
    }

    public Page<Task> getAllTasksCompleted(Pageable pageable) {
        return taskRepository.findByCompletedTrue(pageable);
    }

    public Page<Task> getAllTasksIncomplete(Pageable pageable) {
        return taskRepository.findByCompletedFalse(pageable);
    }*/

    public Task findTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public Task updateTask(Long id, Task task) {
        Task existingTask = findTaskById(id);
        if (existingTask != null) {
            existingTask.setTask(task.getTask());
            existingTask.setCompleted(task.isCompleted());
            return taskRepository.save(existingTask);
        }
        return null;
    }
}

