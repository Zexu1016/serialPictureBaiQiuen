package com.zexu.serialpicture.service;

import com.zexu.serialpicture.repository.entity.Collect;
import com.zexu.serialpicture.repository.entity.Label;

import java.util.List;

public interface CollectService {
    public boolean save(Collect collect);

    public boolean delete(Collect collect);



    public Collect selectById(Integer id);

    public List<Collect> selectAll();
}
