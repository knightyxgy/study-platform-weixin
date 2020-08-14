package com.yxgy.weixin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yxgy
 * @since 2020-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Courses implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    /**
     * 课程名
     */
    private String courseName;

    /**
     * 课程分类id
     */
    private String typeId;

    /**
     * 0-非推荐；1推荐课程
     */
    private Integer command;

    /**
     * 课程状态；0-正常；1-删除
     */
    private Integer status;

    /**
     * 作者，发布该课程的用户id
     */
    private String userId;

    /**
     * 课程描述
     */
    private String courseDesc;

    /**
     * 喜欢/被收藏数量
     */
    private Integer likeCounts;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 课程封面图，默认使用第一个视频封面
     */
    private String coverPath;


}
