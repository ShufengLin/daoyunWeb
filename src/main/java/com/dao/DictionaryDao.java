package com.dao;

import com.utils.DicPage;
import com.utils.Dictionary;


import java.util.List;

/**
*  @author author
*/
public interface DictionaryDao {
    List<Dictionary> getDicByPage(DicPage dicPage);

    int getDicCount(DicPage dicPage);

    int deleteDicBatchById(List<Long> dicIdList);

    int addDic(Dictionary dic);

    int deleteDicById(long id);

    int updateDic(Dictionary dic);

    Dictionary queryById(long id);

    List<Dictionary> queryAllDic();


}