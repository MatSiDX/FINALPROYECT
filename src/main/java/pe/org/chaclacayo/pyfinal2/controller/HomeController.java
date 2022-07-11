package pe.org.chaclacayo.pyfinal2.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {

    @GetMapping("/login")
    public String login(Model model, @AuthenticationPrincipal User user) {
        //model.addAttribute("user", user.getUsername());
        return "login";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("titulo", "Bienvenido a Thymeleaf");
        return "main";
    }

    @GetMapping("/register")
    public String register() {
        return "formRegister";

    }

    @GetMapping("/contrasena")
    public String contrasena() {
        return "contrasena";

    }
}
