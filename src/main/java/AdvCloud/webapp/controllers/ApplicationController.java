package AdvCloud.webapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import AdvCloud.webapp.service.ApplicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import AdvCloud.webapp.dto.ApplicationDTO;
import AdvCloud.webapp.model.Application;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/v1/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService service;
    
    @GetMapping
    public List<Application> getAllApplications() {
        return service.getAllApplications();
    }

    @PostMapping
    public Application createApplication(@RequestBody ApplicationDTO applicationDTO) {
        Application application = new Application();
        System.out.println(applicationDTO.GetTitle());
        application.SetTitle(applicationDTO.GetTitle());
        application.SetCompany(applicationDTO.GetCompany());
        application.SetDescription(applicationDTO.GetDescription());
        application.SetLocation(applicationDTO.GetLocation());
        return service.saveApplication(application);
    }
    
    
}
