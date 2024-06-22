package AdvCloud.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import AdvCloud.webapp.model.Application;
import AdvCloud.webapp.repository.ApplicationRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository repository;

    public List<Application> getAllApplications(){
        return repository.findAll();
    }

    public Optional<Application> getApplicationById(Long id){
        return repository.findById(id);
    }

    public Application saveApplication(Application application){
        return repository.save(application);
    }

    public void deleteApplication(Long id){
        repository.deleteById(id);
    }

}
