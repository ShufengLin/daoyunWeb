package com.dao;

import com.utils.Paper;
import com.utils.PaperDetail;
import com.utils.PaperPage;

import java.util.List;

public interface PaperDetailDao {
    List<PaperDetail> getPaperDetailByPage(PaperPage paperPage);

    int getPaperDetailCount(long paperId);

    int addPaperDetail(PaperDetail paperDetail);

    int updateDetailPaper(PaperDetail paperDetail);

    int deletePaperDetailById(long id);
}
