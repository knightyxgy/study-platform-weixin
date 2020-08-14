package com.yxgy.weixin.controller;


import com.yxgy.weixin.entity.ResultVO;
import com.yxgy.weixin.service.VideosService;
import com.yxgy.weixin.utils.PagedResult;
import com.yxgy.weixin.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 视频信息表 前端控制器
 * </p>
 *
 * @author yxgy
 * @since 2020-08-14
 */
@RestController
//@RequestMapping("/weixin/videos")
public class VideosController {

    @Autowired
    private VideosService videoService;

    @GetMapping("/showAll")
    public ResultVO showAll(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5")Integer pageSize, String courseId) {
        PagedResult allVideos = videoService.getAllVideos(page, pageSize, courseId);
        return ResultVOUtil.success(allVideos);
    }

}

