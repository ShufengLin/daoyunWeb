package com.service.impl;

import com.dao.dictionarydetailDao;
import com.service.DicdService;
import com.utils.dictionarydetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicdServiceImpl implements DicdService {
    @Autowired
    private dictionarydetailDao dicdDao;
    @Override
    public int addDicd(dictionarydetail dicd) {
        return dicdDao.addDicd(dicd);
    }

    @Override
    public int deleteDicdById(Integer id) {
        return dicdDao.deleteDicdById(id);
    }

    @Override
    public int updateDicd(dictionarydetail dicd) {
        return dicdDao.updateDicd(dicd);
    }

    @Override
    public dictionarydetail queryById(Integer id) {
        return dicdDao.queryById(id);
    }

    @Override
    public List<dictionarydetail> queryAllDicd() {
        return dicdDao.queryAllDicd();
    }

}
