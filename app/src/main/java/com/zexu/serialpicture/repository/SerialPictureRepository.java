package com.zexu.serialpicture.repository;

import com.zexu.serialpicture.repository.entity.SerialPicture;

import java.util.List;

public interface SerialPictureRepository {
    public List<SerialPicture> selectAll();
}
