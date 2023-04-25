package com.zexu.serialpicture.repository.entity;



import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "serial_picture")
public class SerialPicture {

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    public String content;
}
