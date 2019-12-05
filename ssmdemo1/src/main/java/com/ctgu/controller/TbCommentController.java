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
 * @time 13:18
 */
@Controller
public class TbCommentController {
    @Autowired
    private TbCommentService tbCommentService;
    @Autowired
    private TbBlogService tbBlogService;
    @RequestMapping(value = "/selectTbCommentById",method = RequestMethod.GET)
    public String selectTbCommentById(@RequestParam("id") Integer id, Model model){
        List<TbComment> tclist = tbCommentService.selectTbCommentById(id);
        model.addAttribute("tclist",tclist);
        return "tclist";
    }

    @RequestMapping(value = "/deleteTbCommentById" ,method = RequestMethod.GET)
    public String deleteTbCommentById(@RequestParam("id") Integer id,Model model){
        TbComment tbComment = tbCommentService.selectByPrimaryKey(id);
        tbCommentService.deleteByPrimaryKey(id);
        return "redirect:/selectTbCommentById?id="+tbComment.getBlogId();
    }

}
