package com.zexu.serialpicture.service.impl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.zexu.serialpicture.repository.LabelRepository;
import com.zexu.serialpicture.repository.database.SerialPictureDatabase;
import com.zexu.serialpicture.repository.entity.Label;
import com.zexu.serialpicture.service.CollectService;
import com.zexu.serialpicture.service.LabelService;

import java.util.List;

public class LabelServiceImpl extends Service implements LabelService{

    private final LabelRepository labelRepository = SerialPictureDatabase.getInstance(this).labelRepository();


    @Override
    public boolean save(Label label) {
        labelRepository.save(label);
        return true;
    }

    @Override
    public boolean delete(Label label) {
        labelRepository.delete(label);
        return true;
    }

    @Override
    public boolean update(Label label) {
        labelRepository.update(label);
        return true;
    }

    @Override
    public Label selectById(Integer id) {
        return labelRepository.selectById(id);
    }

    @Override
    public List<Label> selectAll() {
        return labelRepository.selectAll();
    }

    public class LocalBinder extends Binder {
        public LabelService getService() {
            return LabelServiceImpl.this;
        }
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new LocalBinder();
    }
}
