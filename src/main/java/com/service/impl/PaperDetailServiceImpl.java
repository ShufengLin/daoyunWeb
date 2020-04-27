package com.service.impl;

import com.dao.PaperDetailDao;
import com.exception.CustomizedException;
import com.service.PaperDetailService;
import com.utils.Paper;
import com.utils.PaperDetail;
import com.utils.PaperPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PaperDetailServiceImpl implements PaperDetailService {
    @Autowired
    private PaperDetailDao paperDetailDao;

    @Override
    public Map<String, Object> getPaperDetailByPage(PaperPage paperPage) {
        int pageSize = paperPage.getPageSize();
        if (pageSize == 0) {
            pageSize = 10;
        }
        int beginPage = (paperPage.getPage() - 1) * pageSize;
        if (beginPage < 0) {
            //beginPage = 0;
            throw new CustomizedException("页码不符合规范");
        }
        if(paperPage.getPaperId() == 0)
        {
            throw new CustomizedException("id不能为空");
        }
        paperPage.setBeginPage(beginPage);
        List<PaperDetail> paperDetailList = paperDetailDao.getPaperDetailByPage(paperPage);
        //int count = paperDao.getPaperBySelectCount(paperPage);
        Map<String, Object> map = new HashMap<>();
        map.put("data", paperDetailList);
        //map.put("total", count);
        return map;
    }
    @Override
    public int getPaperDetailCount(long paperId){return paperDetailDao.getPaperDetailCount(paperId);}

    @Override
    public int addPaperDetail(PaperDetail paperDetail) {
        return paperDetailDao.addPaperDetail(paperDetail);
    }

    @Override
    public int updateDetailPaper(PaperDetail paperDetail) {
        return paperDetailDao.updateDetailPaper(paperDetail);
    }

    @Override
    public int deletePaperDetailById(long id) {
        return paperDetailDao.deletePaperDetailById(id);
    }

}
