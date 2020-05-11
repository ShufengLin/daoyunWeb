package com.service;

import com.utils.Paper;
import com.utils.PaperDetail;
import com.utils.PaperPage;

import java.util.Map;

public interface PaperDetailService {
    Map<String, Object> getPaperDetailByPage(PaperPage paperPage);

    int getPaperDetailCount(long paperId);

    int addPaperDetail(PaperDetail paperDetail);

    int updateDetailPaper(PaperDetail paperDetail);

    int deletePaperDetailById(long id);

    Map<String,Object> getChildrenPaperDetail(long id);

}
