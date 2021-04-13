package com.example.demo.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
public class Todo {

    public Todo(String label) {
        this.label = label;
        this.status= "IN-PROGRESS";
    }

    private String ID;
    private String label; //what is the name of this item
    private String status; // Completed, In-Progress,  Deleted
    private Date dateCreated;
    private Date dateUpdated;
}
