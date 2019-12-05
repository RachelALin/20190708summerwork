package com.ctgu.controller;


import com.ctgu.pojo.TbAuthor;
import com.ctgu.pojo.TbBlog;
import com.ctgu.pojo.TbComment;
import com.ctgu.service.TbAuthorService;
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
 * @date 2019/8/2
 * @time 15:09
 */
@Controller
public class TbAuthorController {

    @Autowired
    private TbAuthorService tbAuthorService;
    @Autowired
    private TbBlogService tbBlogService;
    @Autowired
    private TbCommentService tbCommentService;

    @RequestMapping(value = "/TbAuthorselectAll")
    public String selectTbAuthorAll(Model model) {
        List<TbAuthor> talist = tbAuthorService.selectTbAuthorAll();
        model.addAttribute("talist", talist);
        return "list";
    }
    @RequestMapping(value = "/updateTbAuthorById",method = RequestMethod.GET)
    public String updateTbAuthorById(@RequestParam("id") Integer id, Model model){
        TbAuthor tbAuthor =tbAuthorService.selectTbAuthorById(id);
        model.addAttribute("tbAuthor",tbAuthor);
        return "talist";
    }

    @RequestMapping(value = "/updateTbAuthorById",method = RequestMethod.POST)
    public String updateTbAuthorById(TbAuthor tbAuthor, Model model) {
        if (tbAuthorService.updateTbAuthorById(tbAuthor)) {
            return "redirect:/TbAuthorselectAll";
        } else {
            model.addAttribute("tbAuthor", tbAuthor);
            return "list";
        }
    }

    @RequestMapping(value = "/deleteTbAuthorById",method = RequestMethod.GET)
    public String deleteTbAuthorById(@RequestParam("id") Integer id, Model model){

        List<TbBlog> blogList = tbBlogService.selectTbBlogById(id);
        for (TbBlog tbBlog : blogList) {
            List<TbComment> commentList = tbCommentService.selectTbCommentById(tbBlog.getId());
            for (TbComment tbComment : commentList) {
                tbCommentService.deleteByPrimaryKey(tbComment.getId());
            }
            tbBlogService.deleteByPrimaryKey(tbBlog.getId());
        }

        tbAuthorService.deleteByPrimaryKey(id);

        return "redirect:/TbAuthorselectAll？id=" + id;

    }




}

