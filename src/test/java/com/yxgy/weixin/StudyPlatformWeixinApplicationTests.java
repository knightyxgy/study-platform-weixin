package com.yxgy.weixin;

import com.yxgy.weixin.entity.Videos;
import com.yxgy.weixin.entity.vo.VideosVO;
import com.yxgy.weixin.mapper.VideosMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudyPlatformWeixinApplicationTests {

    @Autowired
    private VideosMapper videosMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void mapperTest() {
//        List<Videos> all = videosMapper.findAll();
        List<VideosVO> all = videosMapper.selectAllVideosByCourse("200807DATZZ437C0", "1293049664374841345");
        System.out.println(all);
    }
}
