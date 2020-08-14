package com.yxgy.weixin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxgy.weixin.entity.Videos;
import com.yxgy.weixin.entity.vo.VideosVO;
import com.yxgy.weixin.mapper.VideosMapper;
import com.yxgy.weixin.service.VideosService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxgy.weixin.utils.PagedResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 视频信息表 服务实现类
 * </p>
 *
 * @author yxgy
 * @since 2020-08-14
 */
@Service
public class VideosServiceImpl extends ServiceImpl<VideosMapper, Videos> implements VideosService {

    @Autowired
    private VideosMapper videoMapper;

    @Override
    public PagedResult getAllVideos(Integer page, Integer pageSize, String courseId) {
        PageHelper.startPage(page, pageSize);
        List<VideosVO> list = videoMapper.selectAllVideosByCourse(null, courseId);
        PageInfo<VideosVO> pageList = new PageInfo<>(list);

        PagedResult pagedResult = new PagedResult();
        pagedResult.setPage(page);
        pagedResult.setTotal(pageList.getPages());
        pagedResult.setRows(pageList.getTotal());
        pagedResult.setRecords(list);
        return pagedResult;
    }
}
