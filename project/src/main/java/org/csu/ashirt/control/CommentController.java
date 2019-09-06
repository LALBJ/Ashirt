package org.csu.ashirt.control;

import org.csu.ashirt.domain.Comments;
import org.csu.ashirt.service.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CommentController {
    @Resource
    private CommentService commentService;

    // 根据userId获取评论
    @PostMapping("getCommentsByUserId")
    public List<Comments> getCommentsByUserId(@RequestParam("userId") int userId){
        return commentService.getCommentsByUserId(userId);
    }

    // 根据productId获取评论
    @PostMapping("getCommentsByProductId")
    public List<Comments> getCommentsByProductId(@RequestParam("productId") int productId){
        return commentService.getCommentsByProductId(productId);
    }

    // 插入一条评论
    @PostMapping("insertComments")
    public int insertComments(@RequestBody Comments comments){
        return commentService.insertComments(comments);
    }
}

