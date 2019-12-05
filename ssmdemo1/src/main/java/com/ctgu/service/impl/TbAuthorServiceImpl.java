package com.ctgu.service.impl;

import com.ctgu.dao.TbAuthorMapper;

import com.ctgu.pojo.TbAuthor;
import com.ctgu.service.TbAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.service.impl
 * @date 2019/8/2
 * @time 9:18
 */
@Service("tbAuthorService")
public class TbAuthorServiceImpl implements TbAuthorService {
    @Autowired
    private TbAuthorMapper tbAuthorMapper;

    @Override
    public List<TbAuthor> selectTbAuthorAll() {
        return  tbAuthorMapper.selectTbAuthorAll();
    }

    @Override
    public TbAuthor selectTbAuthorById(Integer id) {
        return tbAuthorMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateTbAuthorById(TbAuthor tbAuthor) {
        int update = tbAuthorMapper.updateTbAuthorById(tbAuthor);
        if(update != 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tbAuthorMapper.deleteByPrimaryKey(id);
    }



}
