package com.config;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utils.ServerResponse;
import com.utils.token.JedisUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.Jedis;


@Component
public class JWTInterceptor implements HandlerInterceptor{

    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub

    }

    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub

    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws IOException {
        String userId = request.getHeader("userId");
        String token = request.getHeader("token");
        //Jedis jedis = JedisUtils.getToken(userId);
        /** 您的处理逻辑 */


        return false;
    }
    private ServerResponse returnErrorResponse(HttpServletResponse response, String result) {
        return new ServerResponse(0,result);
    }


}