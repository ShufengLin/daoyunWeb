package com.service.impl;

import com.dao.dictionaryDao;
import com.service.DicService;
import com.utils.dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicServiceImpl implements DicService {

    @Autowired
    private dictionaryDao dicDao;

    @Override
    public int addDic(dictionary dic) {
        return dicDao.addDic(dic);
    }

    @Override
    public int deleteDicById(Integer id) {
        return dicDao.deleteDicById(id);
    }

    @Override
    public int updateDic(dictionary dic) {
        return dicDao.updateDic(dic);
    }

    @Override
    public dictionary queryById(Integer id) {
        return dicDao.queryById(id);
    }

    @Override
    public List<dictionary> queryAllDic() {
        return dicDao.queryAllDic();
    }
}
