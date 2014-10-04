package org.serviceModule.service;

import org.dbModule.dao.CommentDao;
import org.dbModule.domain.Comment;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Component(value = "commentService")
@Transactional(propagation = Propagation.REQUIRED)
public class CommentServiceImpl implements CommentService {

    @Resource(name = "commentDao")
    private CommentDao commentDao;

    @Override
    public void addComment(Comment comment) {
	commentDao.addComment(comment);
    }

    @Override
    public void deleteComment(Integer commentId) {
	commentDao.deleteComment(commentId);
    }

    @Override
    public void changeComment(Comment comment) {
	commentDao.changeComment(comment);
    }

    @Override
    public Comment getComment(Integer commentId) {
	return commentDao.getComment(commentId);
    }
}
