package com.fyd.mybatisdemo.mapper;

import com.fyd.mybatisdemo.model.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/5/21 15:08
 */
@Mapper
public interface ArticleInfoMapper {
    /**
     * 添加文章
     */
    public int addArticle(ArticleInfo articleInfo);

    /**
     * 添加文章并返回自增id
     */
    public int addGetId(ArticleInfo articleInfo);

    /**
     * 根据id删除文章
     */
    public int deleteArticleById(Integer id);

    /**
     * 修改标题
     */
    public int updateTitle(Integer id, String title);
}
