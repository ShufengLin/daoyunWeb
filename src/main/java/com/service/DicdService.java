package com.service;

import com.utils.dictionarydetail;

import java.util.List;

public interface DicdService {

    int addDicd(dictionarydetail dicd);

    int deleteDicdById(Integer id);

    int updateDicd(dictionarydetail dicd);

    dictionarydetail queryById(Integer id);

    List<dictionarydetail> queryAllDicd();
}
