package org.csu.ashirt.service.impl;

import org.csu.ashirt.domain.Comments;
import org.csu.ashirt.persistence.CommentsRespository;
import org.csu.ashirt.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentsRespository commentsRespository;

    @Override
    public List<Comments> getCommentsByUserId(int userId) {
        return commentsRespository.findCommentsByUserId(userId);
    }

    @Override
    public List<Comments> getCommentsByProductId(int productId) {
        return commentsRespository.findCommentsByProductId(productId);
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
