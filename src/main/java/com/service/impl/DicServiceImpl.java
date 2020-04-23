package com.service.impl;

import com.dao.DicDao;
import com.dao.base.dictionaryBaseMapper;
import com.service.DicService;
import com.utils.Dic;

import com.utils.dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicServiceImpl implements DicService {

    @Autowired
    @Qualifier("dictionaryBaseMapper")
    private dictionaryBaseMapper dictionaryBaseMapper;

    @Override
    public int insertdictionary(dictionary object) {
        return dictionaryBaseMapper.insertdictionary(object);
    }

    @Override
    public int updatedictionary(dictionary object) {
        return 0;
    }

    @Override
    public int update(dictionary.UpdateBuilder object) {
        return 0;
    }

    @Override
    public List<dictionary> querydictionary(dictionary object) {
        return dictionaryBaseMapper.querydictionary(object);
    }

    @Override
    public dictionary querydictionaryLimit1(dictionary object) {
        return null;
    }
//    @Autowired
//    private DicDao dicDao;
//
//    @Override
//    public int addDic(Dic dic) {
//        return dicDao.addDic(dic);
//    }
//
//    @Override
//    public int deleteDicById(long id) {
//        return dicDao.deleteDicById(id);
//    }
//
//    @Override
//    public int updateDic(Dic dic) {
//        return dicDao.updateDic(dic);
//    }
//
//    @Override
//    public Dic queryById(long id) {
//        return dicDao.queryById(id);
//    }
//
//    @Override
//    public List<Dic> queryAllDic() {
//        return dicDao.queryAllDic();
//    }
}
