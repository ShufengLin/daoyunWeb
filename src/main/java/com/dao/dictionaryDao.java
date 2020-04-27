package com.dao;

import java.util.List;

import com.utils.dictionary;
import org.apache.ibatis.annotations.Param;
import com.utils.dictionary;
/**
*  @author author
*/
public interface dictionaryDao {
    int addDic(dictionary dic);

    int deleteDicById(Integer id);

    int updateDic(dictionary dic);

    dictionary queryById(Integer id);

    List<dictionary> queryAllDic();


}