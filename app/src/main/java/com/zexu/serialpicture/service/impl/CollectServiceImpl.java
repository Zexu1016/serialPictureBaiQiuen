package com.zexu.serialpicture.service.impl;

import com.zexu.serialpicture.repository.CollectRepository;
import com.zexu.serialpicture.repository.entity.Collect;
import com.zexu.serialpicture.service.CollectService;

import java.util.List;

public class CollectServiceImpl implements CollectService {
    private CollectRepository collectRepository = new CollectRepository();

    @Override
    public boolean save(Collect collect) {
        return false;
    }

    @Override
    public boolean delete(Collect collect) {
        return false;
    }

    @Override
    public Collect selectById(Integer id) {
        return null;
    }

    @Override
    public List<Collect> selectAll() {
        return null;
    }
}
