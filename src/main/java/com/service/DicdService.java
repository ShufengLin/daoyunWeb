package com.service;

import com.utils.DictionaryDetail;

import java.util.List;

public interface DicdService {

    int addDicd(DictionaryDetail dicd);

    int deleteDicdById(long id);

    int updateDicd(DictionaryDetail dicd);

    DictionaryDetail queryById(long id);

    List<DictionaryDetail> queryAllDicd();
}
