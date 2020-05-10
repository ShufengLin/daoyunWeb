package com.dao;

import com.utils.DicPage;
import com.utils.DictionaryDetail;


import java.util.List;

/**
*  @author author
*/
public interface DictionaryDetailDao {
    List<DictionaryDetail> getDicdByPage(DicPage dicPage);

    int getDicdCount(long dicId);

    int addDicd(DictionaryDetail dicd);

    int deleteDicdById(long id);

    int deleteDicdByDicId(long dicId);

    int deleteDicdBatchByDicId(List<Long> dicIdList);

    int updateDicd(DictionaryDetail dicd);

    DictionaryDetail queryById(long id);

    List<DictionaryDetail> queryAllDicd();
}