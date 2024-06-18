package AdvCloud.webapp.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private List<String> users = new ArrayList<>();

    @GetMapping
    public List<String> getAllUsers(){
        return users;
    }

    @PostMapping
    public String createUser(@RequestBody String user){
        users.add(user);
        return "User created:" + user;
    }

    
    
}
