package com.service;


import com.utils.Course;
import com.utils.DictionaryDetail;
import com.utils.PaperPage;

import java.util.Map;

public interface SignService {

    //开始签到
    int beginSign(Course course);

    //获取isSign参数
    int getIsSign(Course course);

    //学生签到
    int Sign(Course course);

    //结束签到
    int endSign(Course course);

    Map<String, Object> getCourseSignTimeByCourseId(PaperPage paperPage);

    int getCourseSignTimeCount(PaperPage paperPage);

    Map<String, Object> getCourseSignByCourseSignId(PaperPage paperPage);

    int getCourseSignCount(PaperPage paperPage);
}
