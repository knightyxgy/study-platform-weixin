package com.yxgy.weixin.utils;

import com.alibaba.fastjson.JSONObject;
import com.yxgy.weixin.entity.ResultVO;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 0表示成功状态，错误状态1-用户的错误，2-服务端错误
 */
@Slf4j
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static void interceptorJSON(HttpServletResponse response, Integer code, String msg) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            JSONObject res = new JSONObject();
            res.put("code", code);
            res.put("msg", msg);
            out = response.getWriter();
            out.append(res.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
            log.error("拦截器响应json失败");
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
