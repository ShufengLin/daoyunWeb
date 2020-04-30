package com.controller;


import com.exception.CustomizedException;
import com.service.UserService;
import com.utils.ServerResponse;
import com.utils.User;
import com.utils.token.JWTUtils;
import com.utils.token.JedisUtils;
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
    public ServerResponse checkLogin(@RequestBody User loginUser)
    {
        String token;
        User userDetail = userService.checkUser(loginUser);
        try{
//            if(JedisUtils.getToken(String.valueOf(userDetail.getUserId())) != null || !JedisUtils.getToken(String.valueOf(userDetail.getUserId())).equals(""))
//            {
//                JedisUtils.deleteToken(String.valueOf(userDetail.getUserId()));//如果是重新登录则删除令牌以更新有效期
//            }
            //JedisUtils.deleteToken("1");
            token = JWTUtils.createToken(userDetail);
            //JedisUtils.setToken(String.valueOf(userDetail.getUserId()),token,7);
        }
        catch(Exception e){
            throw new CustomizedException("生成令牌失败");
        }
        return new ServerResponse(0, userDetail, token,"登录成功");
    }
}
