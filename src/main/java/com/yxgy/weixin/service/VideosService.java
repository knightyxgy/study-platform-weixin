package com.yxgy.weixin.service;

import com.yxgy.weixin.entity.Videos;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yxgy.weixin.utils.PagedResult;

/**
 * <p>
 * 视频信息表 服务类
 * </p>
 *
 * @author yxgy
 * @since 2020-08-14
 */
public interface VideosService extends IService<Videos> {

    PagedResult getAllVideos(Integer page, Integer pageSize, String courseId);

}
