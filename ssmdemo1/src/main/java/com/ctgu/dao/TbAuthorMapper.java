package com.ctgu.dao;

import com.ctgu.pojo.TbAuthor;
import com.ctgu.pojo.TbBlog;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TbAuthorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbAuthor record);

    int insertSelective(TbAuthor record);

    TbAuthor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbAuthor record);

    int updateByPrimaryKey(TbAuthor record);

    List<TbAuthor> selectTbAuthorAll();

    int updateTbAuthorById(TbAuthor tbAuthor);
}