package com.service.impl;

import com.dao.DictionaryDao;
import com.dao.DictionaryDetailDao;
import com.exception.CustomizedException;
import com.service.DicService;
import com.utils.DicPage;
import com.utils.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DicServiceImpl implements DicService {

    @Autowired
    private DictionaryDao dicDao;
    @Autowired
    private DictionaryDetailDao dicdDao;

    @Override
    public Map<String, Object> getDicByPage(DicPage dicPage) {
        if(dicPage.getDicName().equals("")) {
            dicPage.setDicName(null);
        }
        int pageSize = dicPage.getPageSize();
        if (pageSize == 0) {
            pageSize = 10;
        }
        int beginPage = (dicPage.getPage() - 1) * pageSize;
        if (beginPage < 0) {
            //beginPage = 0;
            throw new CustomizedException("页码不符合规范");
        }
        dicPage.setBeginPage(beginPage);
        List<Dictionary> dicList = dicDao.getDicByPage(dicPage);
        //int count = paperDao.getPaperBySelectCount(paperPage);
        Map<String, Object> map = new HashMap<>();
        map.put("data", dicList);
        //map.put("total", count);
        return map;
    }

    @Override
    public int getDicCount(DicPage dicPage) {
        if(dicPage.getDicName().equals("")) {
            dicPage.setDicName(null);
        }
        return dicDao.getDicCount(dicPage);
    }

    @Override
    public int deleteDicBatchById(List<Long> dicIdList) {
        //TODO 详情页面deletebatch
        dicDao.deleteDicBatchById(dicIdList);
        dicdDao.deleteDicdBatchByDicId(dicIdList);
        return 0;
    }

    @Override
    public int addDic(Dictionary dic) {
        return dicDao.addDic(dic);
    }

    @Override
    public int deleteDicById(long id) {
        dicDao.deleteDicById(id);
        dicdDao.deleteDicdByDicId(id);
        return 0;
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
