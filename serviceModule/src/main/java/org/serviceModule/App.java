package org.serviceModule;

import org.dbModule.domain.Role;
import org.dbModule.domain.User;
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
	User user = new User("senior","pomidor","boris","kot", Role.MANAGER);
	UserService userService = context.getBean("userService", UserService.class);
	userService.addUser(user);

	user = userService.getUser(2);
	System.out.println("Id: " + user.getId() + ", Name: " + user.getName());
    }
}
