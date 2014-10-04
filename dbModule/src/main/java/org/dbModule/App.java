package org.dbModule;

import org.dbModule.dao.UserDao;
import org.dbModule.domain.Role;
import org.dbModule.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
	ApplicationContext context = new ClassPathXmlApplicationContext("dbContext.xml");
        System.out.println( "Initialize context!" );
	System.out.println("success");
	System.out.println();
	System.out.println();
	User test = new User("test2","test2","test2","test2", Role.MANAGER);
	UserDao userDao = context.getBean("userDao", UserDao.class);
	userDao.addUser(test);
	test = userDao.getUser(1);
	System.out.println("id: " + test.getId() + " name: " + test.getName());
    }
}