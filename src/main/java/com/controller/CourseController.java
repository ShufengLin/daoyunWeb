package com.controller;

import com.service.CourseService;
import com.service.SignService;
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

    @Autowired
    private SignService signService;

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
    @PostMapping("/getStudentOwnCourseByPage")
    public Map<String, Object> getStudentOwnCourseByPage(@RequestBody PaperPage paperPage){
        Map<String, Object> map= courseService.getStudentOwnCourseByPage(paperPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getStudentOwnCourseCount")
    public ServerResponse getStudentOwnCourseCount(@RequestBody PaperPage paperPage){
        int courseCount= courseService.getStudentOwnCourseCount(paperPage);
        return new ServerResponse(0, courseCount,"返回课程数量成功");
    }

    //开始签到，需要3个值，一个课程id，另外两个是经纬度，作用是修改IsSign为1和保存老师经纬度
    @ResponseBody
    @PostMapping("/beginSign")
    public ServerResponse beginSign(@RequestBody Course course){
        signService.beginSign(course);
        return new ServerResponse(0,"开始签到");
    }

    //结束签到，需要一个值，一个课程id，作用结束签到，即修改IsSign为0,另外将没签到的人写入course_sign表，SignStatue，0代表签到成功，1代表未签到
    @ResponseBody
    @PostMapping("/closeSign")
    public ServerResponse closeSign(@RequestBody Course course){
        signService.endSign(course);
        return new ServerResponse(0,"结束签到");
    }

    /*
    签到，需要4个值，一个课程id，一个学生id，学生的经纬度信息，根据id取出老师经纬度，默认距离，经验。
    老师经纬度和学生的计算，小于默认距离签到成功，返回标识1，记录到数据库，大于就失败，返回标识0；
    另外，如果学生已经签过到了，返回标识2
    返回值总结:返回0代表签到距离测试没通过，1代表签到成功，2代表重复签到
     */
    @ResponseBody
    @PostMapping("/sign")
    public ServerResponse sign(@RequestBody Course course){
        return new ServerResponse(0,signService.Sign(course),"");
    }

    /*
    获取签到标志，0代表该课未开始签到，1代表该课开始签到
     */
    @ResponseBody
    @PostMapping("/getIsSign")
    public ServerResponse getIsSign(@RequestBody Course course){
        int isSign = signService.getIsSign(course);
        return new ServerResponse(0, isSign,"");
    }
    @ResponseBody
    @PostMapping("/getCourseInfoById")
    public ServerResponse getCourseInfoById(@RequestBody Course course){
        Course info= courseService.getCourseInfoByCourseId(course.getCourseId());
        return new ServerResponse(0, info,"获取课程详情成功");
    }

}
