package com.zexu.serialpicture.service;

import com.zexu.serialpicture.repository.entity.Label;

import java.util.List;

public interface LabelService {

    public boolean save(Label label);

    public boolean delete(Label label);

    public boolean update(Label Label);

    public Label selectById(Integer id);

    public List<Label> selectAll();
}
