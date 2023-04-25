package com.zexu.serialpicture.repository.entity;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "collect")
public class Collect {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id", typeAffinity = ColumnInfo.INTEGER)
    Integer id;

    @ColumnInfo(name = "location", typeAffinity = ColumnInfo.TEXT)
    String location;
}
