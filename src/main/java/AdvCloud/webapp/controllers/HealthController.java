package AdvCloud.webapp.controllers;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import AdvCloud.webapp.model.*;


@RestController
@RequestMapping("/v1/health-check")
public class HealthController {

    @GetMapping
    public ResponseEntity<HealthStatus> getHealthCheck(){
        HealthStatus status = new HealthStatus();
        status.setStatus(200);
        status.setMessage("Success");
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

}


