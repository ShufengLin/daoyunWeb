package com.controller;

import com.service.CourseStudentService;
import com.utils.CourseStudent;
import com.utils.PaperPage;
import com.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/courseStudent")
public class CourseStudentController {
    @Autowired
    private CourseStudentService courseStudentService;

    @ResponseBody
    @PostMapping("/getCourseStudentByPage")
    public Map<String, Object> getCourseStudentByPage(@RequestBody PaperPage paperPage){
        System.out.println("-----------------------------------------");
        System.out.println(paperPage.getCourseId());
        System.out.println("-----------------------------------------");
        Map<String, Object> map= courseStudentService.getCourseStudentByPage(paperPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getCourseStudentCount")
    public ServerResponse getCourseStudentCount(@RequestBody PaperPage paperPage){
        int courseStudentCount= courseStudentService.getCourseStudentCount(paperPage);
        return new ServerResponse(0, courseStudentCount,"返回课程数量成功");
    }

    /**
     *  实际传参studentId和courseId
     */
    @ResponseBody
    @PostMapping("/attendCourse")
    public ServerResponse attendCourse(@RequestBody CourseStudent courseStudent){
        courseStudentService.attendCourse(courseStudent);
        return new ServerResponse(0,"选课成功");
    }

    /**
     *  用于判断指定学生是否参加指定课程，获取指定课程中指定学生的经验值
     */
    @ResponseBody
    @PostMapping("/getStudentCourseByTwoId")
    public ServerResponse getStudentCourseByTwoId(@RequestBody PaperPage paperPage){
        CourseStudent courseStudent = courseStudentService.getStudentCourseByTwoId(paperPage);
        return new ServerResponse(0, courseStudent,"返回学生参加对应课程的信息");
    }
}
