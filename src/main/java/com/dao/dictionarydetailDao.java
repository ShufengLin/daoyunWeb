package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.utils.dictionarydetail;

/**
*  @author author
*/
public interface dictionarydetailDao {

    int addDicd(dictionarydetail dicd);

    int deleteDicdById(Integer id);

    int updateDicd(dictionarydetail dicd);

    dictionarydetail queryById(Integer id);

    List<dictionarydetail> queryAllDicd();
}