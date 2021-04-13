package com.example.demo.dao;

import com.example.demo.models.Todo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimpleJdbcDao implements TodoDao {

    @Override
    public Todo createTodo(Todo todo) {
        return null;
    }

    @Override
    public List<Todo> getAllTodos() {

        //SEE https://www.javatpoint.com/steps-to-connect-to-the-database-in-java
        //SEE https://www.javatpoint.com/example-to-connect-to-the-mysql-database
        //see application.properties for the jdbcUrl, username and password
        return null;
    }

    @Override
    public Todo getTodoById(String ID) {
        return null;
    }

    @Override
    public Todo updateTodo(Todo todo) {
        return null;
    }

    @Override
    public void deleteTodoById(String ID) {

    }


}
