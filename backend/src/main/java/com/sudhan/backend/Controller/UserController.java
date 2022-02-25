package com.sudhan.backend.Controller;

import com.sudhan.backend.Entity.Users;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("")
    private boolean submitUser(@RequestBody Users users){
        return true;
    }
    @GetMapping("/{userid}")
    private Users getUserDetails(@PathVariable("userid") String userId){
        return new Users();
    }
}
