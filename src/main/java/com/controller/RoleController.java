package com.controller;

import com.service.RoleService;
import com.utils.PaperPage;
import com.utils.Role;
import com.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ResponseBody
    @PostMapping("/getRoleByPage")
    public Map<String, Object> getRoleByPage(@RequestBody PaperPage paperPage){
        Map<String, Object> map= roleService.getRoleByPage(paperPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getRoleCount")
    public ServerResponse getRoleCount(@RequestBody PaperPage paperPage){
        int roleCount= roleService.getRoleCount(paperPage);
        return new ServerResponse(0, roleCount,"返回角色数量成功");
    }

    @ResponseBody
    @PostMapping("/getAllPermission")
    public Map<String, Object> getAllPermission(){
        Map<String, Object> map= roleService.getAllPermission();

        map.put("code",0);
        map.put("msg","返回全部权限成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/addRoleJson")
    public ServerResponse addCourseJson(@RequestBody Role role) {
        roleService.addRole(role);
        return new ServerResponse(0,"新增成功");
    }

    @ResponseBody
    @PostMapping("/getOwnPermissionByRoleId")
    public Map<String, Object> getOwnPermissionByRoleId(@RequestBody Role role){
        Map<String, Object> map= roleService.getOwnPermissionByRoleId(role);
        map.put("code",0);
        map.put("msg","查询成功");
        return map;
    }
}
