package com.controller;

import com.service.CourseService;
import com.service.UserService;
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
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/getTeacherByPage")
    public Map<String, Object> getTeacherByPage(@RequestBody PaperPage paperPage){
        Map<String, Object> map= userService.getTeacherByPage(paperPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getTeacherCount")
    public ServerResponse getTeacherCount(@RequestBody PaperPage paperPage){
        int teacherCount= userService.getTeacherCount(paperPage);
        return new ServerResponse(0, teacherCount,"返回老师数量成功");
    }

}