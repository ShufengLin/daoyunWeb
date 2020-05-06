package com.service;

import com.utils.DicPage;
import com.utils.Dictionary;

import java.util.List;
import java.util.Map;

public interface DicService {
    Map<String, Object> getDicByPage(DicPage dicPage);

    int getDicCount(DicPage dicPage);

    int deleteDicBatchById(List<Long> dicIdList);

    int addDic(Dictionary dic);

    int deleteDicById(long id);

    int updateDic(Dictionary dic);

    Dictionary queryById(long id);

    List<Dictionary> queryAllDic();


}
