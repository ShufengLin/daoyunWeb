package com.service.impl;

import com.dao.DictionaryDetailDao;
import com.service.DicdService;
import com.utils.DictionaryDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicdServiceImpl implements DicdService {
    @Autowired
    private DictionaryDetailDao dicdDao;
    @Override
    public int addDicd(DictionaryDetail dicd) {
        return dicdDao.addDicd(dicd);
    }

    @Override
    public int deleteDicdById(long id) {
        return dicdDao.deleteDicdById(id);
    }

    @Override
    public int updateDicd(DictionaryDetail dicd) {
        return dicdDao.updateDicd(dicd);
    }

    @Override
    public DictionaryDetail queryById(long id) {
        return dicdDao.queryById(id);
    }

    @Override
    public List<DictionaryDetail> queryAllDicd() {
        return dicdDao.queryAllDicd();
    }

}
