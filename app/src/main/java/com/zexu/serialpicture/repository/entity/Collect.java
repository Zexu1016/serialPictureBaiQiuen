package com.zexu.serialpicture.repository.entity;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tb_collect")
public class Collect {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id", typeAffinity = ColumnInfo.INTEGER)
    public Integer id;

    @ColumnInfo(name = "location", typeAffinity = ColumnInfo.TEXT)
    public String location;
}
