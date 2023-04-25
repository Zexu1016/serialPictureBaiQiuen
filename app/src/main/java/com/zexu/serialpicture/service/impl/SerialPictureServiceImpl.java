package com.zexu.serialpicture.service.impl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.zexu.serialpicture.repository.SerialPictureRepository;
import com.zexu.serialpicture.repository.database.SerialPictureDatabase;
import com.zexu.serialpicture.repository.entity.SerialPicture;
import com.zexu.serialpicture.service.CollectService;
import com.zexu.serialpicture.service.SerialPictureService;

import java.util.List;

public class SerialPictureServiceImpl extends Service implements SerialPictureService {
    private final SerialPictureRepository serialPictureRepository
            = SerialPictureDatabase.getInstance(this).serialPictureRepository();

    @Override
    public List<SerialPicture> selectAll() {
        return serialPictureRepository.selectAll();
    }

    public class LocalBinder extends Binder {
        public SerialPictureService getService() {
            return SerialPictureServiceImpl.this;
        }
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new LocalBinder();
    }
}
