package br.transformese.serasa.todolist.repositories;

import br.transformese.serasa.todolist.models.Task;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Page<Task> findByCompletedTrue(Long id, Pageable pageable);

    Page<Task> findByCompletedFalse(Long id, Pageable pageable);

    Task findByTask(String task);

    List<Task> findByStatus(String status);
    /*static List<Task> getAllTasks(Pageable pageable) {
        return null;
    }*/
}

