package com.controller;

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
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/getStudentByPage")
    public Map<String, Object> getStudentByPage(@RequestBody PaperPage paperPage){
        Map<String, Object> map= userService.getStudentByPage(paperPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getStudentCount")
    public ServerResponse getStudentCount(@RequestBody PaperPage paperPage){
        int studentCount= userService.getStudentCount(paperPage);
        return new ServerResponse(0, studentCount,"返回学生数量成功");
    }
}
