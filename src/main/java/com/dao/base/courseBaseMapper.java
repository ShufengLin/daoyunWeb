package com.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.course;
/**
*  @author author
*/
public interface courseBaseMapper {

    int insertcourse(course object);

    int updatecourse(course object);

    int update(course.UpdateBuilder object);

    List<course> querycourse(course object);

    course querycourseLimit1(course object);

}