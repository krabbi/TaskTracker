package org.webModule;

import org.dbModule.domain.Developer;
import org.serviceModule.service.DeveloperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DeveloperController {

    @Resource(name = "developerService")
    DeveloperService developerService;


    @RequestMapping(value = "/rest/developers", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Developer> getallDevelopers() {
	return developerService.getAllDevelopers();
    }
}
