package com.service;

import com.utils.DicPage;
import com.utils.DictionaryDetail;


import java.util.List;
import java.util.Map;

public interface DicdService {
    Map<String, Object> getDicdByPage(DicPage dicPage);

    int getDicdCount(long dicId);

    int addDicd(DictionaryDetail dicd);

    int deleteDicdById(long id);

    int updateDicd(DictionaryDetail dicd);

    DictionaryDetail queryById(long id);

    List<DictionaryDetail> queryAllDicd();
}
