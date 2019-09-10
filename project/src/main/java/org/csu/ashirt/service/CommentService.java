package org.csu.ashirt.service;

import org.csu.ashirt.domain.Comments;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface CommentService {
    public Map<String, Object> getCommentsByUserId(int offset, int limit, int userId);

    public Map<String, Object> getCommentsByProductId(int offset, int limit, int productId);

    public List<Comments> getCommentByUserId(int userId);

        @Transactional
    public int insertComments(Comments comments);
}
