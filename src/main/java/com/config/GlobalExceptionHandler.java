package com.config;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.utils.ServerResponse;
import com.exception.CustomizedException;

@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 全局异常处理
     *
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(CustomizedException.class)
    public ServerResponse handlerException(Exception e) {
        return new ServerResponse(-1, e.getMessage());
    }
}