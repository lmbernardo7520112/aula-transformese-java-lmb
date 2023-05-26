package br.transformese.serasa.todolist.repositories;

import br.transformese.serasa.todolist.models.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Page<Task> findByCompletedTrue(Pageable pageable);

    Page<Task> findByCompletedFalse(Pageable pageable);

    /*static List<Task> getAllTasks(Pageable pageable) {
        return null;
    }*/
}

