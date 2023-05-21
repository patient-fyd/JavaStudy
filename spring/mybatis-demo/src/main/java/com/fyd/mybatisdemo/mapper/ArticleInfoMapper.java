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
}
