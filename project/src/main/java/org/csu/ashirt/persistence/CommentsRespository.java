package org.csu.ashirt.persistence;

import org.csu.ashirt.domain.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentsRespository extends JpaRepository<Comments, Integer> {
    public List<Comments> findCommentsByUserId(int userId);

    public List<Comments> findCommentsByProductId(int productId);

}
