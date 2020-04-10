package com.service.impl;

import com.dao.DicDao;
import com.service.DicService;
import com.utils.Dic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicServiceImpl implements DicService {
    @Autowired
    private DicDao dicDao;

    @Override
    public int addDic(Dic dic) {
        return dicDao.addDic(dic);
    }

    @Override
    public int deleteDicById(long id) {
        return dicDao.deleteDicById(id);
    }

    @Override
    public int updateDic(Dic dic) {
        return dicDao.updateDic(dic);
    }

    @Override
    public Dic queryById(long id) {
        return dicDao.queryById(id);
    }

    @Override
    public List<Dic> queryAllDic() {
        return dicDao.queryAllDic();
    }
}
