package com.zexu.serialpicture.repository;

import com.zexu.serialpicture.repository.entity.Label;

import java.util.List;

public class LabelRepository {
    public boolean save(Label label) {
        return true;
    }

    public boolean delete(Label label) {
        return true;
    }

    public boolean update(Label newLabel, Label oldLabel) {
        return true;
    }

    public Label selectById(Integer id) {
        return null;
    }

    public List<Label> selectAll() {
        return null;
    }
}
