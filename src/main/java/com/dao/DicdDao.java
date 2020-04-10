package com.dao;

import com.utils.Dicd;

import java.util.List;

public interface DicdDao {
    int addDicd(Dicd dicd);

    int deleteDicdById(long id);

    int updateDicd(Dicd dicd);

    Dicd queryById(long id);

    List<Dicd> queryAllDicd();

}
