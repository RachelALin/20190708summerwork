package com.ctgu.pojo;

import java.util.Date;

public class TbComment {
    private Integer id;

    private String content;

    private Integer blogId;

    private Date commentData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Date getCommentData() {
        return commentData;
    }

    public void setCommentData(Date commentData) {
        this.commentData = commentData;
    }
}