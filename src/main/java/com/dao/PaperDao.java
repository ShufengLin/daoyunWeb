package com.dao;

import com.utils.Paper;
import com.utils.PaperPage;

import java.util.List;

public interface PaperDao {
    List<Paper> getPaperByPage(PaperPage paperPage);

    int getPaperCount();

    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();


}
