package com.example.projetstage.Controller;

import com.example.projetstage.model.User;
import com.example.projetstage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class Usercontroller {
    UserRepository userRepository;
    @Autowired
    public Usercontroller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @PostMapping("/post")
    public User postuser(@RequestBody User u){
        return userRepository.save(u);
    }
    @PutMapping("/put/{id}")
    public User putuser(@RequestBody User u,@PathVariable Long id ){
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(u.getName());
                    user.setEmail(u.getEmail());
                    user.setPassword(u.getPassword());
                    return userRepository.save(user);
                })
                .orElseGet(()-> userRepository.save(u));
    }



}
