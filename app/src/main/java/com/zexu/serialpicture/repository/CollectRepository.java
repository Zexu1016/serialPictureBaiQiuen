package com.zexu.serialpicture.repository;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.zexu.serialpicture.repository.entity.Collect;

import java.util.List;

@Dao
public interface CollectRepository {

    @Insert
    public void save(Collect collect);

    @Delete
    public void delete(Collect collect);



    @Query("SELECT * FROM tb_collect WHERE id = :id")
    public Collect selectById(Integer id);

    @Query("SELECT * FROM tb_collect")
    public List<Collect> selectAll();
}
