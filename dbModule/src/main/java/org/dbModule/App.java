package org.dbModule;

import org.dbModule.dao.ProjectDao;
import org.dbModule.dao.UserDao;
import org.dbModule.domain.Project;
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
	
	Project project = new Project();
	Project project2 = new Project();
	Project project3 = new Project();
	Project project4 = new Project();
	project.setName("First Project");
	project2.setName("Second Project");
	project3.setName("Third Project");
	project4.setName("Fourth Project");
	ProjectDao projectDao = context.getBean("projectDao", ProjectDao.class);
	projectDao.addProject(project);
	projectDao.addProject(project2);
	projectDao.addProject(project3);
	projectDao.addProject(project4);
	
	project = projectDao.getProject(4);
	

	User test = new User("test2","test2","test2","test2", Role.MANAGER);
	UserDao userDao = context.getBean("userDao", UserDao.class);
	userDao.addUser(test);
	test = userDao.getUser(1);
	System.out.println("id: " + test.getId() + " name: " + test.getName());
    }
}