package com.service;

import com.utils.dictionary;

import java.util.List;

public interface DicService {

    int addDic(dictionary dic);

    int deleteDicById(Integer id);

    int updateDic(dictionary dic);

    dictionary queryById(Integer id);

    List<dictionary> queryAllDic();


}
