package com.ctgu.service.impl;

import com.ctgu.dao.TbBlogMapper;
import com.ctgu.pojo.TbBlog;
import com.ctgu.service.TbBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.service.impl
 * @date 2019/8/2
 * @time 16:25
 */
@Service("tbBlogService")
public class TbBlogServiceImpl implements TbBlogService {

    @Autowired
    private TbBlogMapper tbBlogMapper;

    @Override
    public List<TbBlog> selectTbBlogAll() {
        return  tbBlogMapper.selectTbBlogAll();
    }

    @Override
    public List<TbBlog> selectTbBlogById(Integer id) {
        return  tbBlogMapper.selectTbBlogById(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return  tbBlogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteTbBlogByAuthorId(Integer id) {
        return  tbBlogMapper.deleteTbBlogByAuthorId(id);
    }

    @Override
    public TbBlog selectByPrimaryKey(Integer id) {
        return tbBlogMapper.selectByPrimaryKey(id);
    }

}
