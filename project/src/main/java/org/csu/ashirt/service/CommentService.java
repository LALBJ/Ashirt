package org.csu.ashirt.service;

import org.csu.ashirt.domain.Comments;
import org.springframework.transaction.annotation.Transactional;

public interface CommentService {
    public Comments getCommentsByUserId(int userId);

    public Comments getCommentsByProductId(int productId);

    @Transactional
    public void insertComments(Comments comments);
}
