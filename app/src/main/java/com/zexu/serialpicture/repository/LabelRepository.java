package com.zexu.serialpicture.repository;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.zexu.serialpicture.repository.entity.Label;

import java.util.List;

public interface LabelRepository {
    @Insert
    public boolean save(Label label);

    @Delete
    public boolean delete(Label label);

    @Update
    public boolean update(Label Label);

    @Query("SELECT * FROM tb_label WHERE id = :id")
    public Label selectById(Integer id);

    @Query("SELECT * FROM tb_label")
    public List<Label> selectAll();
}
