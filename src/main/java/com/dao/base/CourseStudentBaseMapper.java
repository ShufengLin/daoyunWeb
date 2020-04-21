package com.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.CourseStudent;
/**
*  @author author
*/
public interface CourseStudentBaseMapper {

    int insertCourseStudent(CourseStudent object);

    int updateCourseStudent(CourseStudent object);

    int update(CourseStudent.UpdateBuilder object);

    List<CourseStudent> queryCourseStudent(CourseStudent object);

    CourseStudent queryCourseStudentLimit1(CourseStudent object);

}