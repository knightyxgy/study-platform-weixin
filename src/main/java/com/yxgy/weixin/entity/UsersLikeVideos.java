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
 * 用户喜欢的/赞过的视频
 * </p>
 *
 * @author yxgy
 * @since 2020-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UsersLikeVideos implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    /**
     * 用户
     */
    private String userId;

    /**
     * 视频
     */
    private String videoId;

    /**
     * 收藏的时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


}
