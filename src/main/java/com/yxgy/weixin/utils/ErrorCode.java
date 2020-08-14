package com.yxgy.weixin.utils;

public enum ErrorCode {

    //100开头为用户错误
//    EMPTY_ERR("用户名和密码不能为空", 1001),
    USERNAME_OR_PASSWORD_ERR("用户名或密码错误", 1001),
    PARAM_EMPTY_ERR("参数为空", 1002),
    LOGIN_STATUS_ERR("用户未登陆", 1003),
    NO_AUTH_ERR("用户没有管理员权限", 1005),


    //200开头为服务端错误
    SERVER_ERR("服务器异常",2001),
    UPLOAD_ERR("上传视频错误", 2002);

    // 成员变量
    private String name;
    private Integer code;
    // 构造方法
    private ErrorCode(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
}
