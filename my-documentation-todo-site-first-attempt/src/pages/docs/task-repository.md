---
title: TaskRepository 💾
---

The `TaskRepository` interface defines database operations for tasks. It extends the `JpaRepository` interface, providing basic CRUD operations for the `Task` entity. Additionally, it includes custom query methods to retrieve tasks based on different criteria.

```java
package br.transformese.serasa.todolist.repositories;

// Import statements...

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Repository code...
}
