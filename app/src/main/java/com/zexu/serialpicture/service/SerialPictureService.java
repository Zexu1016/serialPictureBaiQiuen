package com.zexu.serialpicture.service;

import com.zexu.serialpicture.repository.entity.SerialPicture;

import java.util.List;

public interface SerialPictureService {
    public List<SerialPicture> selectAll();
}
