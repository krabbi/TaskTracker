package org.dbModule.dao;

import org.dbModule.domain.Comment;

public interface CommentDao {

	void addComment(Comment comment);

	void deleteComment(Integer commentId);

	void changeComment(Comment comment);

	Comment getComment(Integer commentId);

}
