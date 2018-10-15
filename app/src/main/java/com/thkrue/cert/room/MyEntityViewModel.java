package com.thkrue.cert.room;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class MyEntityViewModel extends AndroidViewModel {

    private MyEntityRepository mRepo;
//    private LiveData<List<MyEntity>> mAllEntities;

    public MyEntityViewModel(Application a) {
        super(a);
        mRepo = new MyEntityRepository(a.getApplicationContext());
    }

    public LiveData<List<MyEntity>> getAllEntities() {
        return mRepo.getData();
    }

    public void insert(MyEntity entity) {
        mRepo.insert(entity);
    }
}