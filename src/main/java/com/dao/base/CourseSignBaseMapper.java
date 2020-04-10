package com.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.CourseSign;
/**
*  @author author
*/
public interface CourseSignBaseMapper {

    int insertCourseSign(CourseSign object);

    int updateCourseSign(CourseSign object);

    int update(CourseSign.UpdateBuilder object);

    List<CourseSign> queryCourseSign(CourseSign object);

    CourseSign queryCourseSignLimit1(CourseSign object);

}