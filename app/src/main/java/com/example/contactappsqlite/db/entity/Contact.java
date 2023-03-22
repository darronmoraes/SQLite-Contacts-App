package com.example.contactappsqlite.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "contacts")
public class Contact {

    // database constants
    /*public static final String TABLE_NAME = "contacts";
    public static final String COLUMN_ID = "contact_id";
    public static final String COLUMN_NAME = "contact_name";
    public static final String COLUMN_EMAIL = "contact_email";*/

    // variables
    @ColumnInfo(name = "contact_name")
    private String name;
    @ColumnInfo(name = "contact_email")
    private String email;
    @ColumnInfo(name = "contact_id")
    @PrimaryKey(autoGenerate = true)
    private int id;

    // Constructor
    // 1 - empty
    @Ignore
    public Contact() {}

    // 2 - parameterized
    public Contact(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    // getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // SQL Query: create table
    /*public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "( "
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_NAME + " TEXT,"
            + COLUMN_EMAIL + " DATETIME DEFAULT CURRENT_TIMESTAMP"
            + ")";*/
}
