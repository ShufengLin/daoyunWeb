package com.service.impl;

import com.dao.DictionaryDao;
import com.service.DicService;
import com.utils.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicServiceImpl implements DicService {

    @Autowired
    private DictionaryDao dicDao;

    @Override
    public int addDic(Dictionary dic) {
        return dicDao.addDic(dic);
    }

    @Override
    public int deleteDicById(long id) {
        return dicDao.deleteDicById(id);
    }

    @Override
    public int updateDic(Dictionary dic) {
        return dicDao.updateDic(dic);
    }

    @Override
    public Dictionary queryById(long id) {
        return dicDao.queryById(id);
    }

    @Override
    public List<Dictionary> queryAllDic() {
        return dicDao.queryAllDic();
    }
}
