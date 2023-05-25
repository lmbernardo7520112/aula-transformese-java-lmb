package br.transformese.serasa.todolist.services;

import br.transformese.serasa.todolist.models.Task;
import br.transformese.serasa.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
  
import java.util.List;
  
@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
      
    public Task createNewTask(Task task) {
        return taskRepository.save(task);
    }
      
    /*public List<Task> getAllTask() {
        return taskRepository.findAll();
    }*/
    public Page<Task> getAllTasks(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }
      
    public Task findTaskById(Long id) {
        return taskRepository.getById(id);
    }
      
    public List<Task> findAllCompletedTask() {
        return taskRepository.findByCompletedTrue();
    }
      
    public List<Task> findAllInCompleteTask() {
        return taskRepository.findByCompletedFalse();
    }
      
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
      
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }
}
