package com.example.architectureexample;

import androidx.room.PrimaryKey;
import androidx.room.Entity;
import androidx.room.ColumnInfo;

@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;

    private String description;

    @ColumnInfo(name = "Prio")
    private int priority;

    //constructor to create Note objects.
    //Room needs a constructor to recreate them from the database.
    //id is automatically generated so we pass it later.
    //if we miss any field, Room CANNOT LATER BE RECREATED!!
    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
