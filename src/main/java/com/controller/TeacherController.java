package com.controller;

import com.service.UserService;
import com.utils.PaperPage;
import com.utils.ServerResponse;
import com.utils.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @ResponseBody
    @PostMapping("/updateTeacherJson")
    public ServerResponse updateTeacherJson(@RequestBody User user) {
        userService.updateUser(user);
        return new ServerResponse(0,"修改成功");
    }

    @ResponseBody
    @PostMapping("/addTeacherJson")
    public ServerResponse addTeacherJson(@RequestBody User user) {
        userService.addTeacher(user);
        return new ServerResponse(0,"新增成功");
    }

    @ResponseBody
    @PostMapping("/getAllTeacher")
    public ServerResponse getAllTeacher(){
        List<User> teacherList = userService.getAllTeacher();
        return new ServerResponse(0, teacherList,"返回所有老师成功");
    }
}
