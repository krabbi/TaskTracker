package org.serviceModule;

import org.dbModule.dao.ProjectDao;
import org.dbModule.domain.Project;
import org.dbModule.domain.Role;
import org.dbModule.domain.Task;
import org.dbModule.domain.TaskStatus;
import org.dbModule.domain.User;
import org.serviceModule.service.DeveloperService;
import org.serviceModule.service.ProjectService;
import org.serviceModule.service.TaskService;
import org.serviceModule.service.UserService;
import org.serviceModule.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

	ApplicationContext context = new ClassPathXmlApplicationContext("dbContext.xml");
        System.out.println( "Hello World!" );
	System.out.println( );
	System.out.println(  );
	System.out.println(  );
	System.out.println(  );
	System.out.println(  );

	Project project = new Project();
	Project project2 = new Project();
	Project project3 = new Project();
	Project project4 = new Project();
	project.setName("First Project");
	project2.setName("Second Project");
	project3.setName("Third Project");
	project4.setName("Fourth Project");
	ProjectService projectService = context.getBean("projectService", ProjectService.class);
	projectService.addProject(project);
	projectService.addProject(project2);
	projectService.addProject(project3);
	projectService.addProject(project4);
	

	project = projectService.getProject(4);
	System.out.println("Project: " + project.getName());
	System.out.println(  );
	System.out.println(  );
	System.out.println(  );


	DeveloperService developerService = context.getBean("developerService", DeveloperService.class);

	Task task1 = new Task();
	task1.setName("First Task");
	task1.setProject(projectService.getProject(1));
	task1.setDeveloper(developerService.getDeveloper(5));
	task1.setStatus(TaskStatus.OPEN);
	Task task2 = new Task();
	task2.setName("Second Task");
	task2.setProject(projectService.getProject(1));
	task2.setDeveloper(developerService.getDeveloper(5));
	task2.setStatus(TaskStatus.OPEN);
	Task task3 = new Task();
	task3.setName("Third Task");
	task3.setProject(projectService.getProject(1));
	task3.setDeveloper(developerService.getDeveloper(5));
	task3.setStatus(TaskStatus.OPEN);
	Task task4 = new Task();
	task4.setName("Fourth Task");
	task4.setProject(projectService.getProject(1));
	task4.setDeveloper(developerService.getDeveloper(5));
	task4.setStatus(TaskStatus.OPEN);
	
	TaskService taskService = context.getBean("taskService", TaskService.class);
	taskService.addTask(task1);
	taskService.addTask(task2);
	taskService.addTask(task3);
	taskService.addTask(task4);

	User user = new User("senior","pomidor","boris","kot", Role.DEVELOPER);
	UserService userService = context.getBean("userService", UserService.class);
	userService.addUser(user);

//	user = userService.getUser(2);
//	System.out.println("Id: " + user.getId() + ", Name: " + user.getName());
    }
}
