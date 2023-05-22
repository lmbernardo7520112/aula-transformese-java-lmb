package br.transformese.serasa.todolist.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String task;
    private String description;
    private boolean completed;

    public Task() {
    }

    public Task(String task, boolean completed) {
        this.task = task;
        this.completed = completed;
    }

        // Getter and Setter methods for task, description, and completed properties
        /*public Long getTaskId(Long long) {
            return id;
        }*/

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }
    
        
        public String getTask() {
            return task;
        }
    
        public void setTask(String string) {
            this.task = string;
        }
    
        public String getDescription() {
            return description;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
    
        public boolean isCompleted() {
            return completed;
        }
    
        public void setCompleted(boolean completed) {
            this.completed = completed;
        }

        /*public void getTaskId(Object id2) {
        }*/
}