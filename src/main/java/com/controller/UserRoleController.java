package com.controller;

import com.service.UserRoleService;
import com.utils.PaperPage;
import com.utils.ServerResponse;
import com.utils.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/userRole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @ResponseBody
    @PostMapping("/getUserRoleByPage")
    public Map<String, Object> getUserRoleByPage(@RequestBody PaperPage paperPage){
        Map<String, Object> map= userRoleService.getUserRoleByPage(paperPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getUserRoleCount")
    public ServerResponse getUserRoleCount(@RequestBody PaperPage paperPage){
        int userRoleCount = userRoleService.getUserRoleCount(paperPage);
        return new ServerResponse(0, userRoleCount,"返回用户角色数量成功");
    }

    @ResponseBody
    @PostMapping("/getAllRole")
    public Map<String, Object> getAllRole(){
        Map<String, Object> map= userRoleService.getAllRole();
        map.put("code",0);
        map.put("msg","返回全部角色成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/updateUserRoleJson")
    public ServerResponse updateUserRoleJson(@RequestBody UserRole userRole) {
        userRoleService.updateUserRole(userRole);
        return new ServerResponse(0,"修改成功");
    }
}
