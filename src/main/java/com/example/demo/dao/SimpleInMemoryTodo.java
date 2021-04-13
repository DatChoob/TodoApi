package com.example.demo.dao;

import com.example.demo.models.Todo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleInMemoryTodo implements TodoDao {

    private final List<Todo> todos = new ArrayList<>();

    @Override
    public Todo createTodo(Todo todo) {
        //generate a unique ID to new item see https://docs.oracle.com/javase/8/docs/api/java/util/UUID.html
        //set the created and updated date
        //add new item to current list
        return null;
    }

    @Override
    public List<Todo> getAllTodos() {
        return todos;
    }


    @Override
    public Todo getTodoById(String ID) {
        //search through list for item
        return null;
    }

    @Override
    public Todo updateTodo(Todo todo) {

        //search through list to get item, and update it.
        //update label, status, and updatedDate using "new Date()"

        return null;
    }

    @Override
    public void deleteTodoById(String ID) {
        //find item by id and delete it

    }
}
