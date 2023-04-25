package com.zexu.serialpicture.repository.entity;



import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tb_serial_picture")
public class SerialPicture {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id", typeAffinity = ColumnInfo.INTEGER)
    public Integer id;

    @ColumnInfo(name = "content", typeAffinity = ColumnInfo.TEXT)
    public String content;
}
