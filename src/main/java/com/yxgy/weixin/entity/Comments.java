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
 * 课程评论表
 * </p>
 *
 * @author yxgy
 * @since 2020-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    private String fatherCommentId;

    private String toUserId;

    /**
     * 视频id
     */
    private String videoId;

    /**
     * 留言者，评论的用户id
     */
    private String fromUserId;

    /**
     * 评论内容
     */
    private String comment;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


}
