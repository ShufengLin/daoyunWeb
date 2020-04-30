package com.service;

import com.utils.Dictionary;

import java.util.List;

public interface DicService {

    int addDic(Dictionary dic);

    int deleteDicById(long id);

    int updateDic(Dictionary dic);

    Dictionary queryById(long id);

    List<Dictionary> queryAllDic();


}
