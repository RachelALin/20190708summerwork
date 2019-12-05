package com.ctgu.service.impl;

import com.ctgu.dao.TbCommentMapper;
import com.ctgu.pojo.TbComment;
import com.ctgu.service.TbCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.service.impl
 * @date 2019/8/2
 * @time 16:25
 */
@Service("tbCommentService")
public class TbCommentServiceImpl implements TbCommentService {

    @Autowired
    private TbCommentMapper tbCommentMapper;

    @Override
    public List<TbComment> selectTbCommentById(Integer id) {
        return  tbCommentMapper.selectTbCommentById(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return  tbCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteTbCommentByBlogId(Integer id) {
        return  tbCommentMapper.deleteTbCommentByBlogId(id);
    }

    @Override
    public TbComment selectByPrimaryKey(Integer id) {
        return tbCommentMapper.selectByPrimaryKey(id);
    }

}
