package com.zexu.serialpicture.service;

import com.zexu.serialpicture.repository.entity.Collect;

import java.util.List;

public interface CollectService {
    public boolean save(Integer location);

    public boolean delete(Integer location);

    public Collect selectById(Integer id);

    public List<Collect> selectAll();
}
