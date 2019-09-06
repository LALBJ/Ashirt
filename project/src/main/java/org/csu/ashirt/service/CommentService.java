package org.csu.ashirt.service;

import org.csu.ashirt.domain.Comments;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CommentService {
    public List<Comments> getCommentsByUserId(int userId);

    public List<Comments> getCommentsByProductId(int productId);

    @Transactional
    public int insertComments(Comments comments);
}
