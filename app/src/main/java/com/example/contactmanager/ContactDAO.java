package com.example.contactmanager;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ContactDAO {

@Insert
    void insertContact(Contacts contact);

@Delete
    void deleteContact(Contacts contact);

@Query("SELECT * FROM contacts_table")
    LiveData<List<Contacts>> getAllContacts();
}
