package com.zexu.serialpicture.service.impl;

import com.zexu.serialpicture.repository.LabelRepository;
import com.zexu.serialpicture.repository.entity.Label;
import com.zexu.serialpicture.service.LabelService;

import java.util.List;

public class LabelServiceImpl implements LabelService {
    private LabelRepository labelRepository;

    @Override
    public boolean save(Label label) {
        return false;
    }

    @Override
    public boolean delete(Label label) {
        return false;
    }

    @Override
    public boolean update(Label newLabel, Label oldLabel) {
        return false;
    }

    @Override
    public Label selectById(Integer id) {
        return null;
    }

    @Override
    public List<Label> selectAll() {
        return null;
    }
}
