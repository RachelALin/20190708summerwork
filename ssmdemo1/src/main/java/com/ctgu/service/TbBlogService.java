package com.ctgu.service;

import com.ctgu.pojo.TbBlog;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.service
 * @date 2019/8/2
 * @time 16:21
 */
public interface TbBlogService {
    List<TbBlog> selectTbBlogAll();

    List<TbBlog> selectTbBlogById(Integer id);

    int deleteByPrimaryKey(Integer id);

    int deleteTbBlogByAuthorId(Integer id);

    TbBlog selectByPrimaryKey(Integer id);
}
