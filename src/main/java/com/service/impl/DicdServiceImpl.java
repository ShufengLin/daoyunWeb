package com.service.impl;

import com.dao.DicdDao;
import com.service.DicdService;
import com.utils.Dicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicdServiceImpl implements DicdService {
    @Autowired
    private DicdDao dicdDao;
    @Override
    public int addDicd(Dicd dicd) {
        return dicdDao.addDicd(dicd);
    }

    @Override
    public int deleteDicdById(long id) {
        return dicdDao.deleteDicdById(id);
    }

    @Override
    public int updateDicd(Dicd dicd) {
        return dicdDao.updateDicd(dicd);
    }

    @Override
    public Dicd queryById(long id) {
        return dicdDao.queryById(id);
    }

    @Override
    public List<Dicd> queryAllDicd() {
        return dicdDao.queryAllDicd();
    }
}
