package org.serviceModule.service;


import org.dbModule.domain.Comment;

public interface CommentService {
    void addComment(Comment comment);

    void deleteComment(Integer commentId);

    void changeComment(Comment comment);

    Comment getComment(Integer commentId);
}
