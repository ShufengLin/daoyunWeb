package com.service;

import com.utils.PaperPage;

import java.util.Map;

public interface PaperDetailService {
    Map<String, Object> getPaperDetailByPage(PaperPage paperPage);

    int getPaperDetailCount(long paperId);

}
