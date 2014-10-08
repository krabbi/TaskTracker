package org.webModule;

import java.util.List;

import javax.annotation.Resource;

import org.dbModule.domain.Project;
import org.dbModule.domain.Task;
import org.serviceModule.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value = "projectController")
public class ProjectController {
	
	@Resource(name = "projectService")	
	private ProjectService projectService;
	
	@RequestMapping(value = "/rest/projects", method = RequestMethod.GET)
    public @ResponseBody List<Project> getAllProjects(){
		List<Project> projectList = projectService.getAllProjects();
		for(Project project: projectList){
			project.setTaskList(null);
		}
	return projectList;
    }
	
	@RequestMapping(value = "/rest/project/{projectId}", method = RequestMethod.GET)
    public @ResponseBody Project getProject(@PathVariable String projectId){
		Integer id = null;
		try {
			id = Integer.parseInt(projectId);
		} catch (NumberFormatException e) {
			return null;
		}
		return projectService.getInitializedProject(id);
    }

}
