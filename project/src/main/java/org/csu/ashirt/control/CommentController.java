package org.csu.ashirt.control;

import org.csu.ashirt.domain.Comments;
import org.csu.ashirt.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;

    private Comments comments;

}
