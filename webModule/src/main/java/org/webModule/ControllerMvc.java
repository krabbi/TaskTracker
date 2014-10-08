package org.webModule;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerMvc {

    @RequestMapping(value = "/newDeveloper", method = RequestMethod.GET)
    public String newDeveloper() {
	return "index";
    }

    @RequestMapping(value = "/newProject", method = RequestMethod.GET)
    public String newProject() {
	return "index";
    }

    @RequestMapping(value = "/newTask", method = RequestMethod.GET)
    public String newTask() {
	return "index";
    }

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public String projects() {
	return "index";
    }

    @RequestMapping(value = "/task/{taskId}", method = RequestMethod.GET)
    public String task() {
	return "index";
    }

    @RequestMapping(value = "/tasks/{projectId}", method = RequestMethod.GET)
    public String tasks() {
	return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
	return "index";
    }
}
