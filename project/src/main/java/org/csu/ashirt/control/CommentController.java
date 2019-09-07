package org.csu.ashirt.control;

import org.csu.ashirt.domain.Account;
import org.csu.ashirt.domain.Comments;
import org.csu.ashirt.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class CommentController {
    @Resource
    private CommentService commentService;

    @Autowired
    HttpServletRequest request;

    // 获取当前用户的评论
    @PostMapping("getCommentsOfCurrentUser")
    public List<Comments> getCommentsOfCurrentUser(){
        Account account = (Account) request.getSession().getAttribute("account");
        return commentService.getCommentsByUserId(account.getUserId());
    }

    // 根据productId获取评论
    @PostMapping("getCommentsByProductId")
    public List<Comments> getCommentsByProductId(@RequestParam("productId") int productId){
        return commentService.getCommentsByProductId(productId);
    }

    // 当前用户发表评论
    @PostMapping("insertComments")
    public int insertComments(@RequestBody Comments comments){
        return commentService.insertComments(comments);
    }
}

