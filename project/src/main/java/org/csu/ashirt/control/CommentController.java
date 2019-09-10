package org.csu.ashirt.control;

import com.sun.scenario.effect.Offset;
import org.csu.ashirt.domain.Account;
import org.csu.ashirt.domain.Comments;
import org.csu.ashirt.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.stream.events.Comment;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CommentController {
    @Resource
    private CommentService commentService;

    @Autowired
    HttpServletRequest request;

    // 获取当前用户的评论
    @PostMapping("/getCommentsOfCurrentUser")
    public Map<String, Object> getCommentsOfCurrentUser(@RequestParam(value="limit") Integer limit,
                                                        @RequestParam(value="offset") Integer offset){
        Account account = (Account) request.getSession().getAttribute("account");
        return commentService.getCommentsByUserId(offset, limit, account.getUserId());
    }
    // 获取当前用户的评论
    @GetMapping("/getCommentOfCurrentUser")
    public Map<String, Object> getCommentOfCurrentUser(){
        Account account = (Account) request.getSession().getAttribute("account");
        List<Comments> commentsList = commentService.getCommentByUserId(account.getUserId());
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("commentsList",commentsList);
        return map;
    }

    // 根据productId获取评论
    @PostMapping("getCommentsByProductId")
    public Map<String, Object> getCommentsByProductId(@RequestParam("productId") int productId,
                                                 @RequestParam(value="limit") Integer limit,
                                                 @RequestParam(value="offset") Integer offset){
        return commentService.getCommentsByProductId(offset, limit, productId);
    }

    // 当前用户发表评论
    @PostMapping("/insertComments")
    public int insertComments(@RequestParam("details") String details){
        Account account = (Account) request.getSession().getAttribute("account");
        Date date = new Date();
        Comments comments = new Comments();
        comments.setUserId(account.getUserId());
        Map<String,Object> commentMap = commentService.getCommentsByUserId(0,0,account.getUserId());
        int commentSize = commentMap.size() - 1;
        comments.setDetails(details);
        comments.setTime(date);
        comments.setFloor(commentSize + 1);
        comments.setCommentId(comments.getUserId() + commentSize + 1);
        return commentService.insertComments(comments);
    }
}

