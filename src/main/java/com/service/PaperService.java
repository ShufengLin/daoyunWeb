package com.service;

import com.utils.Paper;
import com.utils.PaperPage;

import java.util.List;
import java.util.Map;

public interface PaperService {

    Map<String, Object> getPaperByPage(PaperPage paperPage);

    int getPaperCount();

    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}
