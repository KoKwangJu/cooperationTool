package com.example.cooperationtool.domain.comment.repository;

import com.example.cooperationtool.domain.comment.entity.Comment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByCardId(Long cardId);
}
