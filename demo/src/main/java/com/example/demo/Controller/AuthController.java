package com.example.demo.Controller;


import com.example.demo.Service.UserService;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AuthController {  // в контролерах мы обрабатываем запросы

     private UserService userService;

    @GetMapping("/login2")
    public String login(){
        return "login2"; // возвращаем название страницы html
    }

    @PostMapping
    public String addUser(User user, Model model){   // модель взаимодействует с памятью/бд
        model.addAttribute("userName",user.getUsername());
        return "user";
    }
}
