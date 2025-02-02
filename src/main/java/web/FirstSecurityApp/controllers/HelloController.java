package web.FirstSecurityApp.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.FirstSecurityApp.security.PersonDetails;

@Controller
public class HelloController {

    @GetMapping("/")
    public String welcomePage() {
        return "hello";
    }

    @GetMapping("/showUserInfo")
    public String showUserInfo(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();
        model.addAttribute("person", personDetails);
        return "person";
    }
}
