package com.yxgy.weixin.service.impl;

import com.yxgy.weixin.entity.UsersFans;
import com.yxgy.weixin.mapper.UsersFansMapper;
import com.yxgy.weixin.service.UsersFansService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户粉丝关联关系表 服务实现类
 * </p>
 *
 * @author yxgy
 * @since 2020-08-14
 */
@Service
public class UsersFansServiceImpl extends ServiceImpl<UsersFansMapper, UsersFans> implements UsersFansService {

}
