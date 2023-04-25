package com.zexu.serialpicture.service.impl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.zexu.serialpicture.repository.CollectRepository;
import com.zexu.serialpicture.repository.database.SerialPictureDatabase;
import com.zexu.serialpicture.repository.entity.Collect;
import com.zexu.serialpicture.service.CollectService;

import java.util.List;

public class CollectServiceImpl extends Service implements CollectService {

    private final CollectRepository collectRepository = SerialPictureDatabase.getInstance(this).collectRepository();

    @Override
    public boolean save(Collect collect) {
        collectRepository.save(collect);
        return true;
    }

    @Override
    public boolean delete(Collect collect) {
        collectRepository.delete(collect);
        return true;
    }

    @Override
    public Collect selectById(Integer id) {
        return collectRepository.selectById(id);
    }

    @Override
    public List<Collect> selectAll() {
        return collectRepository.selectAll();
    }

    class LocalBinder extends Binder {
        public CollectService getService() {
            return CollectServiceImpl.this;
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new LocalBinder();
    }
}
