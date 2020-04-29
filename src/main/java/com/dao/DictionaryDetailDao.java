package com.dao;

import com.utils.DictionaryDetail;

import java.util.List;

/**
*  @author author
*/
public interface DictionaryDetailDao {
    int addDicd(DictionaryDetail dicd);

    int deleteDicdById(long id);

    int updateDicd(DictionaryDetail dicd);

    DictionaryDetail queryById(long id);

    List<DictionaryDetail> queryAllDicd();
}