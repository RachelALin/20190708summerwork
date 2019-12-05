package com.ctgu.dao;

import com.ctgu.pojo.TbAuthor;
import com.ctgu.pojo.TbBlog;

import java.util.List;

public interface TbBlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbBlog record);

    int insertSelective(TbBlog record);

    TbBlog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbBlog record);

    int updateByPrimaryKey(TbBlog record);

    List<TbBlog> selectTbBlogAll();

    List<TbBlog> selectTbBlogById(Integer author_id);

    int deleteTbBlogByAuthorId(Integer id);
}