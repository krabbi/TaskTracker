package org.webModule;

import javax.annotation.Resource;

import org.dbModule.domain.Task;
import org.serviceModule.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value = "taskController")
public class TaskController {

    @Resource(name = "taskService")
    TaskService taskService;

    @RequestMapping(value = "/rest/task/{taskId}", method = RequestMethod.GET)
    public
    @ResponseBody
    Task getTask(@PathVariable String taskId) {
	Integer id;
	try {
	    id = Integer.parseInt(taskId);
	} catch (NumberFormatException e) {
	    return null;
	}
	return taskService.getInitializedTask(id);
    }

    @RequestMapping(value = "/saveTask", method = RequestMethod.POST, consumes =  "application/json")
    public
    @ResponseBody
    String saveTask(@RequestBody Task task) {
	System.out.println("------------------------==================================RABOTAET MUDAK=================================------------------------------");
	taskService.addTask(task);
	return "index";
    }

}
