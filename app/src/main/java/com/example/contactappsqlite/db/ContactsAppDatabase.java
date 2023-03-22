package com.example.contactappsqlite.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.contactappsqlite.db.entity.Contact;

@Database(entities = {Contact.class}, version = 1)
public abstract class ContactsAppDatabase extends RoomDatabase {

    // Linking the DAO with Db
    public abstract ContactDAO getContactDAO();
}
