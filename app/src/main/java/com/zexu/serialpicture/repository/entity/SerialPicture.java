package com.zexu.serialpicture.repository.entity;

//import lombok.Data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "serial_picture")
public class SerialPicture {
    @PrimaryKey(autoGenerate = true)
    public Integer id;

    public String content;
}
