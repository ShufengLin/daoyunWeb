package com.config;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;


import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.exception.CustomizedException;
import com.utils.ServerResponse;
import com.utils.token.Decrypt;
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
            returnErrorResponse(response, -1,"没有身份令牌，请重新登录");
            return false;
        }
        Decrypt decrypt = new Decrypt();
        DecodedJWT decodedJWT = decrypt.deToken(token);//token解密id
        String userId = decodedJWT.getClaim("userId").asString();
        String localToken = JedisUtils.getToken(userId);
        /** 您的处理逻辑 */

        if (localToken == null || localToken.equals("")) {
            returnErrorResponse(response,-1, "身份令牌已失效，请重新登录");
            return false;
        } else if (!token.equals(localToken)) {
            returnErrorResponse(response, -1,"身份令牌不符");
            return false;
        } else {

            return true;
        }
    }

    private void returnErrorResponse(HttpServletResponse response,int code, String result) throws IOException {
        OutputStream out = null;
        try{
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/json");
            Map<String, Object> map = new HashMap<>();
            map.put("code",code);
            map.put("errorResponse",result);
            out = response.getOutputStream();
            out.write(JSONObject.toJSONString(map, SerializerFeature.WriteMapNullValue).getBytes("utf-8"));
            out.flush();
        }
        finally{
            if(out != null){
                out.close();
            }
        }

    }


}