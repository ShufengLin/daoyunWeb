package com.service.impl;

import com.dao.DictionaryDetailDao;
import com.exception.CustomizedException;
import com.service.DicdService;
import com.utils.DicPage;
import com.utils.DictionaryDetail;
import com.utils.PaperDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DicdServiceImpl implements DicdService {
    @Autowired
    private DictionaryDetailDao dicdDao;

    @Override
    public Map<String, Object> getDicdByPage(DicPage dicPage) {
        int pageSize = dicPage.getPageSize();
        if (pageSize == 0) {
            pageSize = 10;
        }
        int beginPage = (dicPage.getPage() - 1) * pageSize;
        if (beginPage < 0) {
            //beginPage = 0;
            throw new CustomizedException("页码不符合规范");
        }
        if(dicPage.getDicId() == 0)
        {
            throw new CustomizedException("id不能为空");
        }
        dicPage.setBeginPage(beginPage);
        List<DictionaryDetail> paperDetailList = dicdDao.getDicdByPage(dicPage);
        //int count = paperDao.getPaperBySelectCount(paperPage);
        Map<String, Object> map = new HashMap<>();
        map.put("data", paperDetailList);
        //map.put("total", count);
        return map;
    }

    @Override
    public int getDicdCount(long dicId) {
        return dicdDao.getDicdCount(dicId);
    }

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
