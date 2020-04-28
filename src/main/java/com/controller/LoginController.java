package com.controller;


import com.exception.CustomizedException;
import com.service.UserService;
import com.utils.ServerResponse;
import com.utils.user;
import com.utils.token.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/Login")
public class LoginController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/checkLogin")
    public ServerResponse checkLogin(@RequestBody user loginUser)
    {
        String token;
        user userDetail = userService.checkUser(loginUser);
        try{
            token = JWTUtils.createToken(userDetail);
        }
        catch(Exception e){
            throw new CustomizedException("生成令牌失败");
        }
        return new ServerResponse(0, userDetail, token,"登录成功");
    }
}
