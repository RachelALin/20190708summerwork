package com.ctgu.controller;

import com.ctgu.pojo.TbBlog;
import com.ctgu.pojo.TbComment;
import com.ctgu.service.TbBlogService;
import com.ctgu.service.TbCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.controller
 * @date 2019/8/3
 * @time 13:14
 */
@Controller
public class TbBlogController {

    @Autowired
    private TbBlogService tbBlogService;
    @Autowired
    private TbCommentService tbCommentService;
    @RequestMapping(value = "/selectTbBlogById",method = RequestMethod.GET)
    public String selectTbBlogById(@RequestParam("id") Integer id, Model model){
        List<TbBlog> tblist = tbBlogService.selectTbBlogById(id);
        model.addAttribute("tblist",tblist);
        return "tblist";
    }

    @RequestMapping(value = "deleteTbBlogById",method = RequestMethod.GET)
    public String deleteTbBlogById(@RequestParam("id") Integer id, Model model){
        TbBlog tbBlog = tbBlogService.selectByPrimaryKey(id);
        List<TbComment> commentList = tbCommentService.selectTbCommentById(id);
//        model.addAttribute("author_id",tbBlog.getAuthorId());
        for(TbComment tbComment: commentList){
            tbCommentService.deleteByPrimaryKey(tbComment.getId());
        }
        tbBlogService.deleteByPrimaryKey(id);
        return "redirect:/selectTbBlogById?id="+tbBlog.getAuthorId();
    }
}
