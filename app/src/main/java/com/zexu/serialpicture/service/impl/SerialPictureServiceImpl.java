package com.zexu.serialpicture.service.impl;

import com.zexu.serialpicture.repository.SerialPictureRepository;
import com.zexu.serialpicture.repository.entity.SerialPicture;
import com.zexu.serialpicture.service.SerialPictureService;

import java.util.List;

public class SerialPictureServiceImpl implements SerialPictureService {
    private SerialPictureRepository serialPictureRepository;

    @Override
    public List<SerialPicture> selectAll() {
        return null;
    }
}
