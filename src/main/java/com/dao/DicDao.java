package com.dao;

import com.utils.Dic;

import java.util.List;

public interface DicDao {
    int addDic(Dic dic);

    int deleteDicById(long id);

    int updateDic(Dic dic);

    Dic queryById(long id);

    List<Dic> queryAllDic();

}
