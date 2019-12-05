package com.ctgu.service;

import com.ctgu.pojo.TbComment;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.service
 * @date 2019/8/2
 * @time 16:24
 */
public interface TbCommentService {

    List<TbComment> selectTbCommentById(Integer id);

    int deleteByPrimaryKey(Integer id);

    int deleteTbCommentByBlogId(Integer id);

    TbComment selectByPrimaryKey(Integer id);
}
