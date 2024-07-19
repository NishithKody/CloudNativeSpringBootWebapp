package AdvCloud.webapp.controllers;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import AdvCloud.webapp.model.*;


@RestController
@RequestMapping("/v1")
public class HealthController {

    @GetMapping("/health-check")
    public ResponseEntity<HealthStatus> getHealthCheck(){
        HealthStatus status = new HealthStatus();
        status.setStatus(200);
        status.setMessage("Success");
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @GetMapping("/health-check-ready")
    public ResponseEntity<HealthStatus> getHealthReadinessCheck(){
        HealthStatus status = new HealthStatus();
        boolean isReady = true;
        if(isReady){
            status.setStatus(200);
            status.setMessage("Success");
            return new ResponseEntity<>(status, HttpStatus.OK);
        }
        else{
            status.setStatus(500);
            status.setMessage("NotReady");
            return new ResponseEntity<>(status, HttpStatus.SERVICE_UNAVAILABLE);
        }
        
    }

}


