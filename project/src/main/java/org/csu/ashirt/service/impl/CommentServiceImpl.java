package org.csu.ashirt.service.impl;

import org.csu.ashirt.Utils.ShowUtils;
import org.csu.ashirt.domain.Comments;
import org.csu.ashirt.persistence.CommentsRespository;
import org.csu.ashirt.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentsRespository commentsRespository;

    @Override
    public Map<String, Object> getCommentsByUserId(int offset, int limit, int userId) {
        List<Comments> commentsList = commentsRespository.findCommentsByUserId(userId);
        return ShowUtils.CommentsPageShow(offset, limit, commentsList);
    }

    @Override
    public Map<String, Object> getCommentsByProductId(int offset, int limit, int productId) {
        List<Comments> commentsList = commentsRespository.findCommentsByProductId(productId);
        return ShowUtils.CommentsPageShow(offset, limit, commentsList);
    }

    @Override
    public int insertComments(Comments comments) {
        try {
            commentsRespository.save(comments);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
