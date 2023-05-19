package br.transformese.serasa.todolist.repositories;

import br.transformese.serasa.todolist.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByTask(String task);
    List<Task> findByCompletedTrue();
    List<Task> findByCompletedFalse();
}
