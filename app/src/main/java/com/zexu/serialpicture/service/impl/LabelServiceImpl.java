package com.zexu.serialpicture.service.impl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.zexu.serialpicture.repository.LabelRepository;
import com.zexu.serialpicture.repository.entity.Label;
import com.zexu.serialpicture.service.CollectService;
import com.zexu.serialpicture.service.LabelService;

import java.util.List;

public class LabelServiceImpl extends Service implements LabelService{
    private LabelRepository labelRepository;

    @Override
    public boolean save(Label label) {
        return false;
    }

    @Override
    public boolean delete(Label label) {
        return false;
    }

    @Override
    public boolean update(Label newLabel, Label oldLabel) {
        return false;
    }

    @Override
    public Label selectById(Integer id) {
        return null;
    }

    @Override
    public List<Label> selectAll() {
        return null;
    }

    class LocalBinder extends Binder {
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
