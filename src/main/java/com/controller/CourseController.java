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

    @ResponseBody
    @PostMapping("/getOwnCourseCount")
    public ServerResponse getOwnCourseCount(@RequestBody PaperPage paperPage){
        int courseCount= courseService.getOwnCourseCount(paperPage);
        return new ServerResponse(0, courseCount,"返回课程数量成功");
    }

    @ResponseBody
    @PostMapping("/beginSign")
    public ServerResponse beginSign(@RequestBody Course course){
        //开始签到，需要三个值，一个课程id，另外两个是经纬度（两个课程表都有），作用是修改IsSign为1和保存老师经纬度
        return new ServerResponse(0,"");
    }

    @ResponseBody
    @PostMapping("/closeSign")
    public ServerResponse closeSign(@RequestBody Course course){
        //开始签到，需要一个值，一个课程id，作用结束签到，即修改IsSign为0
        return new ServerResponse(0,"");
    }

    @ResponseBody
    @PostMapping("/sign")
    public ServerResponse sign(@RequestBody Course course){
        //签到，需要四个值，一个课程id，一个学生id，学生的经纬度信息，根据id取出老师经纬度，默认距离，经验。
        // 老师经纬度和学生的计算，小于默认距离签到成功，返回标识1，记录到数据库，大于就失败，返回标识0；
        return new ServerResponse(0,"");
    }

    @ResponseBody
    @PostMapping("/getCourseInfoById")
    public ServerResponse getCourseInfoById(@RequestBody Course course){
        Course info= courseService.getCourseInfoByCourseId(course.getCourseId());
        return new ServerResponse(0, info,"");
    }

}
