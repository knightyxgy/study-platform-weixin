package com.yxgy.weixin.service.impl;

import com.yxgy.weixin.entity.Users;
import com.yxgy.weixin.mapper.UsersMapper;
import com.yxgy.weixin.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yxgy
 * @since 2020-08-14
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
