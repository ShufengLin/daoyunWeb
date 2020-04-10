package com.service;

import com.utils.Dicd;

import java.util.List;

public interface DicdService {
    int addDicd(Dicd dicd);

    int deleteDicdById(long id);

    int updateDicd(Dicd dicd);

    Dicd queryById(long id);

    List<Dicd> queryAllDicd();
}
