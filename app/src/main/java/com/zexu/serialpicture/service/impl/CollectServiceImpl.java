package com.zexu.serialpicture.service.impl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.zexu.serialpicture.repository.CollectRepository;
import com.zexu.serialpicture.repository.database.SerialPictureDatabase;
import com.zexu.serialpicture.repository.entity.Collect;
import com.zexu.serialpicture.service.CollectService;

import java.util.List;

public class CollectServiceImpl extends Service implements CollectService {

    private final SerialPictureDatabase serialPictureDatabase = SerialPictureDatabase.getInstance(this);

    @Override
    public boolean save(Collect collect) {
        serialPictureDatabase.collectRepository().save(collect);
        return true;
    }

    @Override
    public boolean delete(Collect collect) {
        serialPictureDatabase.collectRepository().delete(collect);
        return true;
    }

    @Override
    public Collect selectById(Integer id) {
        return serialPictureDatabase.collectRepository().selectById(id);
    }

    @Override
    public List<Collect> selectAll() {
        return serialPictureDatabase.collectRepository().selectAll();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
