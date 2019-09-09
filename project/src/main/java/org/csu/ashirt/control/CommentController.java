package org.csu.ashirt.control;

import org.csu.ashirt.domain.Account;
import org.csu.ashirt.domain.Comments;
import org.csu.ashirt.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
public class CommentController {
    @Resource
    private CommentService commentService;

    @Autowired
    HttpServletRequest request;

    // 获取当前用户的评论
    @PostMapping("getCommentsOfCurrentUser")
    public Map<String, Object> getCommentsOfCurrentUser(@RequestParam(value="limit") Integer limit,
                                                        @RequestParam(value="offset") Integer offset){
        Account account = (Account) request.getSession().getAttribute("account");
        return commentService.getCommentsByUserId(offset, limit, account.getUserId());
    }

    // 根据productId获取评论
    @PostMapping("getCommentsByProductId")
    public Map<String, Object> getCommentsByProductId(@RequestParam("productId") int productId,
                                                 @RequestParam(value="limit") Integer limit,
                                                 @RequestParam(value="offset") Integer offset){
        return commentService.getCommentsByProductId(offset, limit, productId);
    }

    // 当前用户发表评论
    @PostMapping("insertComments")
    public int insertComments(@RequestBody Comments comments){
        return commentService.insertComments(comments);
    }
}

