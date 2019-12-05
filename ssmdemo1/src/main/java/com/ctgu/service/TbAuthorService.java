package com.ctgu.service;

import com.ctgu.pojo.TbAuthor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.service
 * @date 2019/8/2
 * @time 9:15
 */

public interface TbAuthorService {

    List<TbAuthor> selectTbAuthorAll();

    TbAuthor selectTbAuthorById(Integer id);

    boolean updateTbAuthorById(TbAuthor tbAuthor);

    int deleteByPrimaryKey(Integer id);
}
