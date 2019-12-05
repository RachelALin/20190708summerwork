package com.ctgu.dao;

import com.ctgu.pojo.TbComment;

import java.util.List;

public interface TbCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbComment record);

    int insertSelective(TbComment record);

    TbComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbComment record);

    int updateByPrimaryKey(TbComment record);

    List<TbComment> selectTbCommentById(Integer id);

    int deleteTbCommentByBlogId(Integer id);
}