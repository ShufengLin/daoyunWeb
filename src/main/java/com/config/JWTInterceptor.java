package com.config;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.exception.CustomizedException;
import com.utils.ServerResponse;
import com.utils.token.JWTUtils;
import com.utils.token.JedisUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.Jedis;


@Component
public class JWTInterceptor implements HandlerInterceptor {

    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub

    }

    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub

    }


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws IOException {
        String token = request.getHeader("token");
        if (token == null || token.equals("")) {
            returnResponse(response, -2, "没有身份令牌，请重新登录");
            return false;
        }
        try {
            Map<String, Claim> map = JWTUtils.verifyToken(token);
            if (map == null) {
                returnResponse(response, -2, "无效的身份令牌");
                return false;
            }
            String localToken = JedisUtils.getToken(map.get("userId").asInt().toString());//userId的类型 jwt的claim是int，jedis是string
            /** 您的处理逻辑 */
            if (localToken == null || localToken.equals("")) {
                returnResponse(response, -2, "身份令牌已失效，请重新登录");
                return false;
            } else if (!token.equals(localToken)) {
                returnResponse(response, -2, "身份令牌不符");
                return false;
            } else {
                //returnResponse(response, 0, "验证成功");
                return true;
            }
        } catch (Exception e) {
            returnResponse(response, -2, "无效的身份令牌");
            return false;
        }
    }

    private void returnResponse(HttpServletResponse response, int code, String result) throws IOException {
        OutputStream out = null;
        try {
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/json");
            Map<String, Object> map = new HashMap<>();
            map.put("code", code);
            map.put("msg", result);
            out = response.getOutputStream();
            out.write(JSONObject.toJSONString(map, SerializerFeature.WriteMapNullValue).getBytes("utf-8"));
            out.flush();
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }


}