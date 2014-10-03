package org.dbModule.dao;

import org.dbModule.domain.Comment;

public interface CommentDao {

	void addComment(Comment commnet);

	void deleteComment(Integer commentId);

	void changeComment(Comment commnet);

	Comment getComment(Integer commentId);

}
