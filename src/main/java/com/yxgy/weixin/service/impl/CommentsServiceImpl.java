package com.yxgy.weixin.service.impl;

import com.yxgy.weixin.entity.Comments;
import com.yxgy.weixin.mapper.CommentsMapper;
import com.yxgy.weixin.service.CommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程评论表 服务实现类
 * </p>
 *
 * @author yxgy
 * @since 2020-08-14
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements CommentsService {

}
