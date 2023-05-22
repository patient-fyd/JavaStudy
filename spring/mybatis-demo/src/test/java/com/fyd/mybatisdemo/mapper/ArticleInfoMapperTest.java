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

    @Test
    void addGetId() {
        ArticleInfo articleInfo = new ArticleInfo();
        articleInfo.setTitle("测试文章2，返回自增id");
        articleInfo.setContent("设置xml中的useGeneratedKeys和keyProperty属性，可以返回自增id");
        articleInfo.setUid(1);
        int result = articleInfoMapper.addGetId(articleInfo);
        System.out.println("添加结果" + result + "，返回自增id：" + articleInfo.getId());
    }

    @Test
    void deleteArticleById() {
        int result = articleInfoMapper.deleteArticleById(2);
        System.out.println("删除结果" + result);
    }

    @Test
    void updateTitle() {
        int result = articleInfoMapper.updateTitle(3, "修改标题");
        System.out.println("修改结果" + result);
    }
}