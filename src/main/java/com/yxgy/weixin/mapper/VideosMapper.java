package com.yxgy.weixin.mapper;

import com.yxgy.weixin.entity.Videos;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yxgy.weixin.entity.vo.VideosVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 视频信息表 Mapper 接口
 * </p>
 *
 * @author yxgy
 * @since 2020-08-14
 */
@Mapper
public interface VideosMapper extends BaseMapper<Videos> {

    /**
     * @Description: 条件查询所有视频列表
     */
    /*@Select("<script>select v.*,u.face_image as face_image,u.nickname as nickname from videos v\n" +
            "        left join users u on u.id = v.user_id\n" +
            "        where\n" +
            "        1 = 1\n" +
            "        <if test=\" userId != null and userId != '' \">\n" +
            "            and v.user_id = #{userId}\n" +
            "        </if>\n" +
            "        and v.course_id = #{courseId}\n" +
            "        and v.status = 1\n" +
            "        and deleted != 2\n" +
            "        order by v.create_time desc</script>")*/
    List<VideosVO> selectAllVideosByCourse(@Param("userId") String userId,
                                           @Param("courseId") String courseId);

}
