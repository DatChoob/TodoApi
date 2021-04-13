package com.example.demo.dao;

import com.example.demo.models.Todo;

import java.util.List;

public interface TodoDao {

    Todo createTodo(Todo todo);

    List<Todo> getAllTodos();

    Todo getTodoById(String ID);

    Todo updateTodo(Todo todo);

    void deleteTodoById(String ID);

}
