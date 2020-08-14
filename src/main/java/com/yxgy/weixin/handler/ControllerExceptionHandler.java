package com.yxgy.weixin.handler;

import com.yxgy.weixin.utils.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    //拦截全局异常处理
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(HttpServletRequest request, Exception e) {
        log.error("Request URL : {}, Exception : {}", request.getRequestURL(), e.getMessage());
        e.printStackTrace();

        Map map = new HashMap();
        map.put("code", ErrorCode.SERVER_ERR.getCode());
        map.put("msg", "服务器发生错误");
        return map;
    }

    /*@ResponseBody
    @ExceptionHandler(value = NotFoundException.class)
    public Map notFoundHandler(HttpServletRequest request, NotFoundException e) {
        //异常写入日志
        log.error("Request URL : {}, Exception : {}", request.getRequestURL(), e.getMessage());

        Map map = new HashMap();
        map.put("code", 100);
        map.put("msg", e.getMessage());
        return map;
    }*/
}
