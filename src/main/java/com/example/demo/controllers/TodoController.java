package com.example.demo.controllers;

import com.example.demo.dao.SimpleJdbcDao;
import com.example.demo.models.Todo;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    SimpleJdbcDao simpleJdbcDao;

    @GetMapping
    public List<Todo> getAllTodos() {
        return simpleJdbcDao.getAllTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable("id") String ID) {
        return simpleJdbcDao.getTodoById(ID);
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        if (StringUtils.isNotBlank(todo.getID())) {
            return null;
        }
        Todo todoToCreate = new Todo(todo.getLabel());
        return simpleJdbcDao.createTodo(todoToCreate);

    }


    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable("id") String ID, @RequestBody Todo todo) {

        Todo todoToUpdate = simpleJdbcDao.getTodoById(todo.getID());

        if (todoToUpdate != null) {
            todoToUpdate.setLabel(todo.getLabel());
            todoToUpdate.setStatus(todo.getStatus());
            return simpleJdbcDao.updateTodo(todoToUpdate);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public Todo deleteTodoById(@PathVariable("id") String ID) {
        Todo todoToDelete = simpleJdbcDao.getTodoById(ID);
        if (todoToDelete != null) {
            simpleJdbcDao.deleteTodoById(ID);
            return todoToDelete;
        } else {
            return null;
        }
    }

}
