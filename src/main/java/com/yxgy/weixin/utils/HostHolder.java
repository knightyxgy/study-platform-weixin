package com.yxgy.weixin.utils;

import com.yxgy.weixin.entity.Users;
import org.springframework.stereotype.Component;

/**
 * 持有用户信息，类似代替session对象
 */
@Component
public class HostHolder {

    private ThreadLocal<Users> users = new ThreadLocal<>();

    public void setUser(Users user) {
        users.set(user);
    }

    public Users getUser() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }
}
