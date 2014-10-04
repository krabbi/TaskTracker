package org.dbModule.dao;

import org.dbModule.domain.Comment;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Repository(value = "commentDao")
@Transactional(propagation = Propagation.MANDATORY)
public class CommentDaoImpl implements CommentDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void addComment(Comment comment) {
	Session session = sessionFactory.getCurrentSession();
	session.save(comment);
    }

    @Override
    public void deleteComment(Integer commentId) {
	Comment comment = getComment(commentId);
	if(comment != null){
	    Session session = sessionFactory.getCurrentSession();
	    session.delete(comment);
	}
    }

    @Override
    public void changeComment(Comment comment) {
	Session session = sessionFactory.getCurrentSession();
	session.update(comment);
    }

    @Override
    public Comment getComment(Integer commentId) {
	Session session = sessionFactory.getCurrentSession();
	Comment comment = (Comment)session.get(Comment.class, commentId);
	return comment;
    }
}
