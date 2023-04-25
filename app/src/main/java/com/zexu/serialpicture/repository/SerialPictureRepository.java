package com.zexu.serialpicture.repository;

import androidx.room.Query;

import com.zexu.serialpicture.repository.entity.SerialPicture;

import java.util.List;

public interface SerialPictureRepository {

    @Query("SELECT * FROM tb_serial_picture")
    public List<SerialPicture> selectAll();
}
