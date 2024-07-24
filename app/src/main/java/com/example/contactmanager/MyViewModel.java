package com.example.contactmanager;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MyViewModel extends AndroidViewModel {

    private Repository myRepository;

    public MyViewModel(@NonNull Application application) {
        super(application);
        this.myRepository = new Repository(application);
    }

    public void insertContact(Contacts contact){
        myRepository.insertContact(contact);
    }


    public void deleteContact(Contacts contact){
        myRepository.deleteContact(contact);
    }

    public LiveData<List<Contacts>> getAllContacts(){
        return myRepository.getAllContacts();
    }
}
