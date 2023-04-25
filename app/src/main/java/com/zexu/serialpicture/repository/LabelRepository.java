package com.zexu.serialpicture.repository;

import com.zexu.serialpicture.repository.entity.Label;

import java.util.List;

public interface LabelRepository {
    public boolean save(Label label);
    public boolean delete(Label label);

    public boolean update(Label newLabel, Label oldLabel);

    public Label selectById(Integer id);

    public List<Label> selectAll();
}
