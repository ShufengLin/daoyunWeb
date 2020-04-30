package com.dao;

import com.utils.Dictionary;

import java.util.List;

/**
*  @author author
*/
public interface DictionaryDao {
    int addDic(Dictionary dic);

    int deleteDicById(long id);

    int updateDic(Dictionary dic);

    Dictionary queryById(long id);

    List<Dictionary> queryAllDic();


}