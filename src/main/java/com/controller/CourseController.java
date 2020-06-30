package com.controller;

import com.service.CourseService;
import com.utils.Course;
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
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @ResponseBody
    @PostMapping("/getCourseByPage")
    public Map<String, Object> getCourseByPage(@RequestBody PaperPage paperPage){
        Map<String, Object> map= courseService.getCourseByPage(paperPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getCourseCount")
    public ServerResponse getCourseCount(@RequestBody PaperPage paperPage){
        int courseCount= courseService.getCourseCount(paperPage);
        return new ServerResponse(0, courseCount,"返回课程数量成功");
    }

    @ResponseBody
    @PostMapping("/getCourseById")
    public ServerResponse getCourseById(@RequestBody Course course){
        Course cour= courseService.getCourseByCourseId(course.getCourseId());
        System.out.println("------------------------------");
        System.out.println(cour.getCourseName());
        System.out.println("------------------------------");
        return new ServerResponse(0, cour,"");
    }

    @ResponseBody
    @PostMapping("/updateCourseJson")
    public ServerResponse updateCourseJson(@RequestBody Course course) {
        courseService.updateCourse(course);
        return new ServerResponse(0,"修改成功");
    }

    @ResponseBody
    @PostMapping("/updateCourseParaJson")
    public ServerResponse updateCourseParaJson(@RequestBody Course course) {
        courseService.updateCoursePara(course);
        return new ServerResponse(0,"修改成功");
    }

    @ResponseBody
    @PostMapping("/addCourseJson")
    public ServerResponse addCourseJson(@RequestBody Course course) {
        courseService.addCourse(course);
        return new ServerResponse(0,"新增成功");
    }

    @ResponseBody
    @PostMapping("/getOwnCourseByPage")
    public Map<String, Object> getOwnCourseByPage(@RequestBody PaperPage paperPage){
        Map<String, Object> map= courseService.getOwnCourseByPage(paperPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

}
