package com.fyd.mybatisdemo.mapper;

import com.fyd.mybatisdemo.model.ArticleInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/5/21 16:30
 */
@SpringBootTest
class ArticleInfoMapperTest {

    @Autowired
    private ArticleInfoMapper articleInfoMapper;

    @Test
    void addArticle() {
        ArticleInfo articleInfo = new ArticleInfo();
        articleInfo.setTitle("测试文章");
        articleInfo.setContent("测试文章内容");
        articleInfo.setUid(1);
        int result = articleInfoMapper.addArticle(articleInfo);
        System.out.println("添加结果" + result);
    }
}