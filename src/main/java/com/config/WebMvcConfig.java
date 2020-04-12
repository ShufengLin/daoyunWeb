//package com.config;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletResponse;
//import java.io.*;
//
//public class WebMvcConfig implements Filter {
//
//    public void destroy() {
//
//    }
//
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//
//        HttpServletResponse res = (HttpServletResponse) response;
//
////		res.setContentType("text/html;charset=UTF-8");
//
////		Access-Control-Allow-Origin 为允许哪些Origin发起跨域请求. 这里设置为”*”表示允许所有，通常设置为所有并不安全，最好指定一下
//        res.setHeader("Access-Control-Allow-Origin", "*");
//
////		Access-Control-Allow-Methods 为允许请求的方法.
//        res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
//
////		Access-Control-Max-Age 表明在多少毫秒内，不需要再发送预检验请求，可以缓存该结果
//        res.setHeader("Access-Control-Max-Age", "0");
//
////		Access-Control-Allow-Headers 表明它允许跨域请求包含content-type头，这里设置的x-requested-with ，表示ajax请求
//        res.setHeader("Access-Control-Allow-Headers",
//                "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
//
//        res.setHeader("Access-Control-Allow-Credentials", "true");
//
//        res.setHeader("XDomainRequestAllowed", "1");
//
//        chain.doFilter(request, response);
//    }
//
//    public void init(FilterConfig arg0) throws ServletException {
//
//    }
//
//}