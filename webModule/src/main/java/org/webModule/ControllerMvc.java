package org.webModule;

import org.dbModule.domain.Role;
import org.dbModule.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerMvc {

    @RequestMapping("/test")
    public ResponseEntity<User> test(){
	User user = new User("kartoshka","kapitoshka","lepyoshka","totoshka", Role.MANAGER);
	return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @RequestMapping("/test2")
    public @ResponseBody User test2(){
	User user = new User("kartoshka","kapitoshka","lepyoshka","totoshka", Role.MANAGER);
	return user;
    }

    @RequestMapping("/test4")
    public String test3(){
	return "view";
    }

}
