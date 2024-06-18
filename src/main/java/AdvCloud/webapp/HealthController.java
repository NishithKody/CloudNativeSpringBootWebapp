package AdvCloud.webapp;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/health")
public class HealthController {

    @GetMapping
    public String getHealthCheck(){
        return "200";
    }

}
