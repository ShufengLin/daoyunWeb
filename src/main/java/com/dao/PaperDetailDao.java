package com.dao;

import com.utils.PaperDetail;
import com.utils.PaperPage;

import java.util.List;

public interface PaperDetailDao {
    List<PaperDetail> getPaperDetailByPage(PaperPage paperPage);
}
