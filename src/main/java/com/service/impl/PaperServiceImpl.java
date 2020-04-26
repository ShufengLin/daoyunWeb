package com.service.impl;

import com.exception.CustomizedException;
import com.utils.Paper;
import com.dao.PaperDao;
import com.service.PaperService;
import com.dao.PaperDetailDao;

import com.utils.PaperPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperDao paperDao;
    @Autowired
    private PaperDetailDao paperDetailDao;

     @Override
     public Map<String, Object> getPaperByPage(PaperPage paperPage) {
         if(paperPage.getPaperName().equals("")) {
             paperPage.setPaperName(null);
         }
         int pageSize = paperPage.getPageSize();
         if (pageSize == 0) {
             pageSize = 10;
         }
         int beginPage = (paperPage.getPage() - 1) * pageSize;
         if (beginPage < 0) {
             //beginPage = 0;
             throw new CustomizedException("页码不符合规范");
         }
         paperPage.setBeginPage(beginPage);
         List<Paper> paperList = paperDao.getPaperByPage(paperPage);
         //int count = paperDao.getPaperBySelectCount(paperPage);
         Map<String, Object> map = new HashMap<>();
         map.put("data", paperList);
         //map.put("total", count);
         return map;
     }

     @Override
     public int getPaperCount(PaperPage paperPage){
         if(paperPage.getPaperName().equals("")) {
             paperPage.setPaperName(null);
         }
         return paperDao.getPaperCount(paperPage);
     }

     @Override
     public int deletePaperBatchById(List<Long> paperIdList){
         paperDao.deletePaperBatchById(paperIdList);
         paperDetailDao.deletePaperDetailBatchByPaperId(paperIdList);
         return 0;
     }

    @Override
    public int addPaper(Paper paper) {
        return paperDao.addPaper(paper);
    }

    @Override
    public int deletePaperById(long id) {
         paperDao.deletePaperById(id);
        paperDetailDao.deletePaperDetailByPaperId(id);
        return 0;
    }

    @Override
    public int updatePaper(Paper paper) {
        return paperDao.updatePaper(paper);
    }

    @Override
    public Paper queryById(long id) {
        return paperDao.queryById(id);
    }

    @Override
    public List<Paper> queryAllPaper() {
        return paperDao.queryAllPaper();
    }

}
