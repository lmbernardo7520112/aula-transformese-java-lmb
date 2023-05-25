---
title: Task Model 📝
---

The `Task` model represents a task in the Todo List application. It is an entity class annotated with `@Entity` to be mapped to a database table. The model contains properties such as task name, description, completion status, and status.

```java
package br.transformese.serasa.todolist.models;

// Import statements...

@Entity
@Getter
@Setter
public class Task {
    // Model code...
}
